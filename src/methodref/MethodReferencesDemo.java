package methodref;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String message);
}

public class MethodReferencesDemo {

    public void display(String message) {
        message=message.toUpperCase();
        System.out.println(message);
    }

    public static int addition(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        //1.Method reference to a static method
        //using lambda
        Function<Integer,Double>function=input->Math.sqrt(input);
        System.out.println(function.apply(4));
        //using method references
        Function<Integer,Double>function1=Math::sqrt;
        System.out.println(function1.apply(5));

        BiFunction<Integer,Integer,Integer>additionLambda=(a,b)->MethodReferencesDemo.addition(a,b);
        System.out.println(additionLambda.apply(4,5));

        BiFunction<Integer,Integer,Integer>additionReference=MethodReferencesDemo::addition;


        //2 Method reference to an instance  method of object
        MethodReferencesDemo methodReferencesDemo=new MethodReferencesDemo();

        //lambda
        Printable printable=(msg)->methodReferencesDemo.display(msg);
        printable.print("Hello");

        //reference
        Printable printable1=methodReferencesDemo::display;
        printable1.print("Hello");

        //3 Reference to the instance method of arbitrary object

        //lambda
        Function<String,String>stringFunction=(str)->str.toUpperCase();
        System.out.println(stringFunction.apply("Hello"));

        //reference
        Function<String,String>stringFunction1=String::toUpperCase;
        System.out.println(stringFunction1.apply("Hello"));

        String[]arr={"A","B","C","D","E","A","B","c","d","E","a"};

        //Using lambda
        Arrays.sort(arr,(s1,s2)->s1.compareToIgnoreCase(s2));

        //using reference
        Arrays.sort(arr,String::compareToIgnoreCase);


        //4 reference to a constructor
        List<String>fruits=Arrays.asList("Apple","Banana","Apple","Banana");
        //using lambda
        Function<List<String>, Set<String>>setFunction=(list)->new HashSet<>(list);

        //using reference
        Function<List<String>, Set<String>>setFunction1= HashSet::new;



    }
}
