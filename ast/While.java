package ast;

public class While extends Statement {
    private Expression cond = null;
    private Statement stmt = null;

    public While(Program prog, Expression e, Statement s) {
        super(prog);
        cond = e;
        stmt = s;
    }

    @Override
    public void execute() {
        boolean b; 
        while (b = cond.evaluate(program).getLogicValue()) {
            stmt.execute();
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("while ")
           .append(cond.toString())
           .append("\ndo\n")
           .append(stmt.toString())
           .append("end\n");
        return str.toString();
    }
}
