package FL_Predicate;

import java.util.function.Predicate;

public class PredicateTestExample {
    public static void main(String[] args) {

        //Predicate to check if number is greater than 10
        Predicate<Integer>isGraterThan10=(number)->number>10;
        boolean result=isGraterThan10.test(15);
        System.out.println(result);
    }
}
