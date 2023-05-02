package ast;


public class Print extends Statement {
    private Expression expr;
    private Statement parstmt = null;

    public Print(Program prog, Expression expr) {
        super(prog);
        this.expr = expr;
    }

    public Print(Program prog, Statement parstmt, Expression expr) {
        super(prog);
        this.parstmt = parstmt;
        this.expr = expr;
    }

    @Override
    public void execute() {
        if(parstmt != null){
            parstmt.execute();
        }
        System.out.println(expr.evaluate(program));
    }

    @Override
    public String toString() {
        return "print (" + expr.toString() + ")\n";
    }
}
