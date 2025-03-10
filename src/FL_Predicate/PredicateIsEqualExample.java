package FL_Predicate;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
    public static void main(String[] args) {

        //Predicate to check if the input equal Java
        Predicate<String>isJavaEqual=Predicate.isEqual("Java");
        boolean result1=isJavaEqual.test("Java");
        boolean result2=isJavaEqual.test("java");
        System.out.println(result1);
        System.out.println(result2);
    }
}
