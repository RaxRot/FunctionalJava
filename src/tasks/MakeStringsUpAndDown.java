package tasks;

import java.util.Arrays;
import java.util.List;

public class MakeStringsUpAndDown {
    List<String>fruits= Arrays.asList("apple","orange","banana","Apple","Banana","Orange","Banana");

    List<String>upperCase=fruits.stream().map(String::toUpperCase).toList();
    List<String>lowerCase=fruits.stream().map(String::toLowerCase).toList();

    List<String>firstUpLastNormal=fruits.stream()
            .map(first->first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase())
            .toList();
}
