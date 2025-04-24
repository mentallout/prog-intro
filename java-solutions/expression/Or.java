package expression;

public class Or extends Operation {
    public Or(UltimateExpression left, UltimateExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) | right.evaluate(x);
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return left.evaluate(x, y, z) | right.evaluate(x, y, z);
    }

    @Override
    public String toString() {
        return "(" + left + " | " + right + ")";
    }
}
