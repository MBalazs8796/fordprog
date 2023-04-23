package ast;

public class Const extends Expression {
    private String literal;
    private Value value;

    public Const(String literal) {
        this.literal = literal;
        this.value = new Value(Double.parseDouble(literal));
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
