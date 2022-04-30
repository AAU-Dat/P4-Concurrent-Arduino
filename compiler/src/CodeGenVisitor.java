import antlr.arcv2BaseVisitor;
import antlr.arcv2Parser;
import CodeGen.CodeGenStringObject;
import Exemptions.Expression_type_exception;

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
        
        cpp.GlobalScope += cpp.Type_Coverter(ctx.TYPE_TYPEOPERATOR().toString()) + " ";
        cpp.GlobalScope += ctx.IDENTIFIER().toString() + " ";
        cpp.GlobalScope += ctx.ASSIGNMENT().toString() + " ";

        if(ctx.STARTSQUAREBRACKET() != null){
            cpp.GlobalScope += ctx.STARTSQUAREBRACKET().toString();
            cpp.GlobalScope += ctx.ENDSQUAREBRACKET().toString() + " ";
        }
        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope;
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
        cpp.GlobalScope = ctx.getText();

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

    // Todo
    @Override
    public CodeGenStringObject visitUnary_negation_expression(arcv2Parser.Unary_negation_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();

        return cpp;
    }

    // Todo
    @Override
    public CodeGenStringObject visitMultiplication_divide_expression(arcv2Parser.Multiplication_divide_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();

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

    // Todo
    @Override
    public CodeGenStringObject visitRelational_equality_expression(arcv2Parser.Relational_equality_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();

        return cpp;
    }

    // Todo
    @Override
    public CodeGenStringObject visitRelational_operator_expression(arcv2Parser.Relational_operator_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();

        return cpp;
    }

    // Todo
    @Override
    public CodeGenStringObject visitAnd_expression(arcv2Parser.And_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();

        return cpp;
    }

    // Todo
    @Override
    public CodeGenStringObject visitOr_expression(arcv2Parser.Or_expressionContext ctx){
        CodeGenStringObject cpp = new CodeGenStringObject();

        return cpp;
    }
}