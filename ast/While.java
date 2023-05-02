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
        while (cond.evaluate(program).getIntegerValue() == 1) {
            try{
                stmt.execute();
            } catch (Breaking b){
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "while (" +
                cond.toString() +
                ") {\n" +
                stmt.toString() +
                "}\n";
    }
}
