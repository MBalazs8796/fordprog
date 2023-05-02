package ast;

import java.time.Instant;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Const aConst = (Const) o;
        return literal.equals(aConst.literal) && value.equals(aConst.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(literal, value);
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
