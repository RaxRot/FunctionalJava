package streams;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamExample {

    public static void main(String[] args) {

        //Create stream from List
        List<String>fruitList = Arrays.asList("apple", "banana", "orange", "pineapple");
        Stream<String>stream = fruitList.stream();
        stream.forEach((fruit) -> System.out.println(fruit));
        //stream.forEach(System.out::println);

        //Create stream from Set
        Set<String>fruitSet=new HashSet<>(fruitList);
        Stream<String> stream2 = fruitSet.stream();
        stream2.forEach(System.out::println);

        //Create stream from Map
        Map<String,Integer>fruitMap=new HashMap<>();
        fruitMap.put("apple",1);
        fruitMap.put("banana",2);
        fruitMap.put("orange",3);
        fruitMap.put("pineapple",4);
        Stream<Map.Entry<String,Integer>> mapEntryStream=fruitMap.entrySet().stream();
        mapEntryStream.forEach(System.out::println);

        //Create stream from key sets
        Stream<String>mapKeySetStream=fruitMap.keySet().stream();
        mapKeySetStream.forEach(System.out::println);
        //Create stream from key values
        Stream<Integer> mapValueStream=fruitMap.values().stream();
        mapValueStream.forEach(System.out::println);

        //Create stream from array
        String[] strArray={"apple","banana","orange","pineapple"};
        Stream<String> stringStream=Arrays.stream(strArray);
        stringStream.forEach(System.out::println);

        //Create stream using stream.of()
        Stream<String>ofStream=Stream.of("apple","banana","orange","pineapple");
        ofStream.forEach(System.out::println);

    }
}
