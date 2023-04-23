package ast;

public class Unary extends Expression {
    private enum UnaryOperator {
        PLS("+"), NEG("-"), ABS("abs"), NOT("not");
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
            case NEG: return new Value(-val.getNumericValue());
            case ABS: {
                double v = val.getNumericValue();
                if (v < 0) {
                    return new Value(-val.getNumericValue());
                } else {
                    return val;
                }
            }
            case NOT: return new Value(!val.getLogicValue());
        }
        return null;
    }
    public String toString() {
        return op.toString() + " " + node.toString();
    }
}
