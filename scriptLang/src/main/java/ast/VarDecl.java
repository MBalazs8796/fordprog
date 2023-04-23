package ast;

public class VarDecl extends Statement {
    private String varName;
    private String varType;

    public VarDecl(Program prog, String name, String type) {
        super(prog);
        varName = name;
        varType = type;
    }

    @Override
    public void execute() {
        program.addVariable(varName, varType);
    }

    @Override
    public String toString() {
        return varType +
                " " +
                varName +
                "\n";
    }
}
