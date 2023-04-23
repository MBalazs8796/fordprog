package ast;

public class VarDecl extends Statement {
    private String varName;

    public VarDecl(Program prog, String name) {
        super(prog);
        varName = name;
    }

    @Override
    public void execute() {
        program.addVariable(varName);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("var ")
           .append(varName)
           .append("\n");
        return str.toString();
    }
}
