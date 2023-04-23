package ast;

import java.time.Instant;

public class Const extends Expression {
    private final String literal;
    private final Value value;

    public Const(String literal) {
        this.literal = literal;
        if (literal.contains(".")){
            this.value = new Value(Double.parseDouble(literal));
        } else{
            this.value = new Value(Integer.parseInt(literal));
        }
    }

    @Override
    public Value evaluate(Program p) {
        return this.value;
    }

    @Override
    public String toString() {
        return this.literal;
    }
}
