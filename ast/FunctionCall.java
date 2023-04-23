package ast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FunctionCall extends Expression {
    private String fname;
    private List<Expression> args;
    public FunctionCall(String fname, List<Expression> args) {
        this.fname = fname;
        this.args = args;
    }

    @Override
    public Value evaluate(Program p) {
        Function f = p.getFunction(this.fname);
        Map<String, Value> params = new HashMap<String, Value>();
        Iterator<String> parameters = f.getParameterNames().iterator();
        Iterator<Expression> arguments = args.iterator();
        while (parameters.hasNext() && arguments.hasNext()) {
            String pname = parameters.next();
            Expression e = arguments.next();
            params.put(pname, e.evaluate(p));
        }
        p.newStackFrame();
        for (Map.Entry<String, Value> arg : params.entrySet()) {
            p.addVariable(arg.getKey());
            p.setVariable(arg.getKey(), arg.getValue());
        }
        Value retval = null;
        try {
            f.execute();
        } catch (Returning r) {
            retval = r.getValue();
        }
        p.freeStackFrame();
        return retval;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(fname);
        str.append("(");
        Iterator<Expression> argit = args.iterator();
        if (argit.hasNext()) {
            str.append(argit.next().toString());
            while (argit.hasNext()) {
                str.append(", ");
                str.append(argit.next().toString());
            }
        }
        str.append(")");
        return str.toString();
    }
}
