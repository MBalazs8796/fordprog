package ast;

public class For extends Statement {
    private Expression assignment = null;
    private Expression logic = null;
    private Expression incement = null;
    private Statement body = null;

    public For(Program prog, Expression assignment, Expression logic, Expression increment, Statement body) {
        super(prog);
        this.assignment = assignment;
        this.logic = logic;
        this.incement = increment;
        this.body = body;
    }

    @Override
    public void execute() {
        assignment.evaluate(program);
        while (logic.evaluate(program).getLogicValue()) {
            //program.setVariable(idxVar, new Value(b));
            body.execute();
            incement.evaluate(program);
        }
    }

    @Override
    public String toString() {
        return "for (" +
                assignment.toString() +
                "; " +
                logic.toString() +
                "; " +
                incement.toString() +
                ") { \n" +
                body.toString() +
                "}\n";
    }
}
