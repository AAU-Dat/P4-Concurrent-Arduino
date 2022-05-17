package Exemptions;

import org.antlr.v4.runtime.tree.TerminalNode;

public class Not_whole_number_exception extends RuntimeException {
    public TerminalNode Context;

    

    
    public Not_whole_number_exception(TerminalNode context){
        super("number in line:" + context.getSymbol().getLine() + " index:" + context.getSymbol().getTokenIndex() + " needs to be whole.");
        Context = context;
    }
    
  
}
