package CodeGen;

public class CodeGenStringObject {
    public String GlobalScope = "";
    public String Setup = "";
    public String Loop = "";

    public String Type_Coverter (String input){
        
        if(input.equals("mut num") || input.equals("num" )){
            input = "float";
        }

        if(input.equals("mut char")){
            input = "char";
        }

        if(input.equals("mut bool")){
            input = "bool";
        }

        return input;
    }

}
