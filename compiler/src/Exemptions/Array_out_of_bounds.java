package Exemptions;

import org.antlr.v4.runtime.tree.TerminalNode;

public class Array_out_of_bounds extends RuntimeException {
    public TerminalNode Context;

    

    
    public Array_out_of_bounds(TerminalNode context){
        super("Index out of bounds of array in line:" + context.getSymbol().getLine() + " index:" + context.getSymbol().getTokenIndex());
        Context = context;
    }
    
  
}