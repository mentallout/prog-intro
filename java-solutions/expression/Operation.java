package expression;

import java.util.Objects;

public abstract class Operation extends UltimateExpression {
    protected final UltimateExpression left, right;

    public Operation(UltimateExpression left, UltimateExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x);
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return left.evaluate(x, y, z);
    }

    @Override
    public String toString() {
        return "(" + left + " " + right + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        return ((Operation) o).left.equals(left) && ((Operation) o).right.equals(right);
    }

    @Override
    final public int hashCode() {
        return Objects.hash(this.left, this.right, getClass());
    }
}
