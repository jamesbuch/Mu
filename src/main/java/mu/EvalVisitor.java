package mu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvalVisitor extends MuBaseVisitor<Value> {

    private boolean isDefiningFunction = false; // Flag to switch off visitor execution

    // symbol table implementing scoped variables
    private SymbolTable symbolTable = new SymbolTable();

    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // Keep open with class stdin and don't close it after reading
    private Scanner stdin = new Scanner(System.in);

    // We need some helpers to set return types of functions. For user defined
    // functions, this is handled in visiting the function definition, but for
    // built-in
    // functions we need to set the return type here when calling the function.
    // We should have a map of built-in functions with their return types, with some
    // reliable way of handling special cases like readln which always returns
    // string but could be cast to integer, float, boolean, or others later if
    // needed.

    private Value readStringInput(String funcName) {
        String input = stdin.nextLine();
        Value value = new Value(input);
        value.setWasFunction(funcName);
        value.type = Value.TYPE.STRING;
        return value;
    }

    private Value readAndParse(String funcName, Function<String, Object> parser, Value.TYPE targetType,
            String errorMessage) {
        String rawInput = stdin.nextLine();
        Object parsedValue;
        try {
            parsedValue = parser.apply(rawInput.trim());
        } catch (RuntimeException ex) {
            throw new RuntimeException(errorMessage);
        }

        Value value = new Value(parsedValue);
        value.setWasFunction(funcName);
        value.type = targetType;
        return value;
    }

    private void ensureArgumentCount(MuParser.Function_callContext ctx, int expected, String functionName) {
        int count = ctx.expr_list() == null ? 0 : ctx.expr_list().expr().size();
        if (count != expected) {
            String message = expected == 1 ? "expects exactly 1 argument" : "expects exactly " + expected + " arguments";
            throw new RuntimeException(functionName + " " + message);
        }
    }

    // assignment/id overrides
    @Override
    public Value visitSimpleAssignment(MuParser.SimpleAssignmentContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        String id = ctx.ID().getText();
        Value newValue = this.visit(ctx.expr());
        Value existingValue = symbolTable.get(id);

        if (existingValue != null) {
            existingValue.updateValue(newValue.getValue());
            return existingValue;
        } else {
            // Existing value was null, means was not found in the symbol table
            // This should really be attempt to assign to non existing variable, right?
            // Because all are declared with types, and only assignments to those
            // variables which already exist should be allowed here
            symbolTable.put(id, newValue);
            return newValue;
        }
    }

    // assignment with type
    @Override
    public Value visitAssignmentWithType(MuParser.AssignmentWithTypeContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        String id = ctx.ID().getText();
        Value newValue = this.visit(ctx.expr());

        // Check only the current scope for existing variable
        // May be null if variable not yet defined
        Value existingValue = symbolTable.getInCurrentScope(id);

        boolean rhsFunctionCall = newValue.wasFunctionCall();

        /*
         * Pull out the function name if the expression was a function call, so we can
         * give better error messages
         */
        String functionName = ctx.expr().getText();
        int parenIndex = functionName.indexOf('(');
        if (parenIndex != -1) {
            functionName = functionName.substring(0, parenIndex);
        }

        String newValueType = ctx.TYPE().getText();

        // Existing value: null, we expect null here if variable not yet defined

        // Check first for special cases of casts like readln returning something
        // other than a string, this is the only type of cast we allow for now

        if (rhsFunctionCall && newValue.type == Value.TYPE.VOID) {
            throw new RuntimeException("Attempting to assign return value of VOID function " +
                    functionName + " to " + id);
        }

        // TODO: Check this for accuracy and completeness
        if (rhsFunctionCall && (functionName.equals("readln") || functionName.equals("input"))) {
            // readln always returns string, so if the variable is not string,
            // we need to attempt a cast
            if (newValueType.equals("integer")) {
                try {
                    Integer intValue = Integer.valueOf(newValue.asString());
                    newValue.updateValue(intValue);
                    newValue.type = Value.TYPE.INT;
                } catch (NumberFormatException nfe) {
                    throw new RuntimeException(
                            "Attempting to assign non-integer value from readln() to integer variable");
                }
            } else if (newValueType.equals("float")) {
                try {
                    Double doubleValue = Double.valueOf(newValue.asString());
                    newValue.updateValue(doubleValue);
                    newValue.type = Value.TYPE.FLOAT;
                } catch (NumberFormatException nfe) {
                    throw new RuntimeException(
                            "Attempting to assign non-floating point number from readln() to float variable");
                }
            } else if (newValueType.equals("boolean")) {
                String boolStr = newValue.asString().toLowerCase();
                if (boolStr.equals("true") || boolStr.equals("false")) {
                    Boolean boolValue = Boolean.valueOf(boolStr);
                    newValue.updateValue(boolValue);
                    newValue.type = Value.TYPE.BOOLEAN;
                } else {
                    throw new RuntimeException(
                            "Attempting to assign non-boolean value from readln() to boolean variable");
                }
            } else if (newValueType.equals("string")) {
                // No cast needed, already string
                newValue.type = Value.TYPE.STRING;
            } else {
                throw new RuntimeException("Unsupported variable type: " + newValueType);
            }
        }

        if (newValue.isNil()) {
            newValue.type = Value.TYPE.NIL;
        }

        // Only throw error if variable already exists in the current scope
        if (existingValue != null) {
            throw new RuntimeException("Variable " + id + " has already been defined");
        }

        symbolTable.put(id, newValue);

        return newValue;
    }

    @Override
    public Value visitIdAtom(MuParser.IdAtomContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        String id = ctx.getText();
        Value value = symbolTable.get(id);

        if (value == null) {
            throw new RuntimeException("no such variable: " + id);
        }

        return value;
    }

    // atom overrides
    @Override
    public Value visitStringAtom(MuParser.StringAtomContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        String str = ctx.getText();

        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");

        Value v = new Value(str);
        v.type = Value.TYPE.STRING;

        return v;
    }

    @Override
    public Value visitDollarStringAtom(MuParser.DollarStringAtomContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        String str = ctx.getText();

        // strip leading dollar sign
        str = str.replace("$", "");

        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");

        // Do string interpolation here
        // If we find #{var} then replace that with the string representation
        // of that variable
        Pattern r = Pattern.compile("(#\\{([a-zA-Z_][a-zA-Z0-9_]*)\\})");
        Matcher m = r.matcher(str);

        while (m.find()) {
            // group 0 the whole string, then group 1 #{varName} then group 2 varName
            String varName = m.group(2);

            Value v = symbolTable.get(varName);
            str = str.replace(m.group(1), v.toString());
            m = r.matcher(str);
        }

        Value v = new Value(str);
        v.type = Value.TYPE.STRING;

        return v;
    }

    @Override
    public Value visitIntegerAtom(MuParser.IntegerAtomContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value v = new Value(Integer.valueOf(ctx.getText()));
        v.type = Value.TYPE.INT;
        return v;
    }

    @Override
    public Value visitFloatAtom(MuParser.FloatAtomContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value v = new Value(Double.valueOf(ctx.getText()));
        v.type = Value.TYPE.FLOAT;
        return v;
    }

    @Override
    public Value visitBooleanAtom(MuParser.BooleanAtomContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value v = new Value(Boolean.valueOf(ctx.getText()));
        v.type = Value.TYPE.BOOLEAN;
        return v;
    }

    @Override
    public Value visitNilAtom(MuParser.NilAtomContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        return new Value(null);
    }

    // expr overrides
    @Override
    public Value visitParExpr(MuParser.ParExprContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        return this.visit(ctx.expr());
    }

    @Override
    public Value visitRegexExpr(MuParser.RegexExprContext ctx) {
        Value v = new Value(new Object());
        v.type = Value.TYPE.BOOLEAN;

        String str = ctx.STRING(0).getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");

        String regexp = ctx.STRING(1).getText();
        // strip quotes
        regexp = regexp.substring(1, regexp.length() - 1).replace("\"\"", "\"");

        boolean match = ctx.REGEX_MATCH() != null ? true : false;
        if (str.matches(regexp)) {
            if (match) {
                v.updateValue(true);
            } else {
                v.updateValue(false);
            }
        } else {
            if (match) {
                v.updateValue(false);
            } else {
                v.updateValue(true);
            }
        }

        return v;
    }

    @Override
    public Value visitUnaryMinusExpr(MuParser.UnaryMinusExprContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value value = this.visit(ctx.expr());
        if (value.type == Value.TYPE.INT) {
            value.updateValue(-value.asInteger());
        }
        if (value.type == Value.TYPE.FLOAT) {
            value.updateValue(-value.asDouble());
        }
        return new Value(value);
    }

    @Override
    public Value visitNotExpr(MuParser.NotExprContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value value = this.visit(ctx.expr());
        if (value.type != Value.TYPE.BOOLEAN) {
            throw new RuntimeException("Value in logical not expresssion must be boolean");
        }
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitMultiplicationExpr(MuParser.MultiplicationExprContext ctx) {

        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case MuParser.MULT:
                if (left.isNumeric() && right.isNumeric()) {
                    if (left.isInteger() && right.isInteger()) {
                        Value v = new Value(left.asInteger() * right.asInteger());
                        v.type = Value.TYPE.INT;
                        return v;
                    } else if (left.isDouble() && right.isDouble()) {
                        Value v = new Value(left.asDouble() * right.asDouble());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    } else if (left.isInteger() && right.isDouble()) {
                        // Value is being promoted to double whatever it is
                        Value v = new Value(left.asInteger() * right.asDouble());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    } else if (left.isDouble() && right.isInteger()) {
                        // Value is being promoted to double whatever it is
                        Value v = new Value(left.asDouble() * right.asInteger());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    }
                } else {
                    throw new RuntimeException("Multiplication of non numeric types");
                }
            case MuParser.DIV:
                if (left.isNumeric() && right.isNumeric()) {
                    if (left.isInteger() && right.isInteger()) {
                        Value v = new Value(left.asInteger() / right.asInteger());
                        v.type = Value.TYPE.INT;
                        return v;
                    } else if (left.isDouble() && right.isDouble()) {
                        Value v = new Value(left.asDouble() / right.asDouble());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    } else if (left.isInteger() && right.isDouble()) {
                        // Value is being promoted to double whatever it is
                        Value v = new Value(left.asInteger() / right.asDouble());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    } else if (left.isDouble() && right.isInteger()) {
                        // Value is being promoted to double whatever it is
                        Value v = new Value(left.asDouble() / right.asInteger());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    }
                } else {
                    throw new RuntimeException("Division of non numeric types");
                }
            case MuParser.MOD:
                if (left.isNumeric() && right.isNumeric()) {
                    if (left.isInteger() && right.isInteger()) {
                        Value v = new Value(left.asInteger() % right.asInteger());
                        v.type = Value.TYPE.INT;
                        return v;
                    } else if (left.isDouble() && right.isDouble()) {
                        Value v = new Value(left.asDouble() % right.asDouble());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    } else if (left.isInteger() && right.isDouble()) {
                        // Value is being promoted to double whatever it is
                        Value v = new Value(left.asInteger() % right.asDouble());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    } else if (left.isDouble() && right.isInteger()) {
                        // Value is being promoted to double whatever it is
                        Value v = new Value(left.asDouble() % right.asInteger());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    }
                } else {
                    throw new RuntimeException("Modulo with non numeric types");
                }
            default:
                throw new RuntimeException("unknown operator: " + MuParser.VOCABULARY.getLiteralName(ctx.op.getType()));
        }
    }

    @Override
    public Value visitAdditiveExpr(MuParser.AdditiveExprContext ctx) {

        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case MuParser.PLUS:
                if (left.isNumeric() && right.isNumeric()) {
                    if (left.isInteger() && right.isInteger()) {
                        Value v = new Value(left.asInteger() + right.asInteger());
                        v.type = Value.TYPE.INT;
                        return v;
                    } else if (left.isDouble() && right.isDouble()) {
                        Value v = new Value(left.asDouble() + right.asDouble());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    } else if (left.isInteger() && right.isDouble()) {
                        // Value is being promoted to double whatever it is
                        Value v = new Value(left.asInteger() + right.asDouble());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    } else if (left.isDouble() && right.isInteger()) {
                        // Value is being promoted to double whatever it is
                        Value v = new Value(left.asDouble() + right.asInteger());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    }
                }
                // Handle string concatenation
                else if (left.isString() && right.isString()) {
                    Value v = new Value(left.asString() + right.asString());
                    v.type = Value.TYPE.STRING;
                    return v;
                } else {
                    throw new RuntimeException("Addition of non numeric incompatible types");
                }
            case MuParser.MINUS:
                if (left.isNumeric() && right.isNumeric()) {
                    if (left.isInteger() && right.isInteger()) {
                        Value v = new Value(left.asInteger() - right.asInteger());
                        v.type = Value.TYPE.INT;
                        return v;
                    } else if (left.isDouble() && right.isDouble()) {
                        Value v = new Value(left.asDouble() - right.asDouble());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    } else if (left.isInteger() && right.isDouble()) {
                        // Value is being promoted to double whatever it is
                        Value v = new Value(left.asInteger() - right.asDouble());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    } else if (left.isDouble() && right.isInteger()) {
                        // Value is being promoted to double whatever it is
                        Value v = new Value(left.asDouble() - right.asInteger());
                        v.type = Value.TYPE.FLOAT;
                        return v;
                    }
                } else {
                    throw new RuntimeException("Subtraction of non numeric types");
                }
            default:
                throw new RuntimeException("unknown operator: " + MuParser.VOCABULARY.getLiteralName(ctx.op.getType()));
        }
    }

    @Override
    public Value visitRelationalExpr(MuParser.RelationalExprContext ctx) {

        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        Value ret = new Value(null);

        switch (ctx.op.getType()) {
            case MuParser.LT:
                if (left.isNumeric() && right.isNumeric()) {
                    if (left.isDouble() && right.isDouble()) {
                        Boolean rc = left.asDouble() < right.asDouble();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isInteger() && right.isInteger()) {
                        Boolean rc = left.asInteger() < right.asInteger();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isInteger() && right.isDouble()) {
                        Boolean rc = left.asInteger() < right.asDouble();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isDouble() && right.isInteger()) {
                        Boolean rc = left.asDouble() < right.asInteger();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    }
                } else {
                    throw new RuntimeException(
                            "Values to be compared in relational expression must be numeric types");
                }
            case MuParser.LTEQ:
                if (left.isNumeric() && right.isNumeric()) {
                    if (left.isDouble() && right.isDouble()) {
                        Boolean rc = left.asDouble() <= right.asDouble();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isInteger() && right.isInteger()) {
                        Boolean rc = left.asInteger() <= right.asInteger();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isInteger() && right.isDouble()) {
                        Boolean rc = left.asInteger() <= right.asDouble();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isDouble() && right.isInteger()) {
                        Boolean rc = left.asDouble() <= right.asInteger();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    }
                } else {
                    throw new RuntimeException(
                            "Values to be compared in relational expression must be numeric types");
                }
            case MuParser.GT:
                if (left.isNumeric() && right.isNumeric()) {
                    if (left.isDouble() && right.isDouble()) {
                        Boolean rc = left.asDouble() > right.asDouble();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isInteger() && right.isInteger()) {
                        Boolean rc = left.asInteger() > right.asInteger();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isInteger() && right.isDouble()) {
                        Boolean rc = left.asInteger() > right.asDouble();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isDouble() && right.isInteger()) {
                        Boolean rc = left.asDouble() > right.asInteger();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    }
                } else {
                    throw new RuntimeException(
                            "Values to be compared in relational expression must be numeric types");
                }
            case MuParser.GTEQ:
                if (left.isNumeric() && right.isNumeric()) {
                    if (left.isDouble() && right.isDouble()) {
                        Boolean rc = left.asDouble() >= right.asDouble();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isInteger() && right.isInteger()) {
                        Boolean rc = left.asInteger() >= right.asInteger();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isInteger() && right.isDouble()) {
                        Boolean rc = left.asInteger() >= right.asDouble();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    } else if (left.isDouble() && right.isInteger()) {
                        Boolean rc = left.asDouble() >= right.asInteger();
                        ret.updateValue(rc);
                        ret.type = Value.TYPE.BOOLEAN;
                        return ret;
                    }
                } else {
                    throw new RuntimeException(
                            "Values to be compared in relational expression must be numeric types");
                }
            default:
                throw new RuntimeException("unknown operator: " + MuParser.VOCABULARY.getLiteralName(ctx.op.getType()));
        }
    }

    @Override
    public Value visitEqualityExpr(MuParser.EqualityExprContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case MuParser.EQ:
                return left.isDouble() && right.isDouble()
                        ? new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE)
                        : new Value(left.equals(right));
            case MuParser.NEQ:
                return left.isDouble() && right.isDouble()
                        ? new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE)
                        : new Value(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + MuParser.VOCABULARY.getLiteralName(ctx.op.getType()));
        }
    }

    @Override
    public Value visitAndExpr(MuParser.AndExprContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        if (left.type != Value.TYPE.BOOLEAN || right.type != Value.TYPE.BOOLEAN) {
            throw new RuntimeException("Values in AND expression must be boolean");
        }
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(MuParser.OrExprContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        if (left.type != Value.TYPE.BOOLEAN || right.type != Value.TYPE.BOOLEAN) {
            throw new RuntimeException("Values in OR expression must be boolean");
        }
        return new Value(left.asBoolean() || right.asBoolean());
    }

    // if override
    @Override
    public Value visitIf_stat(MuParser.If_statContext ctx) {

        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value v = Value.VOID;
        v.type = Value.TYPE.NIL;

        // Evaluate the main condition
        Value condition = visit(ctx.expr(0));
        if (condition.asBoolean()) {
            symbolTable.pushScope();
            visit(ctx.stat_block(0));
            symbolTable.popScope();

            return v;
        }

        // Check for else-if conditions
        for (int i = 1; i < ctx.expr().size(); i++) {
            condition = visit(ctx.expr(i));
            if (condition.asBoolean()) {
                symbolTable.pushScope();
                visit(ctx.stat_block(i));
                symbolTable.popScope();

                return v;
            }
        }

        // Check for else condition
        if (ctx.stat_block().size() > ctx.expr().size()) {
            symbolTable.pushScope();
            visit(ctx.stat_block(ctx.stat_block().size() - 1));
            symbolTable.popScope();
        }

        return v;
    }

    @Override
    public Value visitFuncCallAtom(MuParser.FuncCallAtomContext ctx) {
        if (isDefiningFunction) {
            return Value.VOID;
        }

        return visit(ctx.function_call()); // This delegates to visitFunction_call
    }

    @Override
    public Value visitFunction_call(MuParser.Function_callContext ctx) {
        String funcName = ctx.ID().getText();

        // Check for built-in functions first
        // If not found, then check for user-defined functions
        // ID when used in assignment context, like x = func() is
        // assignmentWithType or simpleAssignment

        // Handle built-in functions
        switch (funcName) {
            case "println":
                ensureArgumentCount(ctx, 1, "println");
                Value printValue = visit(ctx.expr_list().expr(0));
                System.out.println(printValue);
                return Value.VOID;

            case "print":
                ensureArgumentCount(ctx, 1, "print");
                Value printVal = visit(ctx.expr_list().expr(0));
                System.out.print(printVal);
                return Value.VOID;

            case "readln":
                ensureArgumentCount(ctx, 0, "readln");
                return readStringInput(funcName);

            case "input":
                ensureArgumentCount(ctx, 1, "input");
                Value prompt = visit(ctx.expr_list().expr(0));
                System.out.print(prompt);
                return readStringInput(funcName);

            case "readint":
                ensureArgumentCount(ctx, 0, "readint");
                return readAndParse(funcName, Integer::valueOf, Value.TYPE.INT,
                        "readint expects an integer value");

            case "readfloat":
                ensureArgumentCount(ctx, 0, "readfloat");
                return readAndParse(funcName, Double::valueOf, Value.TYPE.FLOAT,
                        "readfloat expects a floating point value");

            case "readbool":
                ensureArgumentCount(ctx, 0, "readbool");
                return readAndParse(funcName, input -> {
                    String normalized = input.toLowerCase();
                    if (normalized.equals("true") || normalized.equals("false")) {
                        return Boolean.valueOf(normalized);
                    }
                    throw new IllegalArgumentException();
                }, Value.TYPE.BOOLEAN, "readbool expects 'true' or 'false'");

            case "len":
                ensureArgumentCount(ctx, 1, "len");
                Value lenValue = visit(ctx.expr_list().expr(0));
                if (!lenValue.isString()) {
                    throw new RuntimeException("len expects a string argument");
                }
                Value length = new Value(lenValue.asString().length());
                length.type = Value.TYPE.INT;
                return length;

            case "upper":
                ensureArgumentCount(ctx, 1, "upper");
                Value upperValue = visit(ctx.expr_list().expr(0));
                if (!upperValue.isString()) {
                    throw new RuntimeException("upper expects a string argument");
                }
                Value upperResult = new Value(upperValue.asString().toUpperCase());
                upperResult.type = Value.TYPE.STRING;
                return upperResult;

            case "lower":
                ensureArgumentCount(ctx, 1, "lower");
                Value lowerValue = visit(ctx.expr_list().expr(0));
                if (!lowerValue.isString()) {
                    throw new RuntimeException("lower expects a string argument");
                }
                Value lowerResult = new Value(lowerValue.asString().toLowerCase());
                lowerResult.type = Value.TYPE.STRING;
                return lowerResult;

            case "abs":
                ensureArgumentCount(ctx, 1, "abs");
                Value absValue = visit(ctx.expr_list().expr(0));
                if (!absValue.isNumeric()) {
                    throw new RuntimeException("abs expects a numeric argument");
                }
                if (absValue.isDouble()) {
                    Value absResult = new Value(Math.abs(absValue.asDouble()));
                    absResult.type = Value.TYPE.FLOAT;
                    return absResult;
                }

                Value absResult = new Value(Math.abs(absValue.asInteger()));
                absResult.type = Value.TYPE.INT;
                return absResult;

            case "pow":
                ensureArgumentCount(ctx, 2, "pow");
                Value baseValue = visit(ctx.expr_list().expr(0));
                Value exponentValue = visit(ctx.expr_list().expr(1));
                if (!baseValue.isNumeric() || !exponentValue.isNumeric()) {
                    throw new RuntimeException("pow expects numeric arguments");
                }
                double base = baseValue.isDouble() ? baseValue.asDouble() : baseValue.asInteger();
                double exponent = exponentValue.isDouble() ? exponentValue.asDouble() : exponentValue.asInteger();
                Value powResult = new Value(Math.pow(base, exponent));
                powResult.type = Value.TYPE.FLOAT;
                return powResult;

            // TODO: Add more built-in functions here as needed
            // Check for arguments for function:
            // if (ctx.expr_list() == null || ctx.expr_list().expr().size() > 0)
            // Check for argument 1, 2, ...
            // Value arg1 = visit(ctx.expr_list().expr(0));
            // Value arg2 = visit(ctx.expr_list().expr(1));
            // Eval arguments:
            // Not needed, because already evaluated when argument list seen
            // this.visit(ctx.expr_list().expr(0)); ... etc
            // Return value if needed
            // Value returnValue = new Value(...);
            // returnValue.type = Value.TYPE....;
            // return returnValue;

            default:
                // Handle user-defined functions (your existing code)
                Value function = callUserDefinedFunction(ctx);
                function.setWasFunction(funcName);
                function.type = function.getReturnType();
                return function;
        }
    }

    // unless override
    @Override
    public Value visitUnlessExpr(MuParser.UnlessExprContext ctx) {

        Value evaluated = this.visit(ctx.expr());

        if (!evaluated.asBoolean()) {
            this.visit(ctx.stat_block());
        }

        return Value.VOID;
    }

    // while override
    @Override
    public Value visitWhile_stat(MuParser.While_statContext ctx) {

        if (isDefiningFunction) {
            return Value.VOID;
        }

        Value condition = this.visit(ctx.expr());
        while (condition.asBoolean()) {

            symbolTable.pushScope();
            // evaluate the code block
            this.visit(ctx.stat_block());
            symbolTable.popScope();

            // re-evaluate the expression
            condition = this.visit(ctx.expr());
        }

        Value v = Value.VOID;
        v.type = Value.TYPE.NIL;
        return v;
    }

    // for override
    @Override
    public Value visitFor_stat(MuParser.For_statContext ctx) {

        if (isDefiningFunction) {
            return Value.VOID;
        }

        String id = ctx.ID(0).getText();
        Value start = visit(ctx.arith_atom(0));
        Value end = ctx.arith_atom().size() > 1 ? visit(ctx.arith_atom(1)) : visit(ctx.ID(1));

        symbolTable.put(id, start);
        int i = start.asInteger();

        while (i <= end.asInteger()) {

            symbolTable.pushScope();
            visit(ctx.stat_block());
            symbolTable.popScope();

            i++;
            start.updateValue(i);
            symbolTable.put(id, start);
        }

        Value v = Value.VOID;
        v.updateValue(null);
        v.type = Value.TYPE.NIL;
        return v;
    }

    @Override
    public Value visitFunction_def(MuParser.Function_defContext ctx) {
        // Set the flag to indicate we're defining a function
        isDefiningFunction = true;

        String funcName = ctx.ID().getText();
        List<Parameter> params = visitParameterList(ctx.parameter_list());
        Value.TYPE returnType = ctx.TYPE() != null ? Value.TYPE.valueOf(
                ctx.TYPE().getText().toUpperCase().equals("INTEGER") ? "INT" : ctx.TYPE().getText().toUpperCase())
                : Value.TYPE.VOID;

        Value functionValue = new Value(null);
        functionValue.setAsFunction(funcName, params, ctx.stat_block(), ctx.return_stmt(), returnType);

        symbolTable.put(funcName, functionValue);
        isDefiningFunction = false;

        return Value.VOID;
    }

    private List<Parameter> visitParameterList(MuParser.Parameter_listContext ctx) {

        List<Parameter> params = new ArrayList<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            String paramName = ctx.ID(i).getText();
            Value.TYPE paramType = Value.TYPE.valueOf(ctx.TYPE(i).getText().toUpperCase().equals("INTEGER") ? "INT"
                    : ctx.TYPE(i).getText().toUpperCase());
            params.add(new Parameter(paramName, paramType));
        }
        return params;
    }

    public Value callUserDefinedFunction(MuParser.Function_callContext ctx) {
        String funcName = ctx.ID().getText();

        // Retrieve the function from the symbol table
        Value function = symbolTable.get(funcName);
        if (function == null || !function.isFunction()) {
            throw new RuntimeException("Function not defined: " + funcName);
        }

        // Push a new scope for the function's local variables
        symbolTable.pushScope();

        // Handle function parameters and arguments
        List<Parameter> params = function.getParameters();
        List<MuParser.ExprContext> args = ctx.expr_list() != null ? ctx.expr_list().expr() : Collections.emptyList();

        if (args.size() != params.size()) {
            throw new RuntimeException("Incorrect number of arguments for function: " + funcName);
        }

        // Bind parameters in the new scope
        for (int i = 0; i < params.size(); i++) {
            Parameter param = params.get(i);
            Value argValue = visit(args.get(i)); // Evaluate the argument
            symbolTable.put(param.name, argValue); // Store it in the new scope
        }

        // Visit the function body (stat_block) with proper scoping
        visit(function.getFunctionBody());

        Value returnValue = new Value(null);

        if (function.isVoidFunction()) {
            returnValue.updateValue(null);
            returnValue.setWasFunction(funcName);
            returnValue.type = Value.TYPE.VOID;
        } else {
            returnValue = visit(function.getReturnExpr());
            returnValue.setWasFunction(funcName);
        }

        // Pop the function's scope after execution
        symbolTable.popScope();

        return returnValue;
    }
}
