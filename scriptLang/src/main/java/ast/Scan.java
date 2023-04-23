package ast;

import java.util.Scanner;

public class Scan extends Statement{
    private String varname;

    public Scan(Program prog, String varname) {
        super(prog);
        this.varname = varname;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        program.setVariable(varname, new Value(sc.nextDouble()));
    }

    @Override
    public String toString() {
        return "scan(" + varname + ")";
    }
}
