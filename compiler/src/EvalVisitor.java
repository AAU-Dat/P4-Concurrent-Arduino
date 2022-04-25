import antlr.arcv2BaseVisitor;
import antlr.arcv2Parser;

import AstNodes.*;

public class EvalVisitor extends arcv2BaseVisitor<AstNode> {

    @Override
    public AstNode visitStart(arcv2Parser.StartContext ctx) {
        AstNode start = new StartNode("start");
        // this only works with a single declaration will have to find out how to go
        // through them one by one
        start.child = visitChildren(ctx);
        return start;
    }

    @Override
    public AstNode visitTerminal_expression(arcv2Parser.Terminal_expressionContext ctx) {

        String name;
        if (ctx.IDENTIFIER() != null) {
            name = "ID";
        } else {
            name = ctx.getText();
        }
        AstNode terminal = new Terminal_expression_node(name);
        return terminal;
    }

    @Override
    public AstNode visitPlus_minus_expression(arcv2Parser.Plus_minus_expressionContext ctx) {
        AstNode plus_minus_node;

        if (ctx.children.get(1).getText().toCharArray()[0] == '+')
            plus_minus_node = new StartNode("plus");
        else
            plus_minus_node = new StartNode("minus");

        plus_minus_node.child = visit(ctx.expression(0));
        plus_minus_node.child.MakeSiblings(visit(ctx.expression(1)));
        return plus_minus_node;

    }

    @Override
    public AstNode visitMultiplication_divide_expression(arcv2Parser.Multiplication_divide_expressionContext ctx) {
        AstNode mult_divide_node;

        if (ctx.children.get(1).getText().toCharArray()[0] == '*')
            mult_divide_node = new StartNode("mult");
        else
            mult_divide_node = new StartNode("devide");

        mult_divide_node.child = visit(ctx.expression(0));
        mult_divide_node.child.MakeSiblings(visit(ctx.expression(1)));
        return mult_divide_node;

    }

    @Override
    public AstNode visitRelational_equality_expression(arcv2Parser.Relational_equality_expressionContext ctx) {
        AstNode equality_node; 
        if (ctx.children.get(1).getText().toCharArray()[0] == '=')
            equality_node = new StartNode("equality");
        else
            equality_node = new StartNode("inequality");

        equality_node.child = visit(ctx.expression(0));
        equality_node.child.MakeSiblings(visit(ctx.expression(1)));
        return equality_node;
    }

    @Override
    public AstNode visitRelational_operator_expression(arcv2Parser.Relational_operator_expressionContext ctx) {
        AstNode relational_node;
        char[] operator_array = ctx.children.get(1).getText().toCharArray();
        if (operator_array.length == 1) {
            if (operator_array[0] == '<')
                relational_node = new StartNode("less");
            else
                relational_node = new StartNode("greater");
        } else {
            if (operator_array[0] == '<')
                relational_node = new StartNode("less than or equal");
            else
                relational_node = new StartNode("greater than or equal");
        }
        relational_node.child = visit(ctx.expression(0));
        relational_node.child.MakeSiblings(visit(ctx.expression(1)));
        return relational_node;
    }

    @Override
    public AstNode visitOr_expression(arcv2Parser.Or_expressionContext ctx){
        AstNode Or_node = new StartNode("or");
        Or_node.child = visit(ctx.expression(0));
        Or_node.child.MakeSiblings(visit(ctx.expression(1)));
        return Or_node;
    }

    @Override
    public AstNode visitAnd_expression(arcv2Parser.And_expressionContext ctx) {
        AstNode And_node = new StartNode("And");
        And_node.child = visit(ctx.expression(0));
        And_node.child.MakeSiblings(visit(ctx.expression(1)));
        return And_node;
    }

    @Override
    public AstNode visitParentheses_expression(arcv2Parser.Parentheses_expressionContext ctx){
        AstNode parantheses_node = new StartNode("parantheses");
        parantheses_node.child = visitChildren(ctx);
        return parantheses_node;
    }

    @Override
    public AstNode visitUnary_negation_expression(arcv2Parser.Unary_negation_expressionContext ctx) {
        AstNode unary_node = new StartNode("unary");
        unary_node.child = visitChildren(ctx);
        return unary_node;
    }

    @Override
    public AstNode visitArray_access_expression(arcv2Parser.Array_access_expressionContext ctx) {
        AstNode array_node =new StartNode("array_access");
        return array_node;
    }

    @Override
    public AstNode visitFunction_access_expression(arcv2Parser.Function_access_expressionContext ctx){
        AstNode function_call = new StartNode("function");
        if (ctx.ARDUINOFUNCTIONS() != null)
            System.out.println("arduinofunction");
        return function_call;
    }

    @Override
    public AstNode visitVariable_declaration(arcv2Parser.Variable_declarationContext ctx) {

        AstNode variable_declaration = new Variable_declaration_node("varDec");
        variable_declaration.child = visit(ctx.expression(0));

        if (ctx.STARTSQUAREBRACKET() != null) {

            System.out.println(ctx.STARTSQUAREBRACKET().getText());
        }
        return variable_declaration;
    }
    // @Override
    // public AstNode visit(arcv2Parser.Plus_minus_expressionContext ctx) {
    // AstNode plus = new StartNode("plus");
    // return plus; }
}
