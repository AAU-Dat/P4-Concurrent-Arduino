package AstNodes;

public class AstNode {

    public enum Types {
        NUM,
        CHAR,
        BOOL,
        PIN
    }

    public AstNode parent;
    public AstNode leftMostSibling = this;
    public AstNode rightSibling;
    public AstNode child;
    public String name;
    public Types type;

    public AstNode(String name) {
        this.name = name;
        System.out.println(name);

    }

    public AstNode() {
    }

    public void print() {
        System.out.println(name);
        if (child != null) {
            child.print();
        }
    }

    // Exsample one
    //      a
    //   b     c
    //      e

    public void MakeSiblings(AstNode newSibling) {
        AstNode rightMostSibling = new AstNode();

        if (this.rightSibling != null) {
            rightMostSibling = FindRightmostSibling(this.rightSibling);
        } else {
            rightMostSibling = this;
        }

        rightMostSibling.rightSibling = newSibling;
        newSibling.parent = this.parent;
        newSibling.leftMostSibling = this.leftMostSibling;
    }

    public AstNode FindRightmostSibling(AstNode right) {
        AstNode res = right;
        while (res.rightSibling != null) {
            res = res.rightSibling;
        }
        return res;
    }

    public void adoptChildren(AstNode newChild) {
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

    // how do i do this if i need them to be differint types of ast nodes fx 1 while
    // node and one expression node
    public void makeFamily(int i) {
        child = new AstNode() {

        };
        for (int j = 0; j < i; j++) {

        }
    }

}