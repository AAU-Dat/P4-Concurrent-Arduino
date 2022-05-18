package test.checkingVisitor;

import static org.junit.Assert.*;

import java.io.IOException;

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
    
    private static ParseTree treeConstructor (String string) {
            

                CharStream input = CharStreams.fromString("num b = 2 + 2;");
                arcv2Lexer lexer = new arcv2Lexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                arcv2Parser parser = new arcv2Parser(tokens);
                ParseTree tree = parser.start();
                System.out.println("lshdfl");
                return tree;
    }

    @Test
    public void visitTerminal_expressionTest(){
        ParseTree tree;
        SemanticVisitor eval = new SemanticVisitor();
            tree = treeConstructor("checkingVisitor/h.txt");
            AST_node AST = eval.visit(tree);


        
    }

            




        assertEquals(Types.NUM, AST.child.child.child.type);


    }

    
}
