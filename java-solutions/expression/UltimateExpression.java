package expression;

public abstract class UltimateExpression implements Expression, TripleExpression {
    public abstract int evaluate(int x);
    public abstract int evaluate(int x, int y, int z);
}
