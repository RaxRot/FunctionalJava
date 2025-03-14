package streams.collect;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {
    public static void main(String[] args) {
        Stream<String>streamToList=Stream.of("apple","banana", "orange");
        List<String>list=streamToList.collect(Collectors.toList());

        Stream<String>streamToSet=Stream.of("apple","banana", "orange","banana", "orange");
        Set<String> set=streamToSet.collect(Collectors.toSet());
        System.out.println(set);

        Stream<String>streamToMap=Stream.of("apple","banana", "orange");
        Map<String,Integer>map=streamToMap.collect(Collectors.toMap(
                fruit->fruit,
                fruit->fruit.length()
        ));
    }
}
