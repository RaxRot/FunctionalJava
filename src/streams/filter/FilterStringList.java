package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterStringList {

    public static void main(String[] args) {

        List<String> fruitList = Arrays.asList("apple", "banana", "orange", "pineapple");
        List<String>fruitContainsBanana = fruitList.stream().filter(fruit->fruit.contains("apple")).toList();
        System.out.println(fruitContainsBanana);

        Predicate<String>fruitEqualsApple = fruit->fruit.equals("apple");
        List<String>fruitEqualsBanana=fruitList.stream().filter(fruitEqualsApple).toList();
        System.out.println(fruitEqualsBanana);


    }
}
