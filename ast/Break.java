package ast;

public class Break extends Statement {

    public Break(Program prog) {
        super(prog);
    }

    @Override
    public void execute() {
        throw new Breaking();
    }

    @Override
    public String toString() {
        return "break";
    }
}
