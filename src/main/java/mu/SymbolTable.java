package mu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    private List<Map<String, Value>> scopes = new ArrayList<>();

    public SymbolTable() {
        pushScope(); // Global scope
    }

    public void pushScope() {
        scopes.add(new HashMap<>());
    }

    public void popScope() {
        if (scopes.size() > 1) { // Never pop global scope
            scopes.remove(scopes.size() - 1);
        }
    }

    // Method to check only the current scope
    public Value getInCurrentScope(String name) {
        return scopes.get(scopes.size() - 1).get(name);
    }

    public void updateValue(String name, Value value) {
        Map<String, Value> m = scopes.get(scopes.size() - 1);
        Value v = m.get(name);
        if (v != null) {
            v.updateValue(value);
        } else {
            put(name, value);
        }
    }

    public void put(String name, Value value) {
        scopes.get(scopes.size() - 1).put(name, value);
    }

    public Value get(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Value value = scopes.get(i).get(name);
            if (value != null) {
                return value;
            }
        }
        return null;
    }
}
