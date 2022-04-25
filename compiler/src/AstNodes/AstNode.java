package AstNodes;
public abstract class AstNode {

    public AstNode parent;
    public AstNode leftMostSibling;
    public AstNode rightSibling;
    public AstNode child;
    public String name;

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
        //this only works if the this object does not have any rightmost sibling and new siblings does not have any siblings themselves
        if(this.rightSibling == null){
            this.rightSibling = newSibling;
            newSibling.parent = this.parent;
            newSibling.leftMostSibling = this.leftMostSibling;
        }
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