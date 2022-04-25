import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlr.*;

public class App {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("src/astTestFile.txt");
        arcv2Lexer lexer = new arcv2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        arcv2Parser parser = new arcv2Parser(tokens);
        ParseTree tree = parser.start();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
        System.out.println("Hello, World!");
    }
}
