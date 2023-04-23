package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sequence extends Statement {
    private List<Statement> statements = new ArrayList<Statement>();

    public Sequence(Program prog) {
        super(prog);
    }

    public void addStatement(Statement s) {
        statements.add(s);
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public void execute() {
        for (Statement s: statements) {
            s.execute();
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Statement s: statements) {
            str.append(s.toString()).append("\n");
        }
        return str.toString();
    }
}
