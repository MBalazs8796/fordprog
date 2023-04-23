package ast;

public class Value {
    private final boolean isBool;
    private final double dVal;
    private final boolean bVal;

    public Value(double v) {
        this.isBool = false;
        this.dVal = v;
        this.bVal = false;
    }

    public Value(boolean v) {
        this.isBool = true;
        this.dVal = 0.0;
        this.bVal = v;
    }

    public boolean getLogicValue() {
        if (!this.isBool) {
            throw new RuntimeException("Not a logic value!");
        }
        return this.bVal;
    }

    public double getNumericValue() {
        if (this.isBool) {
            throw new RuntimeException("Not a numeric value!");
        }
        return this.dVal;
    }

    public String toString() {
        if (this.isBool) {
            return this.bVal ? "true" : "false";
        }
        return new Double(dVal).toString();
    }

}
