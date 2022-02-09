public class Multiplication implements CalculationInterface {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }

    @Override
    public String symbol() {
        return "*";
    }
}
