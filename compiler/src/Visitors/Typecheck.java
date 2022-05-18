package Visitors;


import AstNodes.AST_node;
import Types.Types;


public class Typecheck extends AST_node{
    public static Boolean Check(AST_node[] astnode_array, Types type){
        for (AST_node astNode : astnode_array) {
            if (astNode.type != type){
                return false;
            }
        }
        return true;
    }
}
