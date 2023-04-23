package ast;

import java.io.*;

public class Binary extends Expression {
    private enum BinaryOperator {
        ADD("+"), SUB("-"), MUL("*"), DIV("/"), PWR("^"),
        LT("<"), LTE("<="), GT(">"), GTE(">="),
        EQ("=="), NE("!=");
        private final String text;
        private BinaryOperator(String text) {
            this.text = text;
        }
        public static BinaryOperator getBinaryOperator(String text) {
            for (BinaryOperator b : BinaryOperator.values()) {
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

    private BinaryOperator op = null;
    private Expression lhsNode = null;
    private Expression rhsNode = null;
    public Binary(String op, Expression lhs, Expression rhs) {
        this.op = BinaryOperator.getBinaryOperator(op);
        this.lhsNode = lhs;
        this.rhsNode = rhs;
    }

    @Override
    public Value evaluate(Program p) {
        final double EPS = 1e-10;
        Value lhs = this.lhsNode.evaluate(p);
        Value rhs = this.rhsNode.evaluate(p);
        if(lhs.isLong() != rhs.isLong()){
            throw new TypeMismatchException("Binary operation between differint types at " + this);
        }
        if(lhs.isLong()) {
            switch (this.op) {
                case ADD:
                    return new Value(lhs.getIntegerValue() + rhs.getIntegerValue());
                case SUB:
                    return new Value(lhs.getIntegerValue() - rhs.getIntegerValue());
                case MUL:
                    return new Value(lhs.getIntegerValue() * rhs.getIntegerValue());
                case DIV:
                    return new Value(lhs.getIntegerValue() / rhs.getIntegerValue());
                case PWR:
                    return new Value(Math.pow(lhs.getIntegerValue(), rhs.getIntegerValue()));
                case LT:
                    return new Value(lhs.getIntegerValue() < rhs.getIntegerValue());
                case LTE:
                    return new Value(lhs.getIntegerValue() <= rhs.getIntegerValue());
                case GT:
                    return new Value(lhs.getIntegerValue() > rhs.getIntegerValue());
                case GTE:
                    return new Value(lhs.getIntegerValue() >= rhs.getIntegerValue());
                case EQ:
                    return new Value(lhs.getIntegerValue() == rhs.getIntegerValue());
                case NE:
                    return new Value(lhs.getIntegerValue() != rhs.getIntegerValue());
            }
        } else{
            switch (this.op) {
                case ADD:
                    return new Value(lhs.getIntegerValue() + rhs.getIntegerValue());
                case SUB:
                    return new Value(lhs.getIntegerValue() - rhs.getIntegerValue());
                case MUL:
                    return new Value(lhs.getIntegerValue() * rhs.getIntegerValue());
                case DIV:
                    return new Value(lhs.getIntegerValue() / rhs.getIntegerValue());
                case PWR:
                    return new Value(Math.pow(lhs.getIntegerValue(), rhs.getIntegerValue()));
                case LT:
                    return new Value((lhs.getIntegerValue() < rhs.getIntegerValue()) &&
                            (Math.abs(lhs.getIntegerValue() - rhs.getIntegerValue()) >= EPS));
                case LTE:
                    return new Value((lhs.getIntegerValue() < rhs.getIntegerValue()) ||
                            (Math.abs(lhs.getIntegerValue() - rhs.getIntegerValue()) < EPS));
                case GT:
                    return new Value((lhs.getIntegerValue() > rhs.getIntegerValue()) &&
                            (Math.abs(lhs.getIntegerValue() - rhs.getIntegerValue()) >= EPS));
                case GTE:
                    return new Value((lhs.getIntegerValue() > rhs.getIntegerValue()) ||
                            (Math.abs(lhs.getIntegerValue() - rhs.getIntegerValue()) < EPS));
                case EQ:
                    return new Value(Math.abs(lhs.getIntegerValue() - rhs.getIntegerValue()) < EPS);
                case NE:
                    return new Value(Math.abs(lhs.getIntegerValue() - rhs.getIntegerValue()) >= EPS);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if (lhsNode == null) System.out.println("l.<NULL>");
        if (rhsNode == null) System.out.println("r.<NULL>");
        return lhsNode.toString() + " " + op.toString() + " " + rhsNode.toString();
    }
}
