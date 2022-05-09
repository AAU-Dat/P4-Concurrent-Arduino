package AstNodes;
public class Array_access_node extends AST_node{

    public int Index;
    public Array_access_node(String name, int index){
        super(name);
        Index = index;
    }
}
