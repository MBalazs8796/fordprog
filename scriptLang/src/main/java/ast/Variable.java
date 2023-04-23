package ast;

import java.time.Instant;

public class Variable extends Expression {
    private String id;

    public Variable(String id) {
        this.id = id;
    }

    @Override
    public Value evaluate(Program p) {
        if("TIME".equals(id)){
            // def c creates time value
            return new Value();
        }
        return p.getVariable(this.id);
    }

    @Override
    public String toString() {
        return id;
    }
}
