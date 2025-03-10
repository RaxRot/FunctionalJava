package FI_BIFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AndThenBiFunctionExample {

    public static void main(String[] args) {

        //Define BiFunction that multiply numbers
        BiFunction<Integer,Integer,Integer>multiply=(num1,num2)->num1*num2;

        //Define Function that add plus 10
        Function<Integer,Integer>addTen=(num1)->num1+10;

        BiFunction<Integer,Integer,Integer>result=multiply.andThen(addTen);
        int myResult=result.apply(3,4);
        System.out.println(myResult);
    }
}
