package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment extends Statement {
    private String varName;
    private Expression expr;

    public Assignment(Program prog, String varName, Expression expr) {
        super(prog);
        this.varName = varName;
        this.expr = expr;
    }

    @Override
    public void execute() {
        program.setVariable(varName, expr.evaluate(program));
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(varName)
                .append(" = ")
                .append(expr.toString())
                .append("\n");
        return str.toString();
    }

}
