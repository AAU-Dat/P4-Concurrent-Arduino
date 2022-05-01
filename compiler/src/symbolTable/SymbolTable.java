package symbolTable;
import java.util.Hashtable;
import Types.Types;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {
    public Stack<SymbolHashTable> stack = new Stack<SymbolHashTable>();
    public SymbolHashTable[][] Table_storage;

}
public class SymbolHashTable extends HashMap{
    public SymbolHashTable Parent;
}

