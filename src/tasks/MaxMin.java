package tasks;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(5,7,1,9,3);

        int max=list.stream().max(Integer::compare).get();
        int min=list.stream().min(Integer::compare).get();
        System.out.println(max);
        System.out.println(min);
    }
}
