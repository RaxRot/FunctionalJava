package FL_Predicate;

import java.util.function.Predicate;

public class PredicateOrExample {
    public static void main(String[] args) {

        //Predicate to check if number is less than five
        Predicate<Integer>isLessThanFive=(num)->num<5;

        //Predicate to check if number is more than 10
        Predicate<Integer>isMoreThanTen=(num)->num>10;

        //Combine two predicates
        Predicate<Integer>isValid=isLessThanFive.or(isMoreThanTen);

        boolean result=isValid.test(15);
        System.out.println(result);

        boolean result1=isLessThanFive.or(isMoreThanTen).test(15);
        System.out.println(result1);

    }
}
