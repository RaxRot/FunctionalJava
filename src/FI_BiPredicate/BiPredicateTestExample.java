package FI_BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateTestExample {

    public static void main(String[] args) {

        //BiPredicate if 2 string have same length
        BiPredicate<String,String>checkLength=(a,b)->a.length()==b.length();
        System.out.println(checkLength.test("A","B"));
        System.out.println(checkLength.test("A","BC"));
    }
}
