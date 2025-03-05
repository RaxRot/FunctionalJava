package lambda;

public class LambdaThreadExample {
    public static void main(String[] args) {

     Runnable r = () -> {
         System.out.println("Inside Runnable");
     };
     new Thread(r).start();

     Runnable r2 = () -> {
         System.out.println("Inside Runnable2");
     };
     Thread thread = new Thread(r2);
     thread.start();

     Thread thread2 = new Thread(()-> System.out.println("Inside Thread"));
     thread2.start();
    }
}
