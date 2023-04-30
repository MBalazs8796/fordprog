package ast;

public class Unary extends Expression {
    private enum UnaryOperator {
        PLS("+"), NEG("-"), ABS("ABS"), NOT("not");
        private String text;
        private UnaryOperator(String text) {
            this.text = text;
        }
        public static UnaryOperator getUnaryOperator(String text) {
            for (UnaryOperator b : UnaryOperator.values()) {
                if (b.toString().equals(text)) {
                    return b;
                }
            }
            return null;
        }
        public String toString() {
            return this.text;
        }
    }

    private UnaryOperator op = null;
    private Expression node;
    public Unary(String op, Expression e) {
        this.op = UnaryOperator.getUnaryOperator(op);
        this.node = e;
    }
    public Value evaluate(Program p) {
        Value val = this.node.evaluate(p);
        switch (this.op) {
            case PLS: return val;
            case NEG: return val.isLong() ? new Value(-val.getIntegerValue()) : new Value(-val.getDoubleValue());
            case ABS: {
                if(val.isLong()){
                    return new Value(Math.abs(val.getIntegerValue()));
                } else{
                    return new Value(Math.abs(val.getDoubleValue()));
                }
            }
            case NOT: return new Value( 1 - val.getIntegerValue() == 1);
        }
        return null;
    }
    public String toString() {
        return op.toString() + " " + node.toString();
    }
}
