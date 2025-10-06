// Generated from /Volumes/externalssd/Development/Mu/src/main/antlr4/mu/Mu.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MuParser}.
 */
public interface MuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MuParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MuParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MuParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MuParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MuParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#nonEmptyBlock}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyBlock(MuParser.NonEmptyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#nonEmptyBlock}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyBlock(MuParser.NonEmptyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MuParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MuParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentWithType}
	 * labeled alternative in {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentWithType(MuParser.AssignmentWithTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentWithType}
	 * labeled alternative in {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentWithType(MuParser.AssignmentWithTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleAssignment}
	 * labeled alternative in {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssignment(MuParser.SimpleAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleAssignment}
	 * labeled alternative in {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssignment(MuParser.SimpleAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(MuParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(MuParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(MuParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(MuParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(MuParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(MuParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(MuParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(MuParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unlessExpr}
	 * labeled alternative in {@link MuParser#unless_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnlessExpr(MuParser.UnlessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unlessExpr}
	 * labeled alternative in {@link MuParser#unless_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnlessExpr(MuParser.UnlessExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(MuParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(MuParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(MuParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(MuParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(MuParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(MuParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MuParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MuParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(MuParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(MuParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MuParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MuParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(MuParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(MuParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(MuParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(MuParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(MuParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(MuParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MuParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MuParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRegexExpr(MuParser.RegexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRegexExpr(MuParser.RegexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(MuParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(MuParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(MuParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(MuParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(MuParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(MuParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(MuParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(MuParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MuParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MuParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(MuParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(MuParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterArithAtom(MuParser.ArithAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitArithAtom(MuParser.ArithAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(MuParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(MuParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallAtom(MuParser.FuncCallAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallAtom(MuParser.FuncCallAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(MuParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(MuParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(MuParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(MuParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dollarStringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDollarStringAtom(MuParser.DollarStringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dollarStringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDollarStringAtom(MuParser.DollarStringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(MuParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(MuParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#expr_stat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stat(MuParser.Expr_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#expr_stat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stat(MuParser.Expr_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#arith_atom}.
	 * @param ctx the parse tree
	 */
	void enterArith_atom(MuParser.Arith_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#arith_atom}.
	 * @param ctx the parse tree
	 */
	void exitArith_atom(MuParser.Arith_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerAtom}
	 * labeled alternative in {@link MuParser#integer_atom}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAtom(MuParser.IntegerAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerAtom}
	 * labeled alternative in {@link MuParser#integer_atom}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAtom(MuParser.IntegerAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatAtom}
	 * labeled alternative in {@link MuParser#float_atom}.
	 * @param ctx the parse tree
	 */
	void enterFloatAtom(MuParser.FloatAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatAtom}
	 * labeled alternative in {@link MuParser#float_atom}.
	 * @param ctx the parse tree
	 */
	void exitFloatAtom(MuParser.FloatAtomContext ctx);
}