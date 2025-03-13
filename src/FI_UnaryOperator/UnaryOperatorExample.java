package FI_UnaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        //Define function that squares a number
        Function<Integer,Integer>square = x -> x * x;
        System.out.println(square.apply(5));

        UnaryOperator<Integer>squareUnary = x -> x * x;
        System.out.println(squareUnary.apply(5));

        UnaryOperator<String>toUpperCase = x -> x.toUpperCase();
        System.out.println(toUpperCase.apply("Hello"));


    }
}
