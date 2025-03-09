package FI_Function;

import java.util.function.Function;

public class IdentityExample {
    public static void main(String[] args) {
        Function<String,String>function=Function.identity();
        System.out.println(function.apply("John"));
    }
}
