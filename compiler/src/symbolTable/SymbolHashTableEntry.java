package symbolTable;
import Types.Types;

public class SymbolHashTableEntry {
    public Types Type;
    public String Identifier;
    public SymbolHashTableEntry Next_entry;
    public Types[] Function_parameter_types;
    public Types Function_return_Type;
    public int Function_parameter_length;
    public int Array_length;
    public boolean Mutability;

    public SymbolHashTableEntry(Types type, String identifier, boolean mutability){
        Type = type;
        Identifier = identifier;
        Mutability = mutability;
    }
    
}