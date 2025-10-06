// Generated from src/main/antlr4/mu/Mu.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MuParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MuVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MuParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MuParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MuParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#nonEmptyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyBlock(MuParser.NonEmptyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MuParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#read_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_func(MuParser.Read_funcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentWithType}
	 * labeled alternative in {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentWithType(MuParser.AssignmentWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAssignment}
	 * labeled alternative in {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignment(MuParser.SimpleAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(MuParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(MuParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(MuParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(MuParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unlessExpr}
	 * labeled alternative in {@link MuParser#unless_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlessExpr(MuParser.UnlessExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#print_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_func(MuParser.Print_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(MuParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(MuParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(MuParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MuParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(MuParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(MuParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(MuParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(MuParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(MuParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MuParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexExpr(MuParser.RegexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(MuParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(MuParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(MuParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(MuParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MuParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(MuParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithAtom(MuParser.ArithAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(MuParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(MuParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(MuParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dollarStringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDollarStringAtom(MuParser.DollarStringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(MuParser.NilAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallAtom(MuParser.FuncCallAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#expr_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stat(MuParser.Expr_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MuParser#arith_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_atom(MuParser.Arith_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerAtom}
	 * labeled alternative in {@link MuParser#integer_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAtom(MuParser.IntegerAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatAtom}
	 * labeled alternative in {@link MuParser#float_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatAtom(MuParser.FloatAtomContext ctx);
}