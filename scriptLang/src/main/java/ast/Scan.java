package ast;

import java.util.Scanner;

public class Scan extends Statement{
    private String varname;
    private Statement parstmt = null;

    public Scan(Program prog, String varname) {
        super(prog);
        this.varname = varname;
    }

    public Scan(Program prog, Statement parstmt, String varname) {
        super(prog);
        this.varname = varname;
        this.parstmt = parstmt;
    }

    @Override
    public void execute() {
        if(parstmt != null){
            parstmt.execute();
        }
        Scanner sc = new Scanner(System.in);
        program.setVariable(varname, new Const(sc.nextLine()).evaluate(program));
    }

    @Override
    public String toString() {
        return "scan(" + varname + ")";
    }
}
