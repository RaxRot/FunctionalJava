package FI_BIFunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        //Define BiFunction to add two numbers
        BiFunction<Integer,Integer,Integer>addition=(num1,num2)->num1+num2;
        int result=addition.apply(1,2);
        System.out.println(result);

        //Define BiFunction to subtract two numbers
        BiFunction<Integer,Integer,Integer>subtraction=(num1,num2)->num1-num2;
        result=subtraction.apply(1,2);
        System.out.println(result);

        //Define BiFunction to multiply two numbers
        BiFunction<Integer,Integer,Integer>multiplication=(num1,num2)->num1*num2;
        result=multiplication.apply(1,2);
        System.out.println(result);

        //Define BiFunction to divide two numbers
        BiFunction<Integer,Integer,Integer>division=(num1,num2)->{
          if (num2==0){
              throw new ArithmeticException("Cannot divide by zero");
          }else{
              return num1/num2;
          }
        };
        result=division.apply(1,2);
        System.out.println(result);
    }
}
