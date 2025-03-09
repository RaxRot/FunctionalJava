package FI_Function;

import java.util.function.Function;

public class ComposeExample {
    public static void main(String[] args) {

        //Define a function that trims a string
        Function<String,String>trim=(message)->message.trim();
        System.out.println(trim.apply("  Vlad  "));

        //Define a function that converts a string into uppercase
        Function<String,String>uppercase=(message)->message.toUpperCase();
        System.out.println(uppercase.apply("Vlad"));

        String input=trim.compose(uppercase).apply(" Vlad ");
        System.out.println(input);

    }
}
