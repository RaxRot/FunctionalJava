package tasks;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,1,2,3);
        List<String>fruits= Arrays.asList("apple","orange","banana","apple","orange");

        List<Integer>numberWithoutDuplicates= numbers.stream().distinct().toList();
        List<String> fruitWithoutDuplicates = fruits.stream().distinct().toList();
    }
}
