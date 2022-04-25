import antlr.arcv2BaseVisitor;
import antlr.arcv2Parser;
import AstNodes.*;


public class EvalVisitor extends arcv2BaseVisitor<AstNode>{

    @Override 
    public AstNode visitStart(arcv2Parser.StartContext ctx) { 
        AstNode start = new StartNode("start");
        //this only works with a single declaration will have to find out how to go through them one by one
        start.child = visitChildren(ctx);
        return start; 
    }

    @Override 
    public AstNode visitTerminal_expression(arcv2Parser.Terminal_expressionContext ctx) { 
        
        String name;
        if(ctx.IDENTIFIER() != null){
            name = "ID";
        }
        else{
            name = ctx.getText();
        }
        AstNode terminal = new Terminal_expression_node(name);
        return terminal; 
    }

    @Override 
    public AstNode visitPlus_minus_expression(arcv2Parser.Plus_minus_expressionContext ctx) { 
        AstNode plus = new StartNode("plus");
        return plus; }

    @Override 
    public AstNode visitVariable_declaration(arcv2Parser.Variable_declarationContext ctx) { 
        
        AstNode variable_declaration = new Variable_declaration_node("varDec"); 
        variable_declaration.child = new StartNode(ctx.getChild(1).getText());
        variable_declaration.child.rightSibling = visitChildren(ctx);


        if(ctx.STARTSQUAREBRACKET() != null){

            System.out.println(ctx.STARTSQUAREBRACKET().getText());
        }
        return variable_declaration; 
    }
    // @Override 
    // public AstNode visit(arcv2Parser.Plus_minus_expressionContext ctx) { 
    //     AstNode plus = new StartNode("plus");
    //     return plus; }
}
