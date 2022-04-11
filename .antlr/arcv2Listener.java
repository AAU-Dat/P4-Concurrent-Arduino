// Generated from /home/runge/semester-project/P4-Concurrent-Arduino/arcv2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link arcv2Parser}.
 */
public interface arcv2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link arcv2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(arcv2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link arcv2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(arcv2Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_declaration}
	 * labeled alternative in {@link arcv2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(arcv2Parser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_declaration}
	 * labeled alternative in {@link arcv2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(arcv2Parser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable_declaration}
	 * labeled alternative in {@link arcv2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(arcv2Parser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable_declaration}
	 * labeled alternative in {@link arcv2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(arcv2Parser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pin_declaration}
	 * labeled alternative in {@link arcv2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterPin_declaration(arcv2Parser.Pin_declarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pin_declaration}
	 * labeled alternative in {@link arcv2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitPin_declaration(arcv2Parser.Pin_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code task_declarations}
	 * labeled alternative in {@link arcv2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterTask_declarations(arcv2Parser.Task_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code task_declarations}
	 * labeled alternative in {@link arcv2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitTask_declarations(arcv2Parser.Task_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty_declaration}
	 * labeled alternative in {@link arcv2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_declaration(arcv2Parser.Empty_declarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty_declaration}
	 * labeled alternative in {@link arcv2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_declaration(arcv2Parser.Empty_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(arcv2Parser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(arcv2Parser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_else_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_statement(arcv2Parser.If_else_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_else_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_statement(arcv2Parser.If_else_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forloop_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterForloop_statement(arcv2Parser.Forloop_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forloop_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitForloop_statement(arcv2Parser.Forloop_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileloop_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop_statement(arcv2Parser.Whileloop_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileloop_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop_statement(arcv2Parser.Whileloop_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable_declaration_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_statement(arcv2Parser.Variable_declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable_declaration_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_statement(arcv2Parser.Variable_declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(arcv2Parser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(arcv2Parser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(arcv2Parser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty_statement}
	 * labeled alternative in {@link arcv2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(arcv2Parser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relational_equality_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_equality_expression(arcv2Parser.Relational_equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relational_equality_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_equality_expression(arcv2Parser.Relational_equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication_divide_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication_divide_expression(arcv2Parser.Multiplication_divide_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication_divide_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication_divide_expression(arcv2Parser.Multiplication_divide_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(arcv2Parser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(arcv2Parser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_or_array_access_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_or_array_access_expression(arcv2Parser.Function_or_array_access_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_or_array_access_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_or_array_access_expression(arcv2Parser.Function_or_array_access_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code terminal_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTerminal_expression(arcv2Parser.Terminal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code terminal_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTerminal_expression(arcv2Parser.Terminal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(arcv2Parser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(arcv2Parser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_negation_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_negation_expression(arcv2Parser.Unary_negation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_negation_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_negation_expression(arcv2Parser.Unary_negation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relational_operator_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator_expression(arcv2Parser.Relational_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relational_operator_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator_expression(arcv2Parser.Relational_operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses_expression(arcv2Parser.Parentheses_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses_expression(arcv2Parser.Parentheses_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus_minus_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus_minus_expression(arcv2Parser.Plus_minus_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus_minus_expression}
	 * labeled alternative in {@link arcv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus_minus_expression(arcv2Parser.Plus_minus_expressionContext ctx);
}