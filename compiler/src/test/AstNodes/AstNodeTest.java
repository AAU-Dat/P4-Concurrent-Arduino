package test.AstNodes;

import static org.junit.Assert.*;

import AstNodes.*;
import org.junit.Test;

public class AstNodeTest {

    public AstNode defualtAST(String var, String var2) {
        AstNode testNode = new AstNode("Start");
        testNode.child = new AstNode("Decl");
        testNode.child.rightSibling = new AstNode(var);
        testNode.child.rightSibling.rightSibling = new AstNode(var2);
        testNode.child.rightSibling.parent = testNode;
        testNode.child.rightSibling.rightSibling.parent = testNode;
        testNode.child.rightSibling.leftMostSibling = testNode;
        testNode.child.rightSibling.rightSibling.leftMostSibling = testNode;

        return testNode;
    }

    public AstNode defualtAST(String var) {
        AstNode testNode = new AstNode("Start");
        testNode.child = new AstNode("Decl");
        testNode.child.rightSibling = new AstNode(var);
        testNode.child.rightSibling.parent = testNode;
        testNode.child.rightSibling.leftMostSibling = testNode;

        return testNode;
    }

    // region Test Evaluation of each individual Node

    // endregion

    // region Test AST Nodes

    @Test
    public void twoNodesCanBeMadeSiblings() {
        // Variable for naming the nodes
        String var = "7";

        // Responsible for setting up the defaultAST
        AstNode defualtAST = defualtAST(var);

        // Responsible for creating two test notes for us to run our test on
        AstNode testNode1 = new AstNode("Start");
        testNode1.child = new AstNode("Decl");

        // Responsible for running the test on Make Siblings
        testNode1.child.MakeSiblings(new AstNode(var));

        // Responsible for testing that defaultAST and testNode1's rightSibling share
        // the same name
        assertEquals(defualtAST.child.rightSibling.name, testNode1.child.rightSibling.name);
    }

    @Test
    public void findRightmostSiblingReturnsRightmostSibling() {

    }
    // endregion
}
