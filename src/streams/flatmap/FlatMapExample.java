package streams.flatmap;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>>listOfLists= Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        List<Integer>result=listOfLists.stream().flatMap(list->list.stream()).toList();
        System.out.println(result);
    }
}
