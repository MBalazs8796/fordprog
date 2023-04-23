package ast;

public class ExprStmt extends Statement {
    private Expression expr;

    public ExprStmt(Program prog, Expression expr) {
        super(prog);
        this.expr = expr;
    }

    @Override
    public void execute() {
        expr.evaluate(program);
    }

    @Override
    public String toString() {
        return expr.toString() + "\n";
    }
}
