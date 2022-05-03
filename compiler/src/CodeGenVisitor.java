import antlr.arcv2BaseVisitor;
import antlr.arcv2Parser;
import antlr.arcv2Parser.ExpressionContext;

import java.util.List;

import CodeGen.CodeGenStringObject;

public class CodeGenVisitor extends arcv2BaseVisitor<CodeGenStringObject> {
    @Override
    public CodeGenStringObject visitStart(arcv2Parser.StartContext ctx) {
        CodeGenStringObject c_plus_plus_code = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();
        
        for(int i= 0; i<ctx.getChildCount(); i++){
            temp =visit(ctx.getChild(i));
            c_plus_plus_code.GlobalScope += temp.GlobalScope;
            c_plus_plus_code.Setup += temp.Setup;
            c_plus_plus_code.Loop += temp.Loop;
        }

        
        return c_plus_plus_code;
    }

    @Override
    public CodeGenStringObject visitVariable_declaration(arcv2Parser.Variable_declarationContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();
        
        // This can be use to make varibales mutable in c++
        if(ctx.PREFIXOPERATOR() != null){
            cpp.GlobalScope += "";
        }
        
        if(ctx.TYPE() != null){
            cpp.GlobalScope += cpp.Type_Coverter(ctx.TYPE().toString()) + " ";
        }


        cpp.GlobalScope += ctx.IDENTIFIER().toString();

        if(ctx.TYPEOPERATOR() != null){
            cpp.GlobalScope += "[]";
        }

        cpp.GlobalScope += " " + ctx.ASSIGNMENT().toString() + " ";

        if(ctx.STARTSQUAREBRACKET() != null){
            cpp.GlobalScope += "{";

            //Make this a function
            List<ExpressionContext> list = ctx.expression();
            for(int i = 0; i < list.size(); i++){
                temp = visit(ctx.expression(i));
                cpp.GlobalScope += temp.GlobalScope;
                if(i + 1 < list.size()){
                    cpp.GlobalScope += ", ";
                }
            }
            cpp.GlobalScope += "}";
        } else {
            temp = visit(ctx.expression(0));
            cpp.GlobalScope += temp.GlobalScope;
        }

        cpp.GlobalScope += ";\n";


        return cpp;
    }
    

    @Override
    public CodeGenStringObject visitTerminal_expression(arcv2Parser.Terminal_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();
        cpp.GlobalScope = ctx.getText();

        return cpp; 
    }

    @Override
    public CodeGenStringObject visitFunction_access_expression(arcv2Parser.Function_access_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();
        
        List<ExpressionContext> list = ctx.expression();
        for(int i = 0; i < list.size(); i++){
            temp = visit(ctx.expression(i));
            cpp.GlobalScope += temp.GlobalScope;
            if(i + 2 == list.size()){
                temp = visit(ctx.expression(i));
                cpp.GlobalScope += ", ";
            }
        }

        return cpp;
    }

    @Override
    public CodeGenStringObject visitArray_access_expression(arcv2Parser.Array_access_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();
        cpp.GlobalScope = ctx.getText();

        return cpp;
    }

    @Override
    public CodeGenStringObject visitParentheses_expression(arcv2Parser.Parentheses_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();
        
        temp = visit(ctx.expression());
        cpp.GlobalScope = "(" + temp.GlobalScope + ")";

        return cpp;
    }

    @Override
    public CodeGenStringObject visitUnary_negation_expression(arcv2Parser.Unary_negation_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression());
        cpp.GlobalScope = "not " + temp.GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitMultiplication_divide_expression(arcv2Parser.Multiplication_divide_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " ";

        if(ctx.MULTI() != null){
            cpp.GlobalScope += "* ";
        } else {
            cpp.GlobalScope += "/ ";
        }

        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitPlus_minus_expression(arcv2Parser.Plus_minus_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " ";

        if(ctx.PLUS() != null){
            cpp.GlobalScope += "+ ";
        } else {
            cpp.GlobalScope += "- ";
        }

        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }    

    @Override
    public CodeGenStringObject visitRelational_equality_expression(arcv2Parser.Relational_equality_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " ";

        if(ctx.RELATIONEQOPERATORS() == null){
            return cpp;
        } else if(ctx.RELATIONEQOPERATORS().toString() == "=="){
            cpp.GlobalScope += "== ";
        } else {cpp.GlobalScope += "!= ";}

        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitRelational_operator_expression(arcv2Parser.Relational_operator_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " ";

        if(ctx.RELATIONOPERATORS() == null){
            return cpp;
        } else if(ctx.RELATIONOPERATORS().toString() == "<"){
            cpp.GlobalScope += "< ";
        } else if(ctx.RELATIONOPERATORS().toString() == ">"){
            cpp.GlobalScope += "> ";
        } else if(ctx.RELATIONOPERATORS().toString() == "<="){
            cpp.GlobalScope += "<= ";
        } else {cpp.GlobalScope += ">= ";}

        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitAnd_expression(arcv2Parser.And_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " and ";
        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitOr_expression(arcv2Parser.Or_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " or ";
        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }
}