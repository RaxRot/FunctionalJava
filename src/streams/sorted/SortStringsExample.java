package streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsExample {

    public static void main(String[] args) {

        List<String>fruits= Arrays.asList("apple","banana","mango","cherry","orange");
        List<String> fruitsSorted=fruits.stream().sorted().toList();

        List<String> fruitsSortedInReverse=fruits.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(fruitsSorted);
        System.out.println(fruitsSortedInReverse);
    }
}
