package ast;

public class If extends Statement {
    private Expression cond = null;
    private Statement trueBranch = null;
    private Statement falseBranch = null;

    public If(Program prog, Expression cond, Statement trus, Statement fals) {
        super(prog);
        this.cond = cond;
        this.trueBranch = trus;
        this.falseBranch = fals;
    }

    @Override
    public void execute() {
        Value v = cond.evaluate(program);
        if (v.getLogicValue()) {
            trueBranch.execute();
        } else if (falseBranch != null) {
            falseBranch.execute();
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("if ")
           .append(cond.toString())
           .append("\nthen\n")
           .append(trueBranch.toString());
        if (falseBranch != null) {
            str.append("else\n")
               .append(falseBranch.toString());
        }
        str.append("end\n");
        return str.toString();
    }
}
