import antlr.arcv2BaseVisitor;
import antlr.arcv2Parser;
import antlr.arcv2Parser.ExpressionContext;
import antlr.arcv2Parser.StatementContext;
import antlr.arcv2Parser.TypingContext;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.antlr.v4.runtime.tree.TerminalNode;

import AstNodes.*;
import Types.Types;
import symbolTable.*;

import Exemptions.Expression_type_exception;


public class EvalVisitor extends arcv2BaseVisitor<AST_node> {
    SymbolTable symbolTable = new SymbolTable(); 
    
    
    Types convert_string_to_Types (String string){

        Types type;
        switch (string) {
            case "num":
                type = Types.NUM;
                break;
            case "char":
                type = Types.CHAR;
                break;
            case "bool":
                type = Types.BOOL;
                break;
        
            default:
                type = null;
                break;
        }

        return type;
    }


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
            SymbolHashTableEntry id = symbolTable.get(ctx.IDENTIFIER().getText());
            if(id == null){
                throw new RuntimeException("This variable has not been declared '" + ctx.IDENTIFIER().getText() + "'");
            }
            else{
                terminal.type = id.Type;
            }
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

    @Override
    public AST_node visitArray_access_expression(arcv2Parser.Array_access_expressionContext ctx) {
        //Integer index = Integer.parseInt(ctx.children.get(2).toString());
        Array_access_node array_node = new Array_access_node("array_access",
                Integer.parseInt(ctx.children.get(2).toString()));
        
        SymbolHashTableEntry entry = symbolTable.get(ctx.IDENTIFIER().getText());
        if (entry == null) {
            throw new RuntimeErrorException(null, "this identifier '" + ctx.IDENTIFIER().getText() + "' does not exist" );
            
        }

        array_node.type = entry.Type;
        
        
        
        return array_node;
    }

    @Override
    public AST_node visitFunction_access_expression(arcv2Parser.Function_access_expressionContext ctx) {
        AST_node function_call = new AST_node("function");

        //TODO HANDLE ARDUINO FUNCTIONS!!
        if (ctx.ARDUINOFUNCTIONS() != null)
            System.out.println("arduinofunction");



        SymbolHashTableEntry entry = symbolTable.get(ctx.IDENTIFIER().getText());
        if(entry == null){
            throw new RuntimeException("This function has not been declared '" + ctx.IDENTIFIER().getText() + "'");
        }


        List<ExpressionContext>  expression_list = ctx.expression();
        if (entry.Function_parameter_length == expression_list.size()) {
            for (int i = 0; i < expression_list.size(); i++) {
                function_call.child = visit(expression_list.get(i));
                if (function_call.child.type != entry.Function_parameter_types[i]) {
                    throw new Expression_type_exception("non matching types between parameter "  + "and asigned value '" + ctx.expression(i).getText() + "' inside function" + entry.Identifier);
                } 
            }
            
        }
        else{
            throw new Expression_type_exception("not correct amount of parameters in function call to " + entry.Identifier);
        }


        function_call.type = entry.Function_return_Type;
        
        return function_call;
    }



    @Override
    public AST_node visitVariable_declaration(arcv2Parser.Variable_declarationContext ctx) {

        AST_node variable_declaration = new Variable_declaration_node("varDec");

        Types var_dec_type = convert_string_to_Types(ctx.typing().TYPE().getText());
        String var_dec_identifier = ctx.IDENTIFIER().getText();
        boolean var_dec_mutability = ctx.typing().PREFIXOPERATOR() == null ? false : true;


        SymbolHashTableEntry entry = new SymbolHashTableEntry(var_dec_type, var_dec_identifier, var_dec_mutability);
        
        List<ExpressionContext>  expression_list = ctx.expression();
        entry.Array_length = expression_list.size()-1;
        for (ExpressionContext expressionContext : expression_list) {
            variable_declaration.child = visit(expressionContext);

            if (var_dec_type != variable_declaration.child.type) {
                throw new Expression_type_exception("non matching types between variable '" + var_dec_identifier + "'and asigned value '" + ctx.expression(0).getText() + "'");
            }    
        }
        if (!symbolTable.containsKey(entry.Identifier)) {
            symbolTable.insert(entry);
        }
        else{
            throw new Expression_type_exception("cannot declare 2 varibles with the same identifier in the same scope" + entry.Identifier);
        }
        



        return variable_declaration;
    }
    @Override
    public AST_node visitBlock(arcv2Parser.BlockContext ctx) {

        symbolTable.push();

        AST_node block = new Variable_declaration_node("block");

        List<arcv2Parser.StatementContext> list = ctx.statement();
        for (arcv2Parser.StatementContext statementContext : list) {
            visit(statementContext);   
        }
        symbolTable.pop();


        return block;
    }

    @Override
    public AST_node visitFunction_declaration(arcv2Parser.Function_declarationContext ctx){
        AST_node func = new Variable_declaration_node("function");
        //here we need to do a block without a block, to simulate intering into a scope but we also need to remember the parameters so a regular block is not a good fit
        // because there isnt a good way to pass the parameters which should exist in the scope to it.
        List<TypingContext> typing = ctx.typing();
        List<TerminalNode> identifier_list = ctx.IDENTIFIER();

        //here we create the symboltable entry from the functions typing and parameters the 0 element in the typing list is always the return type
        SymbolHashTableEntry entry = new SymbolHashTableEntry(Types.FUNCTION, identifier_list.get(0).getText(), typing.get(0).PREFIXOPERATOR() != null ? true : false);
        Types[] parameter_list = new Types[typing.size()];
        for (int i = 0; i < typing.size(); i++) {
            parameter_list[i] = convert_string_to_Types(typing.get(i).TYPE().getText());
        }
        entry.Function_return_Type = convert_string_to_Types(typing.get(0).TYPE().getText());
        entry.Function_parameter_types = parameter_list;
        entry.Function_parameter_length = typing.size()-1;
        
        symbolTable.insert(entry);
        

        //here we start the function declarations scope and ad the parameters as local variables
        symbolTable.push();
        for (int i = 1; i < typing.size(); i++) {
            entry = new SymbolHashTableEntry(convert_string_to_Types(typing.get(i).TYPE().getText()), identifier_list.get(i).getText(), typing.get(i).PREFIXOPERATOR() == null ? true : false);
            symbolTable.insert(entry);

        }

        //here we visit the statements inside of the scope to check for type error etc.
        List<StatementContext> statement_list = ctx.statement();
        for (StatementContext statementContext : statement_list) {
            visit(statementContext);
        }

        symbolTable.pop();


        return func;
    }

    @Override
    public AST_node visitVariable_declaration_statement(arcv2Parser.Variable_declaration_statementContext ctx){
        AST_node variable_declaration = new Variable_declaration_node("varDec");
        Types var_dec_type = convert_string_to_Types(ctx.typing().TYPE().getText());
        String var_dec_identifier = ctx.IDENTIFIER().getText();
        boolean var_dec_mutability = ctx.typing().PREFIXOPERATOR() == null ? true : false;
        //needs to handle arrays

        SymbolHashTableEntry entry = new SymbolHashTableEntry(var_dec_type, var_dec_identifier, var_dec_mutability);
        
        List<ExpressionContext>  expression_list = ctx.expression();
        entry.Array_length = expression_list.size()-1;

        for (ExpressionContext expressionContext : expression_list) {
            variable_declaration.child = visit(expressionContext);

            if (var_dec_type != variable_declaration.child.type) {
                throw new Expression_type_exception("non matching types between variable '" + var_dec_identifier + "'and asigned value '" + ctx.expression(0).getText() + "'" + ctx.IDENTIFIER().getSymbol().getLine());
            }    
        }
        //todo have to handle double creation of the same variable
        if (!symbolTable.containsKey(entry.Identifier)) {
            symbolTable.insert(entry);
        }
        else{
            throw new Expression_type_exception("cannot declare 2 varibles with the same identifier in the same scope '" + entry.Identifier + "' ");
        }
        
        return variable_declaration;
    }

    @Override public AST_node visitBlock_statement(arcv2Parser.Block_statementContext ctx) { return visitChildren(ctx); }
    

    //TODO insure these only happen inside of function declarations
    @Override public AST_node visitReturn_statement(arcv2Parser.Return_statementContext ctx) { return visitChildren(ctx); }


    @Override public AST_node visitIf_else_statement(arcv2Parser.If_else_statementContext ctx) { 
        
        AST_node if_else_node = new AST_node("if_else");
        if_else_node.child = visit(ctx.expression());
        if (if_else_node.child.type != Types.BOOL) {
            throw new Expression_type_exception("the if_else expression has bad typing");
        } 
        return if_else_node;
    
    }


    @Override public AST_node visitForloop_statement(arcv2Parser.Forloop_statementContext ctx) { 
        
        AST_node for_loop_node = new AST_node("for_loop");
        if (!symbolTable.containsKey(ctx.IDENTIFIER(1).getText())) {
            throw new RuntimeErrorException(null, "this identifier '" + ctx.IDENTIFIER(1).getText() + "' does not exist" );
        }

        SymbolHashTableEntry entry = symbolTable.get(ctx.IDENTIFIER(1).getText());

        if (convert_string_to_Types(ctx.typing().TYPE().getText()) != entry.Type ) {
            throw new Expression_type_exception("the for_loop expression has bad typing");
        } 
        return for_loop_node;
    }




    @Override public AST_node visitWhileloop_statement(arcv2Parser.Whileloop_statementContext ctx) { 
        
        AST_node while_loop_node = new AST_node("while_loop");
        while_loop_node.child = visit(ctx.expression());
        if (while_loop_node.child.type != Types.BOOL) {
            throw new Expression_type_exception("the while_loop expression has bad typing");
        } 
        return while_loop_node;

    }



    @Override public AST_node visitAssignment_statement(arcv2Parser.Assignment_statementContext ctx) { 
        AST_node assingment_node = new AST_node("assingnment");

        SymbolHashTableEntry entry = symbolTable.get(ctx.IDENTIFIER().getText());
        
        //TODO we should think about assignmet to pin array even should be possible, and if so how? are they even mutable by default?
        //TODO  this needs to handle arrays (should we even allow array assignment)
        AST_node expression = visit(ctx.expression(0));

        if (entry == null) {
            throw new RuntimeException(" this varible '" + ctx.IDENTIFIER().getText() + "' does not exist");
        }
        else if (entry.Mutability != true) {
            throw new RuntimeException(" this varible '" + ctx.IDENTIFIER().getText() + "' is not mutable and therefore cannot be assigned to");
        }
        else if (entry.Type !=  expression.type) {
            throw new Expression_type_exception("the assingment expression has bad typing");
        }
        else{
            symbolTable.insert(entry);
        }


        return assingment_node;
     }

    @Override public AST_node visitFunction_call_statement(arcv2Parser.Function_call_statementContext ctx) { 
        AST_node function_call = new AST_node("function");
        if (ctx.ARDUINOFUNCTIONS() != null)
            System.out.println("arduinofunction");



        SymbolHashTableEntry entry = symbolTable.get(ctx.IDENTIFIER().getText());
        if(entry == null){
            throw new RuntimeException("This function has not been declared '" + ctx.IDENTIFIER().getText() + "'");
        }


        List<ExpressionContext>  expression_list = ctx.expression();
        if (entry.Function_parameter_length == expression_list.size()) {
            for (int i = 0; i < expression_list.size(); i++) {
                function_call.child = visit(expression_list.get(i));
                if (function_call.child.type != entry.Function_parameter_types[i]) {
                    throw new Expression_type_exception("non matching types between parameter "  + "and asigned value '" + ctx.expression(i).getText() + "' inside function" + entry.Identifier);
                } 
            }
            
        }
        else{
            throw new Expression_type_exception("not correct amount of parameters in function call to " + entry.Identifier);
        }


        function_call.type = entry.Function_return_Type;
        
        return function_call;
     }



     @Override public AST_node visitTask_declaration(arcv2Parser.Task_declarationContext ctx) { 
         //TODO we need to remove typing from task declaration since it its not declarations of parameters but actual parameters

         AST_node task = new Variable_declaration_node("task");

         //here we start the task declarations scope 
         symbolTable.push();
         
         List<TerminalNode> identifier_list = ctx.IDENTIFIER();
         
         //we create a list of the identifiers that we need to check if they exist in the symbol table and if they are mutable and if they do 
         //we insert them into the task scope to prevent other varibles having the same name.
         for (TerminalNode identifier: identifier_list) {
            SymbolHashTableEntry entry = symbolTable.get(identifier.getText());
            if (entry == null) {
                throw new RuntimeException("the parameter '" + identifier.getText() + "' does not exist in symboltable" );
            }
            else if ( entry.Mutability == false){
                throw new RuntimeException(" this varible '" + entry.Identifier + "' is not mutable and therefore cannot be assigned to");
            }
            else{
                symbolTable.insert(entry);
            }
        }
         
         //here we visit the statements inside of the scope to check for type error etc.
         List<StatementContext> statement_list = ctx.statement();
         for (StatementContext statementContext : statement_list) {
             visit(statementContext);
         }
 
         symbolTable.pop();
 
 
         return task;
    
    }

     @Override public AST_node visitPin_declaration(arcv2Parser.Pin_declarationContext ctx) { 
         //TODO need to make alot of pin specific code in assignment 
        
        AST_node pin_declaration = new AST_node("pinDec");
        Types var_dec_type = Types.PIN;
        String var_dec_identifier = ctx.IDENTIFIER().getText();
        boolean var_dec_mutability = ctx.INPUT() == null ? true : false;


        SymbolHashTableEntry entry = new SymbolHashTableEntry(var_dec_type, var_dec_identifier, var_dec_mutability);
        

        if (!symbolTable.containsKey(entry.Identifier)) {
            symbolTable.insert(entry);
        }
        else{
            throw new Expression_type_exception("cannot declare 2 varibles with the same identifier in the same scope '" + entry.Identifier + "' ");
        }
        
        return pin_declaration;
    
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
