package ast;

import java.time.Instant;

public class Const extends Expression {
    private final String literal;
    private final Value value;

    public Const(String literal) {
        this.literal = literal;
        if("time".equals(literal)){
            this.value = new Value(Instant.now().getEpochSecond());
        } else{
            this.value = new Value(Double.parseDouble(literal));
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
