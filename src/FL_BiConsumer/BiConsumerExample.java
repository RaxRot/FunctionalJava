package FL_BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        //Define BiConsumer that prints two strings
        BiConsumer<String,String>printFullName=(firstName,lastName)-> System.out.println("Full Name: " + firstName + " " + lastName);
        printFullName.accept("Vlad","Bulahov");

        //Define BiConsumer that prints email and password
        BiConsumer<String,String>emailAndPassword=(email,password)->{
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        };
        emailAndPassword.accept("das@gmail.com","123");
    }
}
