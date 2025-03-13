package FI_BinaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer>addition = (x, y) -> x + y;
        System.out.println(addition.apply(1, 2));

        BinaryOperator<Integer>add= (x, y) -> x + y;
        System.out.println(add.apply(1, 2));
    }
}
