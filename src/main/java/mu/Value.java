package mu;

import java.util.List;

public class Value {

    public static Value VOID = new Value(new Object());

    private boolean isFunction = false;
    private List<Parameter> parameters;
    private MuParser.Stat_blockContext functionBody;
    private MuParser.Return_stmtContext functionReturnExpr;
    private TYPE returnType;
    private boolean wasFunction = false;
    private String functionName = null;

    public static enum TYPE {
        INT, FLOAT, STRING, BOOLEAN, NIL, VOID
    }

    Object value = new Object();
    public TYPE type = TYPE.VOID;

    public Value(Object value) {
        this.value = value;
    }

    public void updateValue(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean) value;
    }

    public Double asDouble() {
        return (Double) value;
    }

    public Integer asInteger() {
        return (Integer) value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isNil() {
        return value == null;
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    public boolean isInteger() {
        return value instanceof Integer;
    }

    public boolean isNumeric() {
        return value instanceof Integer || value instanceof Double;
    }

    public boolean isString() {
        return value instanceof String;
    }

    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    @Override
    public int hashCode() {

        if (value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if (value == o) {
            return true;
        }

        if (value == null || o == null || ((Value) o).getValue().getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value) o;

        return this.value.equals(that.value);
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (value == null) {
            return "null";
        }
        return String.valueOf(value);
    }

    public void setAsFunction(String func, List<Parameter> params, MuParser.Stat_blockContext body,
            MuParser.Return_stmtContext ret, TYPE returnType) {
        this.isFunction = true;
        this.parameters = params;
        this.functionBody = body;
        this.functionReturnExpr = ret;
        this.returnType = returnType;
        this.type = this.returnType;
        this.wasFunction = true;
        this.functionName = func;
    }

    public void setWasFunction(String funcName) {
        this.wasFunction = true;
        this.functionName = funcName;
    }

    public boolean wasFunctionCall() {
        return this.wasFunction;
    }

    public String functionName() {
        return this.functionName;
    }

    public boolean isFunction() {
        return this.isFunction;
    }

    public boolean isVoidFunction() {
        return this.returnType == Value.TYPE.VOID || this.returnType == Value.TYPE.NIL;
    }

    public List<Parameter> getParameters() {
        return this.parameters;
    }

    public MuParser.Stat_blockContext getFunctionBody() {
        return this.functionBody;
    }

    public MuParser.Return_stmtContext getReturnExpr() {
        return this.functionReturnExpr;
    }
}

class Parameter {
    String name;
    Value.TYPE type;

    Parameter(String name, Value.TYPE type) {
        this.name = name;
        this.type = type;
    }
}
