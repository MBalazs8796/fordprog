package ast;

public class Variable extends Expression {
    private String id;

    public Variable(String id) {
        this.id = id;
    }

    @Override
    public Value evaluate(Program p) {
        return p.getVariable(this.id);
    }

    @Override
    public String toString() {
        return id;
    }
}
