package FI_Function;
@FunctionalInterface
interface Printable{
    void print(String message);

    default void m1(){
        System.out.println("default method m1");
    }

    static void m2(){
        System.out.println("default method m2");
    }
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Printable printable=message -> System.out.println(message);
        printable.print("Hello World");
        printable.m1();
        Printable.m2();
    }
}
