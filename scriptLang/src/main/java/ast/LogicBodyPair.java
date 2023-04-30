package ast;

public class LogicBodyPair {
    private Expression logic;
    private Sequence body;

    public LogicBodyPair(Expression logic, Sequence body) {
        this.logic = logic;
        this.body = body;
    }

    public boolean eval(Program p){
        Value v = logic.evaluate(p);
        if (v.getIntegerValue() == 1){
            this.body.execute();
            return true;
        }
        return false;
    }
}
