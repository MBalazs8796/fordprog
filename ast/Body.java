package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Body {
    private List<Statement> statements = new ArrayList<Statement>();

    public void addStatements(Sequence s) {
        statements = s.getStatements();
    }

    public void execute() {
        for (Statement s: statements) {
            s.execute();
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Statement s: statements) {
            str.append(s.toString());
        }
        return str.toString();
    }
}
