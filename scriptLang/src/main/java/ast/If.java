package ast;

public class If extends Statement {
    private Expression cond = null;
    private Statement trueBranch = null;
    private Statement falseBranch = null;

    public If(Program prog, Expression if_logic, Sequence if_mainSubSeq, Sequence if_elseSubSeq) {
        super(prog);
        this.cond = if_logic;
        this.trueBranch = if_mainSubSeq;
        this.falseBranch = if_elseSubSeq;
    }

    @Override
    public void execute() {
        Value v = cond.evaluate(program);
        if (v.getIntegerValue()==1) {
            trueBranch.execute();
        } else if (falseBranch != null) {
            falseBranch.execute();
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("if (")
                .append(cond.toString())
                .append(") {\n")
                .append(trueBranch.toString());
        if (falseBranch != null) {
            str.append("else {\n")
                    .append(falseBranch.toString());

        }
        str.append("\n}");
        return str.toString();
    }
}