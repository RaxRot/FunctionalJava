package streams.limit;

import java.util.Arrays;
import java.util.List;

public class StreamLimitExample {
    public static void main(String[] args) {
        List<String>fruits= Arrays.asList("apple","banana","apple","orange","banana","orange");
        List<String>take2=fruits.stream().limit(2).toList();
        System.out.println(take2);

        List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        List<Integer>fiveEvenNumbers=numbers.stream().filter(num->num%2==0).limit(5).toList();
        System.out.println(fiveEvenNumbers);
    }
}
