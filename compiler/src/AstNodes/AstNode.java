package AstNodes;

public class AstNode {

    public enum Types {
        NUM,
        CHAR,
        BOOL,
        PIN
    }

    public AstNode parent;
    public AstNode leftMostSibling;
    public AstNode rightSibling;
    // public AstNode leftSibling;
    public AstNode child;
    public String name;
    public Types type; 
    
    public AstNode(String name) {
        this.name = name;
        System.out.println(name);

    }
    public AstNode(){}
    public void print (){
        System.out.println(name);
        if(child != null){
            child.print();
        }
    }

    public void MakeSiblings(AstNode newSibling){
        // Exsample one
        //        a
        //    b       c     d     e
        //          e

        // Exsample two
        //        a
        //    b       c
        //
        AstNode rightMostSibling = new AstNode();
    
        if(this.rightSibling != null){
            rightMostSibling = FindRightMostSibling(this.rightSibling);
        } else {
            rightMostSibling = this;
        }
        rightMostSibling.rightSibling = newSibling;
        newSibling.parent = this.parent;
        // newSibling.leftSibling = rightMostSibling;
        newSibling.leftMostSibling = this.leftMostSibling;
    }

    public AstNode FindRightMostSibling(AstNode right){
        AstNode res = right;
        while(res.rightSibling != null){
            res = res.rightSibling;
        }
        return res;
    }

    public void adoptChildren(AstNode newChild){
        //this only works of no previuos children
        if(this.child == null){
            this.child = newChild.leftMostSibling;
            newChild.parent = this;
            while (newChild.rightSibling != null){
                newChild.parent = this;
                newChild = newChild.rightSibling;
            }
        }
    }

    //how do i do this if i need them to be differint types of ast nodes fx 1 while node and one expression node
    public void makeFamily(int i){
        child = new AstNode() {
            
        };
        for (int j = 0; j < i; j++) {

        }
    }

}