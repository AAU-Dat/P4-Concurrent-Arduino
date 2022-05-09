package symbolTable;
import java.util.Hashtable;
import Types.Types;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.nio.channels.spi.SelectorProvider;
import java.util.*;

public class SymbolTable {
    private Stack<HashMap<String,SymbolHashTableEntry>> stack = new Stack<HashMap<String,SymbolHashTableEntry>>();
    
    public SymbolTable(){
        stack.push(new HashMap<String,SymbolHashTableEntry>());

        SymbolHashTableEntry digitalRead = new SymbolHashTableEntry(Types.FUNCTION, "digitalRead", false);
        digitalRead.Function_parameter_length = 2;
        Types[] digitalReadArray = {Types.PIN, null};
        digitalRead.Function_parameter_types = digitalReadArray;
        this.insert(digitalRead);

        SymbolHashTableEntry digitalWrite = new SymbolHashTableEntry(Types.FUNCTION, "digitalWrite", false);
        digitalWrite.Function_parameter_length = 2;
        Types[] digitalWriteArray = {Types.PIN, null};
        digitalWrite.Function_parameter_types = digitalWriteArray;
        this.insert(digitalWrite);

        SymbolHashTableEntry analogRead = new SymbolHashTableEntry(Types.FUNCTION, "analogRead", false);
        analogRead.Function_parameter_length = 2;
        Types[] analogReadArray = {Types.PIN, null};
        analogRead.Function_parameter_types = analogReadArray;
        this.insert(analogRead);

        SymbolHashTableEntry analogWrite = new SymbolHashTableEntry(Types.FUNCTION, "analogWrite", false);
        analogWrite.Function_parameter_length = 2;
        Types[] analogWriteArray = {Types.PIN, null};
        analogWrite.Function_parameter_types = analogWriteArray;
        this.insert(analogWrite);
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