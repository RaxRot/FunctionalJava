package lambda;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class CalculatorLambdaExample {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        int addResult = addition.calculate(1, 2);
        System.out.println(addResult);

        Calculator subtract = (a, b) -> a - b;
        int subtractResult = subtract.calculate(1, 2);
        System.out.println(subtractResult);

        Calculator multiplier = (a, b) -> a * b;
        int multiplyResult = multiplier.calculate(1, 2);
        System.out.println(multiplyResult);

        Calculator divisor = (a, b) -> a / b;
        int divideResult = divisor.calculate(1, 2);
        System.out.println(divideResult);
    }
}
