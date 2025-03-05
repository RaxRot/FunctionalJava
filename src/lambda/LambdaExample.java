package lambda;

@FunctionalInterface
interface Shape{
    void draw();
}

public class LambdaExample {
    public static void main(String[] args) {

        Shape rectangle=()-> System.out.println("Inside rectangle");
        rectangle.draw();

        Shape square=()-> System.out.println("Inside square");
        square.draw();

        Shape circle=()-> System.out.println("Inside circle");
        circle.draw();

        Shape triangle=()-> System.out.println("Inside triangle");
        drawing(triangle);

        drawing(()-> System.out.println("Inside Test"));

        drawing(()-> System.out.println("Inside Test2"));
    }

    private static void drawing(Shape shape) {
        shape.draw();
    }
}
