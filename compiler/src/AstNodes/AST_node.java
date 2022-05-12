package AstNodes;

import Types.Types;

public class AST_node {



    public AST_node parent;
    public AST_node leftMostSibling = this;
    public AST_node rightSibling;
    public AST_node child;
    public String name;
    public Types type;

    public AST_node(String name) {
        this.name = name;
        //System.out.println(name);

    }

    public AST_node() {
    }

    public void print() {
        System.out.println(name);
        if (child != null) {
            child.print();
        }
    }

    /**
     * MakeSiblings function takes a node and gives it a new sibling.
     * While doing that it also make sure that they new siblings gets
     * the correct parent and gets the correct leftmost siblings as the
     * parent nodes leftmost sibling.
     * @param newSibling new sibling of caller
     */

    public void MakeSiblings(AST_node newSibling) {
        AST_node rightMostSibling = new AST_node();

        if (this.rightSibling != null) {
            rightMostSibling = FindRightmostSibling(this.rightSibling);
        } else {
            rightMostSibling = this;
        }

        rightMostSibling.rightSibling = newSibling;
        newSibling.parent = this.parent;
        newSibling.leftMostSibling = this.leftMostSibling;
    }

    /**
     * FindRighmostSibling checks if the leftmost sibling have a right sibling.
     * until the right sibling has no right sibling.
     * @param right The node to the right from the leftmost node 
     * @return      The rightmost sibling
     */
    public AST_node FindRightmostSibling(AST_node right) {
        AST_node res = right;
        while (res.rightSibling != null) {
            res = res.rightSibling;
        }
        return res;
    }

    /**
     * adoptChildren ensures that the caller gets a new child which param newChild.
     * @param newChild becomes child of caller
     */
    public void adoptChildren(AST_node newChild) {
        if (this.child == null) {
            this.child = newChild.leftMostSibling;
            while (newChild.rightSibling != null) {
                newChild.parent = this;
                newChild = newChild.rightSibling;
            }
            newChild.parent = this;
        }
        // Add new children to the right of the rightmost child
        else {
            while (newChild.rightSibling != null) {
                this.child.MakeSiblings(newChild);
                newChild = newChild.rightSibling;
            }
            this.child.MakeSiblings(newChild);
        }
    }

    /**
     * Make comment here jamie
     * @param i
     */
    // how do i do this if i need them to be differint types of ast nodes fx 1 while
    // node and one expression node
    public void makeFamily(int i) {
        child = new AST_node() {

        };
        for (int j = 0; j < i; j++) {

        }
    }

}