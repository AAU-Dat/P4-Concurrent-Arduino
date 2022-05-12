package symbolTable;
import java.util.Hashtable;
import Types.Types;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.*;

public class SymbolTable {
    private Stack<HashMap<String,SymbolHashTableEntry>> stack = new Stack<HashMap<String,SymbolHashTableEntry>>();
    
    public SymbolTable(){
        stack.push(new HashMap<String,SymbolHashTableEntry>());
        
        String[] identifiers = { "digitalWrite", "anlogWrite"};
        String[] identifiersRead = { "digitalRead", "anlogRead"};

        for (String identifier : identifiers) {
            
            SymbolHashTableEntry entry = new SymbolHashTableEntry(Types.FUNCTION, identifier, false);
            entry.Function_parameter_length = 2;
            Types [] array = {Types.PIN, Types.NUM};
            entry.Function_parameter_types = array;
            entry.Function_return_Type = Types.NUM;
            this.insert(entry);
            
        }
        for (String identifier : identifiersRead) {
            
            SymbolHashTableEntry entry = new SymbolHashTableEntry(Types.FUNCTION, identifier, false);
            entry.Function_parameter_length = 1;
            Types [] array = {Types.PIN};
            entry.Function_parameter_types = array;
            entry.Function_return_Type = Types.NUM;
            this.insert(entry);
            
        }


    }

    public HashMap active_scope () {
        return stack.peek();
    }
    public void pop() {
        stack.pop();
        
    }

    public void push() {
        HashMap<String, SymbolHashTableEntry> new_scope = new HashMap<String,SymbolHashTableEntry>();
        stack.push(new_scope);
    }

    public void insert(SymbolHashTableEntry entry) {
        
        
        //if(this.active_scope().containsKey(entry.Identifier)){
        //    entry.Next_entry = (SymbolHashTableEntry) this.active_scope().get(entry.Identifier);
            this.active_scope().put(entry.Identifier, entry);
        //}
    }

    public Boolean containsKey (String key){
        return this.active_scope().containsKey(key);
    }

    public SymbolHashTableEntry get (String key){
        SymbolHashTableEntry entry = null;
        ListIterator<HashMap<String, SymbolHashTableEntry>> iterator = stack.listIterator();
        while (iterator.hasNext() && entry == null) {
            HashMap<String, SymbolHashTableEntry> scope = iterator.next();
            if(scope.containsKey(key)){
                return scope.get(key);
            }
            
        }
        return null;
        
    }

}


