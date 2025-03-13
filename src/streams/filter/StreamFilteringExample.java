package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamFilteringExample {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer>resultEven =numbers.stream().filter(number -> number % 2 == 0).toList();
        System.out.println(resultEven);

        Predicate<Integer>moreThanFive=number -> number>5;
        List<Integer>resultMoreFive = numbers.stream().filter(moreThanFive).toList();
        System.out.println(resultMoreFive);
    }
}
