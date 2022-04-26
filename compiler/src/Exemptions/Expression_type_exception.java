package Exemptions;


import antlr.arcv2Parser.ExpressionContext;

public class Expression_type_exception extends RuntimeException {
    public ExpressionContext Context;
    
    public Expression_type_exception() {
    }
    
    public Expression_type_exception(java.lang.String message) {
        super(message);
    }
    
    public Expression_type_exception(java.lang.String message, ExpressionContext context){
        super(message);
        Context = context;
    }
    
  
}