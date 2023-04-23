package ast;

public class Ternary extends Expression{
    private Expression cond;
    private Expression trueBranch;
    private Expression falseBranch;

    public Ternary(Expression cond, Expression trueBranch, Expression falseBranch) {
        this.cond = cond;
        this.trueBranch = trueBranch;
        this.falseBranch = falseBranch;
    }

    @Override
    public Value evaluate(Program p) {
        Value v = cond.evaluate(p);
        if (v.getIntegerValue()==1) {
            return trueBranch.evaluate(p);
        } else if (falseBranch != null) {
            return falseBranch.evaluate(p);
        }
        return new Value(0);
    }
}
