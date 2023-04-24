package ast;


import java.time.Instant;
import java.util.Objects;

public class Value {
    private final ValueState state;
    private final double dVal;
    private final long lVal;

    public Value(double d) {
        this.state = ValueState.DOUBLE;
        this.dVal = d;
        this.lVal = 0;
    }

    public Value(long v) {
        this.state = ValueState.LONG;
        this.dVal = 0;
        this.lVal = v;
    }

    public Value(boolean b){
        this.state = ValueState.BOOLEAN;
        this.dVal = 0;
        this.lVal = b ? 1 : 0;

    }

    public Value(){
        this.state = ValueState.TIME;
        this.dVal = 0;
        this.lVal = 0;
    }


    public long getIntegerValue() {
        if (this.state==ValueState.DOUBLE) {
            throw new RuntimeException("Not an integer!");
        } else if(this.state==ValueState.TIME){
            return Instant.now().getEpochSecond();
        }
        return this.lVal;
    }

    public double getDoubleValue() {
        if (this.state!=ValueState.DOUBLE) {
            throw new RuntimeException("Not a double!");
        }
        return this.dVal;
    }

    public boolean isLong() {
        return this.state!=ValueState.DOUBLE;
    }

    public boolean isLogical(){
        return this.state==ValueState.BOOLEAN;
    }

    public boolean isTime(){
        return this.state==ValueState.TIME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return Double.compare(value.dVal, dVal) == 0 && lVal == value.lVal && state == value.state;
    }

    public String toString() {
        if(this.state == ValueState.TIME){
            return Long.toString(Instant.now().getEpochSecond());
        }
        else if (this.state!=ValueState.DOUBLE) {
            return Long.toString(lVal);
        }
        return Double.toString(dVal);
    }

}
