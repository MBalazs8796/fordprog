package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Program extends Body {
    private Map<String, Value> globals = new HashMap<String, Value>();

    public void addVariable(String name, String type) {
        if (globals.containsKey(name)) {
            throw new RuntimeException("Double declaration of variable " + name);
        }
        globals.put(name, "double".equals(type) ? new Value(0.0) : new Value(0));
    }

    public void setVariable(String name, Value val) {
        if (globals.containsKey(name)) {
            Value cur_val = globals.get(name);
            if (cur_val != null && cur_val.isLong() != val.isLong()){
                throw new TypeMismatchException("Type mismatch between variable:" + name + " and value: " + val.toString());
            }
            globals.put(name, val.isTime() ? new Value(val.getIntegerValue()) : val);
            return;
        }
        if (!globals.containsKey(name)) {
            throw new RuntimeException("No variable " + name);
        }
        globals.put(name, val);
    }

    public Value getVariable(String name) {
        if (globals.containsKey(name)) {
            return globals.get(name);
        }
        if (!globals.containsKey(name)) {
            throw new RuntimeException("No variable " + name);
        }
        return globals.get(name);
    }

    public void deleteVariable(String name) {
        globals.remove(name);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("## Program\n")
                .append(super.toString())
                .append("## End\n");
        return str.toString();
    }
}
