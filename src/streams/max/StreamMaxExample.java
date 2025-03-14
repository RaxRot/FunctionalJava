package streams.max;

import java.util.Arrays;
import java.util.List;

public class StreamMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,-2);
        int minV1=numbers.stream().max(((o1, o2) -> o1.compareTo(o2))).get();
        int minV2=numbers.stream().max(Integer::compareTo).get();
        System.out.println(minV1);
        System.out.println(minV2);
    }
}
