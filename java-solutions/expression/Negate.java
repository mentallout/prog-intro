package expression;

import java.util.Objects;

public class Negate extends UltimateExpression {

    private final UltimateExpression value;

    public Negate(UltimateExpression value) {
        this.value = value;
    }

    @Override
    public int evaluate(int x) {
        return value.evaluate(x) * -1;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return value.evaluate(x, y, z) * -1;
    }

    @Override
    public String toString() {
        return "-(" + value + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
