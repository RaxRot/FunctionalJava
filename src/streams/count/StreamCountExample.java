package streams.count;

import java.util.Arrays;
import java.util.List;

public class StreamCountExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long evenCount=numbers.stream().filter(num->num%2==0).count();
        long oddCountAfterSkip1=numbers.stream().filter(num->num%2==1).skip(1).count();
    }
}
