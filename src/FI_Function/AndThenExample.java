package FI_Function;

import java.util.function.Function;

public class AndThenExample {
    public static void main(String[] args) {

        //Define a function that converts a string to uppercase
        Function<String,String>uppercase=(message)->message.toUpperCase();

        //Define function that calculates a length of string
        Function<String,Integer>stringLength=(message)->message.length();

        int length=uppercase.andThen(stringLength).apply("John");
        System.out.println(length);

        //Define function that add one symbol
        Function<String,String>addOneSymbol=(message)->message+"a";
        int length1=addOneSymbol.andThen(stringLength).apply("John");
        System.out.println(length1);
    }
}
