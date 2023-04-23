package ast;

public class Print extends Statement {
    private Expression expr;

    public Print(Program prog, Expression expr) {
        super(prog);
        this.expr = expr;
    }

    @Override
    public void execute() {
        System.out.println(expr.evaluate(program));
    }

    @Override
    public String toString() {
        return "print (" + expr.toString() + ")\n";
    }
}
