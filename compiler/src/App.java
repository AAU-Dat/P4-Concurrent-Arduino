import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import AstNodes.*;
import antlr.*;
import CodeGen.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() + " bad, bad declaration");
        }
        CodeGenVisitor cgv = new CodeGenVisitor();
        CodeGenStringObject cppc = cgv.visit(tree);
        System.out.println(cppc.GlobalScope + "\n\n");
        System.out.println(cppc.Setup + "\n\n");
        System.out.println(cppc.Loop + "\n\n");

        try {
            File myObj = new File("translatedC++.cpp");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("translatedC++.cpp");
            myWriter.write(cppc.GlobalScope + "\n\n");
            myWriter.write(cppc.Setup + "\n\n");
            myWriter.write(cppc.Loop + "\n\n");
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}