package streams.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamForEachExample {
    public static void main(String[] args) {
        List<String>fruits= Arrays.asList("apple","banana", "orange","pear");
        fruits.stream().forEach(System.out::println);

        Consumer<String> printer=x->System.out.println(x);
        fruits.stream().forEach(printer);
    }
}
