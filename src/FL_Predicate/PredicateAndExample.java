package FL_Predicate;

import java.util.function.Predicate;

public class PredicateAndExample {
    public static void main(String[] args) {

        //Predicate to check is string is not empty
        Predicate<String>isNotEmpty=s -> !s.isEmpty();

        //Predicate to check if length is greater that 5
        Predicate<String>isLengthMoreFive=s -> s.length() > 5;

        //Combine 2 predicates
        Predicate<String>isValid=isNotEmpty.and(isLengthMoreFive);
        boolean result=isValid.test("Fred");
        System.out.println(result);

        boolean result1=isNotEmpty.and(isLengthMoreFive).test("Vlados");
        System.out.println(result1);
    }
}
