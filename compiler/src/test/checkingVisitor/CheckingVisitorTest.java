package test.checkingVisitor;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import AstNodes.*;
import Types.Types;

import org.junit.Test;
import antlr.*;
import antlr.arcv2Parser.StartContext;
import Visitors.*;
import AstNodes.*;

public class CheckingVisitorTest {
    
    private static ParseTree treeConstructor (String string){
            
        try {
                CharStream input = CharStreams.fromFileName(string);
                arcv2Lexer lexer = new arcv2Lexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                arcv2Parser parser = new arcv2Parser(tokens);
                ParseTree tree = parser.start();
                System.out.println("lshdfl");
                return tree;
        } catch (Exception e) {
                System.out.print(e.getMessage());
        }
        return null;
    }

    @Test
    public void visitTerminal_expressionTest(){
        ParseTree tree = treeConstructor("h.txt");
        SemanticVisitor eval = new SemanticVisitor();

        AST_node AST = eval.visit(tree);
            




        assertEquals(Types.NUM, AST.child.child.child.type);


    }

    
}
