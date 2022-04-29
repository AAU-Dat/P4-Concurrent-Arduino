package CodeGen;

public class CodeGenStringObject {
    public String GlobalScope = "";
    public String Setup = "void setup(){";
    public String Loop = "void loop(){";

    public String Type_Coverter (String input){
        
        if(input.equals("mut num" )|| input.equals("num" )){
            input = "float";
            System.out.println(input);
        }

        if(input.equals("mut char")){
            input = "char";
            System.out.println(input);
        }

        if(input.equals("mut bool")){
            input = "bool";
            System.out.println(input);
        }

        return input;
    }

}
