package FL_BiConsumer;

import java.util.function.BiConsumer;

public class AndThenBiConsumerExample {

    public static void main(String[] args) {

        // Define BiConsumer that prints two numbers
        BiConsumer<Integer, Integer> printTwoNumbers = (num1, num2) ->
                System.out.println("num1: " + num1 + " num2: " + num2);

        // Define BiConsumer that adds two numbers and prints result
        BiConsumer<Integer, Integer> add = (num1, num2) ->
                System.out.println("sum: " + (num1 + num2));

        // Define BiConsumer for result
        BiConsumer<Integer, Integer> result = printTwoNumbers.andThen(add);
        result.accept(4, 2);

        // Applying BiConsumer without storing it
        printTwoNumbers.andThen(add).accept(2, 2);
    }
}
