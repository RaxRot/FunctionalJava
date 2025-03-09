package FI_Function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        //Traditional way
        Function<String,String>traditionalUppercase=new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input.toUpperCase();
            }
        };
        String input=traditionalUppercase.apply("John");
        System.out.println(input);

        Function<String,String>lambdaUppercase=(message)->message.toUpperCase();
        String input1=lambdaUppercase.apply("John");
        System.out.println(input1);

        Function<String,String>reversedString=(message)->new StringBuilder(message).reverse().toString();
        String input2=reversedString.apply("John");
        System.out.println(input2);


    }
}
