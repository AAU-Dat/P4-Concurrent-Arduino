package test.AstNodes;

import static org.junit.Assert.*;

import AstNodes.*;
import org.junit.Test;

public class AstNodeTest {
    

    // This part under here is for trying to merge all the test to fewer onces
    @Test
    public void MakeSiblings_TestFunction_ReturnTrue(){
        // Arrange
        AST_node a = new AST_node();
        AST_node b = new AST_node();
        AST_node c = new AST_node();

        a.adoptChildren(b);
        b.adoptChildren(c);

        // Act
        b.MakeSiblings(c);

        // Assert
        assertEquals(a, b.parent);
        assertEquals(a, c.parent);
        assertEquals(b, a.child.leftMostSibling);
        assertEquals(c, a.child.rightSibling);
        assertEquals(c, b.rightSibling);
        assertTrue(c.rightSibling == null);
        assertEquals(a.child.leftMostSibling, c.leftMostSibling);
    }

    // This test enters the if-part
    @Test
    public void MakeSiblings_HasRightSibling_ReturnTrue(){
        // Arrange
        AST_node origin = new AST_node();
        AST_node originRight = new AST_node();
        AST_node right = new AST_node();

        // Act
        origin.rightSibling = originRight;
        origin.MakeSiblings(right);

        // Assert
        assertEquals(origin.rightSibling.rightSibling, right);
    }
    
    // This test enters the else part
    @Test
    public void MakeSiblings_NoRightSibling_ReturnTrue(){
        // Arrange
        AST_node origin = new AST_node();
        AST_node right = new AST_node();

        // Act
        origin.MakeSiblings(right);

        // Assert
        assertEquals(origin.rightSibling, right);
    }
    
    // This test ensures correct parent update
    @Test
    public void MakeSiblings_HasParent_ReturnTrue(){
        // Arrange
        AST_node origin = new AST_node();
        AST_node parent = new AST_node();
        AST_node right = new AST_node();

        // Act
        origin.parent = parent;
        origin.MakeSiblings(right);

        // Assert
        assertEquals(origin.parent, right.parent);
    }

    // This test ensures that the new nodes.leftmostSiblings is the
    // same as the origin node.leftmostSibling
    @Test
    public void MakeSiblings_UpdateLeftmostSibling_ReturnTrue(){
        // Arrange
        AST_node origin = new AST_node();
        AST_node leftmostSibling = new AST_node();
        AST_node right = new AST_node();

        // Act
        origin.leftMostSibling = leftmostSibling;
        origin.MakeSiblings(right);

        // Assert
        assertEquals(origin.leftMostSibling, right.leftMostSibling);
    }
}
