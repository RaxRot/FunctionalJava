package streams.distinct;

import java.util.Arrays;
import java.util.List;

public class StreamDistinctExample {
    public static void main(String[] args) {
        List<String>fruits= Arrays.asList("apple","banana","apple","banana","orange");

        List<String>arrWithoutDuplicates=fruits.stream().distinct().toList();
        System.out.println(arrWithoutDuplicates);
    }
}
