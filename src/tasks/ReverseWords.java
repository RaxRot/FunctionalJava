package tasks;

import java.util.Arrays;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String input="Hello Java World";
        List<String> words= Arrays.asList(input.split(" "))
                .stream().map(word->new StringBuilder(word).reverse().toString())
                .toList();
        System.out.println(words);
    }
}
