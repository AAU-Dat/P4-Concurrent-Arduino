import antlr.arcv2BaseVisitor;
import antlr.arcv2Parser;
import AstNodes.*;
import Types.Types;
import symbolTable.*;

import Exemptions.Expression_type_exception;


public class EvalVisitor extends arcv2BaseVisitor<AST_node> {
    SymbolTable symbolTable = new SymbolTable(); 

    @Override
    public AST_node visitStart(arcv2Parser.StartContext ctx) {
        AST_node start = new AST_node("start");
        // this only works with a single declaration will have to find out how to go
        // through them one by one
        start.child = visitChildren(ctx);
        return start;
    }

    @Override
    public AST_node visitTerminal_expression(arcv2Parser.Terminal_expressionContext ctx) {

        String name;
        name = ctx.getText();
        AST_node terminal = new Terminal_expression_node(name);
        if (ctx.NUMBER() != null)
            terminal.type = Types.NUM;
        else if (ctx.BOOL() != null)
            terminal.type = Types.BOOL;
        else if (ctx.CHAR() != null)
            terminal.type = Types.CHAR;
        else if (ctx.IDENTIFIER() != null) {
            name = "ID";
        } else {
            throw new RuntimeException("problems with terminal expression");
        }
        return terminal;
    }

    @Override
    public AST_node visitPlus_minus_expression(arcv2Parser.Plus_minus_expressionContext ctx) {
        AST_node plus_minus_node;

        if (ctx.children.get(1).getText().toCharArray()[0] == '+')
            plus_minus_node = new AST_node("plus");
        else
            plus_minus_node = new AST_node("minus");
        plus_minus_node.child = visit(ctx.expression(0));
        plus_minus_node.child.MakeSiblings(visit(ctx.expression(1)));

        AST_node[] astnodearray = { plus_minus_node.child, plus_minus_node.child.rightSibling };
        if (Typecheck.Check(astnodearray, Types.NUM))
            plus_minus_node.type = Types.NUM;
        else {
            throw new Expression_type_exception("the plus/minus expression has bad typing");
        }
        return plus_minus_node;
    }

    @Override
    public AST_node visitMultiplication_divide_expression(arcv2Parser.Multiplication_divide_expressionContext ctx) {
        AST_node mult_divide_node;

        if (ctx.children.get(1).getText().toCharArray()[0] == '*')
            mult_divide_node = new AST_node("mult");
        else
            mult_divide_node = new AST_node("devide");

        mult_divide_node.child = visit(ctx.expression(0));
        mult_divide_node.child.MakeSiblings(visit(ctx.expression(1)));
        AST_node[] astnodearray = { mult_divide_node.child, mult_divide_node.child.rightSibling };
        if (Typecheck.Check(astnodearray, Types.NUM))
            mult_divide_node.type = Types.NUM;
        else {
            throw new Expression_type_exception("the mult/divide expression has bad typing");
        }
        return mult_divide_node;

    }

    @Override
    public AST_node visitRelational_equality_expression(arcv2Parser.Relational_equality_expressionContext ctx) {
        AST_node equality_node;
        if (ctx.children.get(1).getText().toCharArray()[0] == '=')
            equality_node = new AST_node("equality");
        else
            equality_node = new AST_node("inequality");

        equality_node.child = visit(ctx.expression(0));
        equality_node.child.MakeSiblings(visit(ctx.expression(1)));
        AST_node[] astnode_array = { equality_node.child, equality_node.child.rightSibling };
        if (Typecheck.Check(astnode_array, equality_node.child.type)) {
            equality_node.type = Types.BOOL;
        } else {
            throw new Expression_type_exception("the equality expression has bad typing");
        }
        return equality_node;
    }

    @Override
    public AST_node visitRelational_operator_expression(arcv2Parser.Relational_operator_expressionContext ctx) {
        AST_node relational_node;
        char[] operator_array = ctx.children.get(1).getText().toCharArray();
        if (operator_array.length == 1) {
            if (operator_array[0] == '<')
                relational_node = new AST_node("less");
            else
                relational_node = new AST_node("greater");
        } else {
            if (operator_array[0] == '<')
                relational_node = new AST_node("less than or equal");
            else
                relational_node = new AST_node("greater than or equal");
        }
        relational_node.child = visit(ctx.expression(0));
        relational_node.child.MakeSiblings(visit(ctx.expression(1)));
        AST_node[] astnode_array = { relational_node.child, relational_node.child.rightSibling };
        if (Typecheck.Check(astnode_array, relational_node.child.type)) {
            relational_node.type = Types.BOOL;
        } else {
            throw new Expression_type_exception("the relational operator expression has bad typing");
        }
        return relational_node;
    }

    @Override
    public AST_node visitOr_expression(arcv2Parser.Or_expressionContext ctx) {
        AST_node Or_node = new AST_node("or");
        Or_node.child = visit(ctx.expression(0));
        Or_node.child.MakeSiblings(visit(ctx.expression(1)));
        AST_node[] astnode_array = { Or_node.child, Or_node.child.rightSibling };
        if (Typecheck.Check(astnode_array, Types.BOOL)) {
            Or_node.type = Types.BOOL;
        } else {
            throw new Expression_type_exception("the Or expression has bad typing");
        }
        return Or_node;
    }

    @Override
    public AST_node visitAnd_expression(arcv2Parser.And_expressionContext ctx) {
        AST_node And_node = new AST_node("And");
        And_node.child = visit(ctx.expression(0));
        And_node.child.MakeSiblings(visit(ctx.expression(1)));
        AST_node[] astnode_array = { And_node.child, And_node.child.rightSibling };
        if (Typecheck.Check(astnode_array, Types.BOOL)) {
            And_node.type = Types.BOOL;
        } else {
            throw new Expression_type_exception("the And expression has bad typing");
        }
        return And_node;
    }

    @Override
    public AST_node visitParentheses_expression(arcv2Parser.Parentheses_expressionContext ctx) {
        AST_node parantheses_node = new AST_node("parantheses");
        parantheses_node.child = visit(ctx.expression());
        if (parantheses_node.child.type != Types.CHAR) {
            parantheses_node.type = parantheses_node.child.type;
        } else {
            throw new Expression_type_exception("the parantheses expression has bad typing");
        }
        return parantheses_node;
    }

    @Override
    public AST_node visitUnary_negation_expression(arcv2Parser.Unary_negation_expressionContext ctx) {
        AST_node unary_node = new AST_node("unary");
        unary_node.child = visitChildren(ctx);
        if (unary_node.child.type == Types.BOOL) {
            unary_node.type = Types.BOOL;
        } else {
            throw new Expression_type_exception("the unary expression has bad typing");
        }
        return unary_node;
    }

    // /* TODO gewg*/
    @Override
    public AST_node visitArray_access_expression(arcv2Parser.Array_access_expressionContext ctx) {
        Array_access_node array_node = new Array_access_node("array_access",
                Integer.parseInt(ctx.children.get(2).toString()));
        return array_node;
    }

    // // TODO
    @Override
    public AST_node visitFunction_access_expression(arcv2Parser.Function_access_expressionContext ctx) {
        AST_node function_call = new AST_node("function");
        if (ctx.ARDUINOFUNCTIONS() != null)
            System.out.println("arduinofunction");
        return function_call;
    }

    @Override
    public AST_node visitVariable_declaration(arcv2Parser.Variable_declarationContext ctx) {

        AST_node variable_declaration = new Variable_declaration_node("varDec");
        variable_declaration.child = visit(ctx.expression(0));

        if (ctx.STARTSQUAREBRACKET() != null) {

            System.out.println(ctx.STARTSQUAREBRACKET().getText());
        }



        return variable_declaration;
    }
    @Override
    public AST_node visitBlock(arcv2Parser.BlockContext ctx) {

        symbolTable.push();

        AST_node block = new Variable_declaration_node("block");


        return block;
    }


    // @Override
    // public AstNode visit(arcv2Parser.Plus_minus_expressionContext ctx) {
    // AstNode plus = new AstNode("plus");
    // return plus; }
    // private Types String_to_Types(String input) {
    //     switch (input) {
    //         case value:
                
    //             break;
        
    //         default:
    //             break;
    //     }
        
    // }
}
