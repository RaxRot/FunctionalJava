package FI_BIFunction;

import java.util.function.BiFunction;

public class RectangleAreaBiFunctionExample {

    public static void main(String[] args) {

        //Define BiFunction to calculate area rectangle
        BiFunction<Integer,Integer,Integer>calculateArea=(width,length)->width*length;
        int area=calculateArea.apply(3,4);
        System.out.println(area);
    }
}
