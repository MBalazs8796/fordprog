package ast;

public class For extends Statement {
    private Expression logic = null;
    private Statement incement = null;
    private Statement body = null;

    public For(Program prog, Expression logic, Statement increment, Statement body) {
        super(prog);
        this.logic = logic;
        this.incement = increment;
        this.body = body;
    }

    @Override
    public void execute() {
        while (logic.evaluate(program).getIntegerValue()==1) {
            //program.setVariable(idxVar, new Value(b));
            body.execute();
            incement.execute();
        }
    }

    @Override
    public String toString() {
        return "for (" +
                //assignment.toString() +
                "; " +
                logic.toString() +
                "; " +
                incement.toString() +
                ") { \n" +
                body.toString() +
                "}\n";
    }
}
