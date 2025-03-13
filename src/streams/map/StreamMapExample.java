package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class StreamMapExample {
    public static void main(String[] args) {

        List<String>fruits= Arrays.asList("Apple","Banana", "Mango");
        List<String>upperCaseFruits1=fruits.stream().map(String::toUpperCase).toList();
        List<String>upperCaseFruits2=fruits.stream().map(fruit->fruit.toUpperCase()).toList();
        System.out.println(upperCaseFruits1);
        System.out.println(upperCaseFruits2);

        Function<String,String>lowerCaseFruitsFunction=fruit -> fruit.toLowerCase();
        List<String>lowerCaseFruits=fruits.stream().map(lowerCaseFruitsFunction).toList();
        System.out.println(lowerCaseFruits);
        Consumer<String>showFruits=fruit -> System.out.println(fruit);
        List<String>withPeek=fruits.stream()
                .peek(showFruits)
                .map(lowerCaseFruitsFunction)
                .peek(showFruits).toList();
    }
}
