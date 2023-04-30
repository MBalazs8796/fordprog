package ast;

import java.util.List;

public class If extends Statement {
    private final Expression cond;
    private final Statement trueBranch;
    private final Statement falseBranch;
    private List<LogicBodyPair> elseifs;

    public If(Program prog, Expression if_logic, Sequence if_mainSubSeq, Sequence if_elseSubSeq, List<LogicBodyPair> elseifs) {
        super(prog);
        this.cond = if_logic;
        this.trueBranch = if_mainSubSeq;
        this.falseBranch = if_elseSubSeq;
        this.elseifs = elseifs;
    }

    @Override
    public void execute() {
        Value v = cond.evaluate(program);
        if (v.getIntegerValue()==1) {
            trueBranch.execute();
        } else{
            for(LogicBodyPair pair : elseifs){
                if(pair.eval(program)){
                    return;
                }
            }
            if (falseBranch != null) {
                falseBranch.execute();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("if (")
                .append(cond.toString())
                .append(") {\n")
                .append(trueBranch.toString());
        if (falseBranch != null) {
            str.append("else {\n")
                    .append(falseBranch.toString());

        }
        str.append("\n}");
        return str.toString();
    }
}