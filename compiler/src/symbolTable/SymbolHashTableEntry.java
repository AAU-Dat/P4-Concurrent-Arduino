package symbolTable;
import Types.Types;

public class SymbolHashTableEntry {
    public Types Type;
    public String Identifier;
    public SymbolHashTableEntry Next_entry;
    public Types[] Function_parameter_types;
    public Types function_return_Type;
    
}