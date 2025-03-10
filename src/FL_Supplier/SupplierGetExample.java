package FL_Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierGetExample {
    public static void main(String[] args) {

        //Supplier that returns a constant value
        Supplier<String>sayHello=()->"Hello";

        //Supplier that return current date and time
        Supplier<LocalDateTime>getDateTime=()->LocalDateTime.now();

        String sayHello1=sayHello.get();
        LocalDateTime getDateTime1=getDateTime.get();
        System.out.println(sayHello1);
        System.out.println(getDateTime1);
    }
}
