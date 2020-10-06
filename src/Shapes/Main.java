package Shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название фигуры, Triangle, Circle, Square, Rectangle");
        String scanShape = scanner.nextLine();
        Shapes shapes = Shapes.valueOf(Shapes.class, scanShape.toUpperCase());

        switch (shapes) {
            case TRIANGLE -> {
                System.out.println("Введите стороны треугольника а, б, ц");
                Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                System.out.println("Вы создали треугольник");
                System.out.println("Площадь фигуры = " + triangle.calculateArea());
                System.out.println("Периметр фигуры = " + triangle.calculatePerimeter());
            }
            case CIRCLE -> {
                System.out.println("Введите радиус круга");
                Circle circle = new Circle(scanner.nextDouble());
                System.out.println("Вы создали круг");
                System.out.println("Площадь фигуры = " + circle.calculateArea());
                System.out.println("Периметр фигуры = " + circle.calculatePerimeter());
            }
            case SQUARE -> {
                System.out.println("Введите длинну стороны квадрата");
                Square square = new Square(scanner.nextDouble());
                System.out.println("Вы создали квадрат");
                System.out.println("Площадь фигуры = " + square.calculateArea());
                System.out.println("Периметр фигуры = " + square.calculatePerimeter());
            }
            case RECTANGLE -> {
                System.out.println("Введите длинну сторон прямоугольника а и б");
                Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                System.out.println("Вы создали прямоугольник");
                System.out.println("Площадь фигуры = " + rectangle.calculateArea());
                System.out.println("Периметр фигуры = " + rectangle.calculatePerimeter());
            }
        }
    }
}
