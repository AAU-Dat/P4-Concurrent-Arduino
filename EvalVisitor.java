import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends arcv2BaseVisitor<Integer>{

    @Override 
    public Integer visitTerminal_expression(arcv2Parser.Terminal_expressionContext ctx) { 
        System.out.println(ctx +"\n");
        return 0; }

    @Override 
    public Integer visitPlus_minus_expression(arcv2Parser.Plus_minus_expressionContext ctx) { 
        System.out.println(ctx);
        return 0; }
}