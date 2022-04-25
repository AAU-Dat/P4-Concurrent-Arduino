package AstNodes;

public class Typecheck extends AstNode{
    public static Boolean Check(AstNode[] astnode_array, Types type){
        for (AstNode astNode : astnode_array) {
            if (astNode.type != type){
                return false;
            }
        }
        return true;
    }
}
