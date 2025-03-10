import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Function<Integer,Integer>multiplyByThree=x->x*3;
        Function<Integer,Integer>plusTen=x->x+10;
        Function<Integer,Integer>convertToSquare=x->x*x;
        Function<Integer,Integer>functionResult=multiplyByThree.andThen(plusTen).andThen(convertToSquare);
        System.out.println(functionResult.apply(4));

        Predicate<String> isNumber = s -> s.matches("-?\\d+(\\.\\d+)?");
        Predicate<String>isPalindrom=s->new StringBuilder(s).reverse().toString().equals(s);
        System.out.println(isNumber.and(isPalindrom).test("121"));
        System.out.println(isNumber.and(isPalindrom).test("Hello"));

        Supplier<LocalDateTime>localDateTime=()->LocalDateTime.now();
        Supplier<Integer>randomNumber=()->new Random().nextInt();
        System.out.println(localDateTime.get());
        System.out.println(randomNumber.get());

        Consumer<String>toLowerCase=s->System.out.println(s.toLowerCase());
        Consumer<String>toUpperCase=s->System.out.println(s.toUpperCase());
        toLowerCase.accept("Vlad");
        toUpperCase.accept("Lol");
    }
}