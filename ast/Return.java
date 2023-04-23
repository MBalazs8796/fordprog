package ast;

public class Return extends Statement {
    private Expression expr = null;

    public Return(Program prog, Expression expr) {
        super(prog);
        this.expr = expr;
    }

    @Override
    public void execute() {
        throw new Returning(expr.evaluate(program));
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("return ")
           .append(expr.toString())
           .append("\n");
        return str.toString();
    }
}
