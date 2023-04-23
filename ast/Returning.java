package ast;

public class Returning extends RuntimeException {
    private Value retval = null;
    public Returning(Value retval) {
        this.retval = retval;
    }
    public Value getValue() {
        return retval;
    }
}
