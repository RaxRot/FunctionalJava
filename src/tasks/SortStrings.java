package tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String>fruits= Arrays.asList("apple","orange","pineapple","banana");
        List<String> fruitsSortedAsc=fruits.stream().sorted().toList();
        List<String>fruitsSortedDesc=fruits.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(fruitsSortedAsc);
        System.out.println(fruitsSortedDesc);
    }
}
