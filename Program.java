import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class Program {
    public static void main(String[] args) {
        
        CharStream input = CharStreams.fromString("num a = 777;");

        arcv2Lexer lexer = new arcv2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        arcv2Parser parser = new arcv2Parser(tokens);
        ParseTree tree = parser.start();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}