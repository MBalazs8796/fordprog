package ast;

public class Parens extends Expression {
    private Expression exp;
    public Parens(Expression exp) {
        this.exp = exp;
    }

    @Override
    public Value evaluate(Program p) {
        return exp.evaluate(p);
    }

    @Override
    public String toString() {
        return "(" + exp.toString() + ")";
    }
}
