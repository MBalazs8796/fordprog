package ast;

public class For extends Statement {
    private String idxVar = null;
    private Expression start = null;
    private Expression stop = null;
    private Statement stmt = null;

    public For(Program prog, String v, Expression l, Expression h, Statement s) {
        super(prog);
        idxVar = v;
        start = l;
        stop = h;
        stmt = s;
    }

    @Override
    public void execute() {
        double b = start.evaluate(program).getNumericValue();
        double e = stop.evaluate(program).getNumericValue();
        while (b <= e) {
            program.setVariable(idxVar, new Value(b));
            stmt.execute();
            b += 1.0;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("for ")
           .append(idxVar)
           .append(" in (")
           .append(start.toString())
           .append(", ")
           .append(stop.toString())
           .append(")\ndo\n")
           .append(stmt.toString())
           .append("end\n");
        return str.toString();
    }
}
