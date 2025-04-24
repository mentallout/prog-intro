package expression;

public class Main {
    public static void main(String[] args) {
        try {
            int example = new Add(
                    new Subtract(
                            new Multiply(
                                    new Variable("x"),
                                    new Variable("x")
                            ), new Multiply(
                            new Const(2),
                            new Variable("x")
                            )
                            ), new Const(1)
            ).evaluate(Integer.parseInt(args[0]));
            System.out.println(example);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }
}