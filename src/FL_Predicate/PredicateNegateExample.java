package FL_Predicate;

import java.util.function.Predicate;

public class PredicateNegateExample {
    public static void main(String[] args) {

        //Predicate to check if string is empty
        Predicate<String>isEmpty=(s) -> s.isEmpty();

        //Negate the predicate
        Predicate<String>isNotEmpty=isEmpty.negate();

        boolean result1=isEmpty.test("Vlad");
        System.out.println(result1);

        boolean result2=isNotEmpty.test("Vlad");
        System.out.println(result2);
    }
}
