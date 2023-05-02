package ast;

public class Delete extends Statement{
    private String target;

    public Delete(Program prog, String target) {
        super(prog);
        this.target = target;
    }

    @Override
    public void execute() {
        program.deleteVariable(target);
    }

    @Override
    public String toString() {
        return  "del " +
                target +
                "\n";
    }
}
