package ast;

import java.util.ArrayList;
import java.util.List;

public abstract class Statement {
    protected Program program = null;

    protected Statement(Program prog) {
        program = prog;
    }

    public abstract void execute();

    public abstract String toString();
}
