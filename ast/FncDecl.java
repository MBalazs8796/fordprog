package ast;

public class FncDecl extends Statement {
    private Function f = null;

    public FncDecl(Program prog, Function f) {
        super(prog);
        this.f = f;
    }

    @Override
    public void execute() {
    }

    @Override
    public String toString() {
        return f.toString();
    }
}
