package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Predicate<Integer> isEven = i -> i%2 == 0;
        list.stream().filter(isEven).forEach(System.out::println);
    }
}
