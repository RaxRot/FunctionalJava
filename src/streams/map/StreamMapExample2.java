package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamMapExample2 {
    public static void main(String[] args) {

        List<String>listOfStrings= Arrays.asList("1","2","3","4","5");
        List<Integer>converted=listOfStrings.stream().map(x->Integer.valueOf(x)).toList();
        System.out.println(converted);

        Function<String,Integer>convertToInteger=x->Integer.valueOf(x);
        List<Integer>converted1=listOfStrings.stream().map(convertToInteger).toList();
    }
}
