package streams.skip;

import java.util.Arrays;
import java.util.List;

public class StreamSkipExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer>skipt5=numbers.stream().skip(5).limit(2).toList();
        System.out.println(skipt5);
    }
}
