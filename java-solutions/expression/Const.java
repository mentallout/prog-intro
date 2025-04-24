package expression;

import java.util.Objects;

public class Const extends UltimateExpression {
    private final int constant;

    public Const(int constant) {
        this.constant = constant;
    }

    @Override
    public int evaluate(int x) {
        return constant;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return constant;
    }

    @Override
    public String toString() {
        return String.valueOf(constant);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        return ((Const) o).constant == constant;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.constant);
    }
}
