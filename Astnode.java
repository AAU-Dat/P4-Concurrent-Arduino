public abstract class AstNode {

    public AstNode parent;
    public AstNode leftMostSibling;
    public AstNode rightSibling;
    public AstNode child;

    public AstNode() {

    }

    void MakeSiblings(AstNode newSibling){
        //this only works if the this object does not have any rightmost sibling and new siblings does not have any siblings themselves
        if(this.rightSibling == null){
            this.rightSibling = newSibling;
            newSibling.parent = this.parent;
            newSibling.leftMostSibling = this.leftMostSibling;
        }
    }

    void adoptChildren(AstNode newChild){
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
    void makeFamily(){
        
    }

}