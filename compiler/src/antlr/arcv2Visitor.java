// Generated from /mnt/c/Users/chris/Desktop/P4-Concurrent-Arduino/compiler/arcv2.g4 by ANTLR 4.10
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link arcv2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface arcv2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link arcv2Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(arcv2Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable_declaration}
	 * labeled alternative in {@link arcv2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(arcv2Parser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_declaration}
	 * labeled alternative in {@link arcv2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(arcv2Parser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pin_declaration}
	 * labeled alternative in {@link arcv2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPin_declaration(arcv2Parser.Pin_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code task_declaration}
	 * labeled alternative in {@link arcv2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_declaration(arcv2Parser.Task_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link arcv2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(arcv2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block_statement}
	 * labeled alternative in {@link arcv2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(arcv2Parser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link arcv2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(arcv2Parser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_else_statement}
	 * labeled alternative in {@link arcv2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_statement(arcv2Parser.If_else_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forloop_statement}
	 * labeled alternative in {@link arcv2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop_statement(arcv2Parser.Forloop_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileloop_statement}
	 * labeled alternative in {@link arcv2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop_statement(arcv2Parser.Whileloop_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable_declaration_statement}
	 * labeled alternative in {@link arcv2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_statement(arcv2Parser.Variable_declaration_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_statement}
	 * labeled alternative in {@link arcv2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(arcv2Parser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_call_statement}
	 * labeled alternative in {@link arcv2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_statement(arcv2Parser.Function_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relational_equality_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_equality_expression(arcv2Parser.Relational_equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication_divide_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication_divide_expression(arcv2Parser.Multiplication_divide_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(arcv2Parser.Or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code terminal_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal_expression(arcv2Parser.Terminal_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(arcv2Parser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_negation_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_negation_expression(arcv2Parser.Unary_negation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relational_operator_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator_expression(arcv2Parser.Relational_operator_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses_expression(arcv2Parser.Parentheses_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_access_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access_expression(arcv2Parser.Array_access_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_access_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_access_expression(arcv2Parser.Function_access_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus_minus_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_minus_expression(arcv2Parser.Plus_minus_expressionContext ctx);
}