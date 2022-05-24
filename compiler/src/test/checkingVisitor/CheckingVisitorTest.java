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
            

                CharStream input = CharStreams.fromString(string);
                arcv2Lexer lexer = new arcv2Lexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                arcv2Parser parser = new arcv2Parser(tokens);
                ParseTree tree = parser.start();
                System.out.println("lshdfl");
                return tree;
    }

    @Test
    public void visitTerminal_expression_number_Test(){
        ParseTree tree;
        SemanticVisitor eval = new SemanticVisitor();

        tree = treeConstructor("num b = 58374589379583984;");
        test_Node AST = eval.visit(tree);

        assertEquals(Types.NUM, AST.child.child.type);
        
    }
    @Test
    public void visitTerminal_expression_char_Test(){
        ParseTree tree;
        SemanticVisitor eval = new SemanticVisitor();

        tree = treeConstructor("char b = \"b\";");
        test_Node AST = eval.visit(tree);

        assertEquals(Types.CHAR, AST.child.child.type);
        
    }


    @Test
    public void visitTerminal_expression_Bool_Test(){
        ParseTree tree;
        SemanticVisitor eval = new SemanticVisitor();

        tree = treeConstructor("bool b = true;");
        test_Node AST = eval.visit(tree);

        assertEquals(Types.BOOL, AST.child.child.type);
        
    }

    @Test
    public void visitTerminal_expression_identifier_Test(){
        ParseTree tree;
        SemanticVisitor eval = new SemanticVisitor();

        tree = treeConstructor("bool a = false; bool b = a;");
        test_Node AST = eval.visit(tree);
        System.out.println(AST.child.child.name);
        assertEquals(Types.BOOL, AST.child.child.type);   
    }

    @Test
    public void visitTerminal_expression_identifier_wrong_type_Test(){
        ParseTree tree;
        SemanticVisitor eval = new SemanticVisitor();

        tree = treeConstructor("num a = 7; bool b = a;");
        test_Node AST = eval.visit(tree);
        System.out.println(AST.child.child.name);
        assertEquals(Types.NUM, AST.child.child.type);   
    }
    

            

}

    

