package Shapes;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(1);
        Shape circle = new Circle(6);
        Shape triangle = new Triangle(9, 4, 6);
        Shape rectangle = new Rectangle(8, 4);

        System.out.println(Math.sqrt(8));

        square.calculateArea();
        square.calculatePerimeter();

        circle.calculateArea();
        circle.calculatePerimeter();

        triangle.calculateArea();
        triangle.calculatePerimeter();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
