package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindSquareOdFirstThreeEvenElement {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        List<Integer>result=numbers.stream()
                .filter(x->x%2==0)
                .limit(3)
                .map(x->x*x).toList();

        Predicate<Integer>findEven=x->x%2==0;
        Function<Integer,Integer>makeSquare=x->x*x;
        List<Integer>result2=numbers.stream()
                .filter(findEven)
                .limit(3)
                .map(makeSquare).toList();
    }
}
