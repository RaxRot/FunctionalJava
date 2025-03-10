package FI_Function;

import java.util.function.Function;

public class MyFunctionTest {
    public static void main(String[] args) {

        //Create function that multiply number by 2
        Function<Integer,Integer>multiplyBy2=(input)->input*2;

        //Create function that add 5
        Function<Integer,Integer>addFive=(input)->input+5;

        int resultAndThen=multiplyBy2.andThen(addFive).apply(5);
        System.out.println(resultAndThen);

        int resultCompose=multiplyBy2.compose(addFive).apply(5);
        System.out.println(resultCompose);

        //Create function that check that string is not empty
        Function<String,String>isNotEmpty=(message)->message.length()>0?message:"";

        //Create function that reversed string
        Function<String,String>reverseString=(message)->new StringBuilder(message).reverse().toString();

        String resultAndThenForFunction=isNotEmpty.andThen(reverseString).apply("Vlad");
        System.out.println(resultAndThenForFunction);

        String resultAndComposeForFunction=isNotEmpty.compose(reverseString).apply("Vlad");
        System.out.println(resultAndComposeForFunction);

        //Create function that removes all spaces
        Function<String,String>removeAllSpaces=(message)->message.replaceAll("\\s+","");

        //Create function that make string to uppercase
        Function<String,String>makeToUpperCase=(message)->message.toUpperCase();

        //Create function that check if string is palindrome
        Function<String,Boolean>isPalindrome=(message)->message.equals(new StringBuilder(message).reverse().toString());

        boolean result=removeAllSpaces.andThen(makeToUpperCase).andThen(isPalindrome).apply("V la d");
        if (result){
            System.out.println("Removed all the spaces");
            System.out.println("Make it uppercase");
            System.out.println("Is palindrome");
        }else{
            System.out.println("Removed all the spaces");
            System.out.println("Make it uppercase");
            System.out.println("Is not palindrome");
        }
    }
}
