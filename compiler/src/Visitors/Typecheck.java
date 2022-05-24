package Visitors;


import AstNodes.test_Node;
import Types.Types;


public class Typecheck extends test_Node{
    public static Boolean Check(test_Node[] astnode_array, Types type){
        for (test_Node astNode : astnode_array) {
            if (astNode.type != type){
                return false;
            }
        }
        return true;
    }
}
