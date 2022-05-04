import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import AstNodes.*;
import antlr.*;
import CodeGen.*;

public class App {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("src/astTestFile.txt");
        arcv2Lexer lexer = new arcv2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        arcv2Parser parser = new arcv2Parser(tokens);
        ParseTree tree = parser.start();
        EvalVisitor eval = new EvalVisitor();
        try {
            AST_node AST = eval.visit(tree);
            System.out.println("Hello, World!");
            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        CodeGenVisitor cgv = new CodeGenVisitor();
        CodeGenStringObject cppc = cgv.visit(tree);
        System.out.println(cppc.GlobalScope + "helkjlsjd"); 
    }
}