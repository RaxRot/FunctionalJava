package streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbersExample {
    public static void main(String[] args) {

        List<Integer>numbers= Arrays.asList(2,4,3,6,7,9,8,5,1);

        List<Integer>sortedInNaturalOrder=numbers.stream().sorted().toList();

        List<Integer>sortedInReverseOrder=numbers.stream().sorted(Comparator.reverseOrder()).toList();
    }
}
