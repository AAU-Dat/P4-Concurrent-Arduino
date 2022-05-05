import antlr.arcv2BaseVisitor;
import antlr.arcv2Parser;
import antlr.arcv2Parser.BlockContext;
import antlr.arcv2Parser.ExpressionContext;
import antlr.arcv2Parser.StatementContext;
import antlr.arcv2Parser.TypingContext;
import java.util.List;
import CodeGen.CodeGenStringObject;

public class CodeGenVisitor extends arcv2BaseVisitor<CodeGenStringObject> {
    @Override
    public CodeGenStringObject visitStart(arcv2Parser.StartContext ctx) {
        CodeGenStringObject c_plus_plus_code = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            temp = visit(ctx.getChild(i));
            c_plus_plus_code.GlobalScope += temp.GlobalScope;
            c_plus_plus_code.Setup += temp.Setup;
            c_plus_plus_code.Loop += temp.Loop;
        }

        return c_plus_plus_code;
    }

    /*
     * Expression CodeGen
     */
    @Override
    public CodeGenStringObject visitTerminal_expression(arcv2Parser.Terminal_expressionContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        cpp.GlobalScope = ctx.getText();

        return cpp;
    }

    @Override
    public CodeGenStringObject visitFunction_access_expression(arcv2Parser.Function_access_expressionContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        cpp.GlobalScope += ctx.IDENTIFIER();
        cpp.GlobalScope += "(";
        List<ExpressionContext> list = ctx.expression();
        for (int i = 0; i < list.size(); i++) {
            temp = visit(ctx.expression(i));
            cpp.GlobalScope += temp.GlobalScope;
            if (i + 2 == list.size()) {
                temp = visit(ctx.expression(i));
                cpp.GlobalScope += ", ";
            }
        }
        cpp.GlobalScope += ")";

        return cpp;
    }

    @Override
    public CodeGenStringObject visitArray_access_expression(arcv2Parser.Array_access_expressionContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        cpp.GlobalScope = ctx.getText();

        return cpp;
    }

    @Override
    public CodeGenStringObject visitParentheses_expression(arcv2Parser.Parentheses_expressionContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression());
        cpp.GlobalScope = "(" + temp.GlobalScope + ")";

        return cpp;
    }

    @Override
    public CodeGenStringObject visitUnary_negation_expression(arcv2Parser.Unary_negation_expressionContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression());
        cpp.GlobalScope = "not " + temp.GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitMultiplication_divide_expression(
            arcv2Parser.Multiplication_divide_expressionContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " ";

        if (ctx.MULTI() != null) {
            cpp.GlobalScope += "* ";
        } else {
            cpp.GlobalScope += "/ ";
        }

        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitPlus_minus_expression(arcv2Parser.Plus_minus_expressionContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " ";

        if (ctx.PLUS() != null) {
            cpp.GlobalScope += "+ ";
        } else {
            cpp.GlobalScope += "- ";
        }

        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitRelational_equality_expression(
            arcv2Parser.Relational_equality_expressionContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " ";

        if (ctx.RELATIONEQOPERATORS() == null) {
            return cpp;
        } else if (ctx.RELATIONEQOPERATORS().toString() == "==") {
            cpp.GlobalScope += "== ";
        } else {
            cpp.GlobalScope += "!= ";
        }

        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitRelational_operator_expression(
            arcv2Parser.Relational_operator_expressionContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " ";

        if (ctx.RELATIONOPERATORS() == null) {
            return cpp;
        } else if (ctx.RELATIONOPERATORS().toString() == "<") {
            cpp.GlobalScope += "< ";
        } else if (ctx.RELATIONOPERATORS().toString() == ">") {
            cpp.GlobalScope += "> ";
        } else if (ctx.RELATIONOPERATORS().toString() == "<=") {
            cpp.GlobalScope += "<= ";
        } else {
            cpp.GlobalScope += ">= ";
        }

        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitAnd_expression(arcv2Parser.And_expressionContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " and ";
        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitOr_expression(arcv2Parser.Or_expressionContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        temp = visit(ctx.expression(0));
        cpp.GlobalScope += temp.GlobalScope + " or ";
        temp = visit(ctx.expression(1));
        cpp.GlobalScope += temp.GlobalScope;

        return cpp;
    }

    /*
     * Block CodeGen
     */

    @Override
    public CodeGenStringObject visitBlock(arcv2Parser.BlockContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        List<StatementContext> list = ctx.statement();
        cpp.GlobalScope += "{";
        for (int i = 0; i < list.size(); i++) {
            temp = visit(list.get(i));
            cpp.GlobalScope += temp.GlobalScope;
        }
        cpp.GlobalScope += "}";

        return cpp;
    }

    /*
     * Statement CodeGen
     */

    @Override
    public CodeGenStringObject visitBlock_statement(arcv2Parser.Block_statementContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();

        cpp = visitChildren(ctx);

        return cpp;
    }

    @Override
    public CodeGenStringObject visitReturn_statement(arcv2Parser.Return_statementContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        if (ctx.RETURN() != null) {
            cpp.GlobalScope += "return ";
            temp = visit(ctx.expression());
            cpp.GlobalScope += temp.GlobalScope;
        }

        return cpp;
    }

    @Override
    public CodeGenStringObject visitIf_else_statement(arcv2Parser.If_else_statementContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        cpp.GlobalScope += "if";
        cpp.GlobalScope += "(";

        temp = visit(ctx.expression());
        cpp.GlobalScope += temp.GlobalScope + " ";

        cpp.GlobalScope += ")";

        cpp.GlobalScope += visitBlock(ctx.block(0)).GlobalScope;

        cpp.GlobalScope += " else ";

        cpp.GlobalScope += visitBlock(ctx.block(1)).GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitForloop_statement(arcv2Parser.Forloop_statementContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();

        cpp.GlobalScope += "for";
        cpp.GlobalScope += "(";

        if (ctx.typing().PREFIXOPERATOR() != null) {
            cpp.GlobalScope += "";
        }

        if (ctx.typing().TYPE() != null) {
            cpp.GlobalScope += cpp.Type_Coverter(ctx.typing().TYPE().toString()) + " ";
        }

        cpp.GlobalScope += ctx.IDENTIFIER(0).toString() + " ";

        if (ctx.typing().TYPEOPERATOR() != null) {
            cpp.GlobalScope += "[]";
        }

        cpp.GlobalScope += ": ";

        cpp.GlobalScope += ctx.IDENTIFIER(1).toString();

        cpp.GlobalScope += ")";

        cpp.GlobalScope += visitBlock(ctx.block()).GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitWhileloop_statement(arcv2Parser.Whileloop_statementContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        cpp.GlobalScope += "while";
        cpp.GlobalScope += "(";

        temp = visit(ctx.expression());
        cpp.GlobalScope += temp.GlobalScope;

        cpp.GlobalScope += ")";

        cpp.GlobalScope += visitBlock(ctx.block()).GlobalScope;

        return cpp;
    }

    @Override
    public CodeGenStringObject visitVariable_declaration_statement(
            arcv2Parser.Variable_declaration_statementContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        if (ctx.typing().PREFIXOPERATOR() != null) {
            cpp.GlobalScope += "";
        }

        if (ctx.typing().TYPE() != null) {
            cpp.GlobalScope += cpp.Type_Coverter(ctx.typing().TYPE().toString()) + " ";
        }

        cpp.GlobalScope += ctx.IDENTIFIER().toString() + " ";

        if (ctx.typing().TYPEOPERATOR() != null) {
            cpp.GlobalScope += "[]";
        }

        cpp.GlobalScope += "= ";

        // Make this a function
        if (ctx.STARTSQUAREBRACKET() != null) {
            cpp.GlobalScope += "{";

            List<ExpressionContext> list = ctx.expression();
            for (int i = 0; i < list.size(); i++) {
                temp = visit(ctx.expression(i));
                cpp.GlobalScope += temp.GlobalScope;
                if (i + 1 < list.size()) {
                    cpp.GlobalScope += ", ";
                }
            }
            cpp.GlobalScope += "}";
        } else {
            temp = visit(ctx.expression(0));
            cpp.GlobalScope += temp.GlobalScope;
        }
        cpp.GlobalScope += ";";

        return cpp;
    }

    @Override
    public CodeGenStringObject visitAssignment_statement(arcv2Parser.Assignment_statementContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        cpp.GlobalScope += ctx.IDENTIFIER();

        if (ctx.NUMBER() != null) {
            cpp.GlobalScope += "[";
            cpp.GlobalScope += ctx.NUMBER().toString();
            cpp.GlobalScope += "]";
        }

        cpp.GlobalScope += "= ";

        if (ctx.STARTSQUAREBRACKET() != null) {
            List<ExpressionContext> list = ctx.expression();
            cpp.GlobalScope += "{";

            for (int i = 0; i < list.size(); i++) {
                temp = visit(ctx.expression(i));
                cpp.GlobalScope += temp.GlobalScope;
                if (i + 1 < list.size()) {
                    cpp.GlobalScope += ", ";
                }
            }
            cpp.GlobalScope += "}";
        } else {
            temp = visit(ctx.expression(0));
            cpp.GlobalScope += temp.GlobalScope;
        }
        cpp.GlobalScope += ";";

        return cpp;
    }

    @Override
    public CodeGenStringObject visitFunction_call_statement(arcv2Parser.Function_call_statementContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        cpp.GlobalScope += ctx.IDENTIFIER();
        cpp.GlobalScope += "(";
        List<ExpressionContext> list = ctx.expression();
        for (int i = 0; i < list.size(); i++) {
            temp = visit(ctx.expression(i));
            cpp.GlobalScope += temp.GlobalScope;
            if (i + 2 == list.size()) {
                temp = visit(ctx.expression(i));
                cpp.GlobalScope += ", ";
            }
        }
        cpp.GlobalScope += ")";

        cpp.GlobalScope += ";";

        return cpp;
    }

    /*
     * Declaration CodeGen
     */
    @Override
    public CodeGenStringObject visitVariable_declaration(arcv2Parser.Variable_declarationContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();
        CodeGenStringObject temp = new CodeGenStringObject();

        if (ctx.typing().PREFIXOPERATOR() != null) {
            cpp.GlobalScope += "";
        }

        if (ctx.typing().TYPE() != null) {
            cpp.GlobalScope += cpp.Type_Coverter(ctx.typing().TYPE().toString()) + " ";
        }

        cpp.GlobalScope += ctx.IDENTIFIER().toString();

        if (ctx.typing().TYPEOPERATOR() != null) {
            cpp.GlobalScope += "[]";
        }

        cpp.GlobalScope += " " + ctx.ASSIGNMENT().toString() + " ";

        if (ctx.STARTSQUAREBRACKET() != null) {
            cpp.GlobalScope += "{";

            List<ExpressionContext> list = ctx.expression();
            for (int i = 0; i < list.size(); i++) {
                temp = visit(ctx.expression(i));
                cpp.GlobalScope += temp.GlobalScope;
                if (i + 1 < list.size()) {
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
    public CodeGenStringObject visitFunction_declaration(arcv2Parser.Function_declarationContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();

        if (ctx.typing(0).PREFIXOPERATOR() != null) {
            cpp.GlobalScope += "";
        }

        if (ctx.typing(0).TYPE() != null) {
            cpp.GlobalScope += cpp.Type_Coverter(ctx.typing(0).TYPE().toString()) + " ";
        }

        if (ctx.typing(0).TYPEOPERATOR() != null) {
            cpp.GlobalScope += "*";
        }

        cpp.GlobalScope += ctx.IDENTIFIER(0);

        cpp.GlobalScope += "(";

        List<TypingContext> typingList = ctx.typing();
        for (int i = 1; i < typingList.size() - 1; i++) {
            cpp.GlobalScope += functionParameterSetup(ctx, i).GlobalScope;
            cpp.GlobalScope += ", ";
        }
        if (typingList.size() > 1) {
            cpp.GlobalScope += functionParameterSetup(ctx, typingList.size() - 1).GlobalScope;
        }

        cpp.GlobalScope += ")";
        cpp.GlobalScope += "{";

        List<StatementContext> statementList = ctx.statement();
        for (int i = 0; i < statementList.size(); i++) {
            cpp.GlobalScope += visit(statementList.get(i)).GlobalScope;
        }

        cpp.GlobalScope += "}";

        return cpp;
    }

    public CodeGenStringObject functionParameterSetup(arcv2Parser.Function_declarationContext ctx, int i) {
        CodeGenStringObject temp = new CodeGenStringObject();

        if (ctx.typing(i).PREFIXOPERATOR() != null) {
            temp.GlobalScope += "";
        }

        if (ctx.typing(i).TYPE() != null) {
            temp.GlobalScope += temp.Type_Coverter(ctx.typing(i).TYPE().toString()) + " ";
        }

        temp.GlobalScope += ctx.IDENTIFIER(i).toString();

        if (ctx.typing(i).TYPEOPERATOR() != null) {
            temp.GlobalScope += ctx.typing(i).TYPEOPERATOR().toString();
        }

        return temp;
    }

    @Override
    public CodeGenStringObject visitPin_declaration(arcv2Parser.Pin_declarationContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();

        /*
         * => Pre
         * 
         * Define pin(s)
         * 
         * Generate protothread struct(s)
         * 
         * => Setup
         * 
         * PT_INIT struct(s)
         * 
         * PinMode
         */

        return cpp;
    }

    @Override
    public CodeGenStringObject visitTask_declaration(arcv2Parser.Task_declarationContext ctx) {
        CodeGenStringObject cpp = new CodeGenStringObject();

        /*
         * Generate integer(s) which takes in a protothread as its parameter
         * 
         * => Loop
         * 
         * PT_SCHEDULE task(s)
         * 
         * if
         */

        return cpp;
    }

}
