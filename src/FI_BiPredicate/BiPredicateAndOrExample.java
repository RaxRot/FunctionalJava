package FI_BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateAndOrExample {

    public static void main(String[] args) {

        //BiPredicate to check if 2 numbers is positive
        BiPredicate<Integer,Integer>allPositive=(num1,num2)-> num1>0 && num2>0;

        //BiPredicate to check if 2 numbers are even
        BiPredicate<Integer,Integer>allEven=(num1,num2)-> num1%2 == 0 && num2%2 == 0;

        //Combine using AND
        BiPredicate<Integer,Integer>result=allPositive.and(allEven);
        System.out.println(result.test(3,4));
        System.out.println(result.test(6,4));

        //Combine using OR
        BiPredicate<Integer,Integer>result2=allPositive.or(allEven);
        System.out.println(result2.test(3,4));
        System.out.println(result2.test(6,4));

        //BiPredicate to check if both string is equal
        BiPredicate<String,String>isEqual=(str1,str2)->str1.equals(str2);
        System.out.println(isEqual.test("A","B"));
        BiPredicate<String,String>notEqual=isEqual.negate();
        System.out.println(notEqual.test("A","B"));

    }
}
