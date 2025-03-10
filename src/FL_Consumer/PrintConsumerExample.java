package FL_Consumer;

import java.util.function.Consumer;

public class PrintConsumerExample {

    public static void main(String[] args) {

        //Defines consumer that prints a string
        Consumer<String>printConsumer=(str)->System.out.println(str);
        printConsumer.accept("Vlad");

        //Defines consumer that convert the input to uppercase
        Consumer<String>toUppercase=(str)->System.out.println(str.toUpperCase());
        toUppercase.accept("Vlad");

        //Combine 2 consumers
        Consumer<String>result=printConsumer.andThen(toUppercase);
        result.accept("Vlad");

        printConsumer.andThen(toUppercase).accept("Lol");
    }
}
