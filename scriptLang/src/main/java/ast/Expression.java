package ast;

public abstract class Expression {
    public abstract Value evaluate(Program p);
}
