package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Program extends Body {
    private Map<String, Function> functions = new HashMap<String, Function>();
    private Map<String, Value> globals = new HashMap<String, Value>();
    private Stack<Map<String, Value>> locals = new Stack<Map<String, Value>>();

    public void addFunction(Function f) {
        functions.put(f.getFname(), f);
    }

    public Function getFunction(String name) {
        return functions.get(name);
    }

    public void addVariable(String name) {
        Map<String, Value> table = globals;
        if (!locals.empty()) {
            table = locals.peek();
        }
        if (table.containsKey(name)) {
            throw new RuntimeException("Double declaration of variable " + name);
        }
        table.put(name, null);
    }

    public void setVariable(String name, Value val) {
        if (!locals.empty() && locals.peek().containsKey(name)) {
            locals.peek().put(name, val);
            return;
        }
        if (!globals.containsKey(name)) {
            throw new RuntimeException("No variable " + name);
        }
        globals.put(name, val);
    }

    public Value getVariable(String name) {
        if (!locals.empty() && locals.peek().containsKey(name)) {
            return locals.peek().get(name);
        }
        if (!globals.containsKey(name)) {
            throw new RuntimeException("No variable " + name);
        }
        return globals.get(name);
    }

    public void newStackFrame() {
        locals.push(new HashMap<String, Value>());
    }

    public void freeStackFrame() {
        if (locals.empty()) {
            throw new RuntimeException("Returning to void");
        }
        locals.pop();
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
