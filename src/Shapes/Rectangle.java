package Shapes;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double sideA, double sideB) {
        this.a = sideA;
        this.b = sideB;
    }

    @Override
    public void calculateArea() {
        if (a <= 0 | b <= 0) {
            System.out.println("Прямоугольник не существует");
        } else {
            System.out.println(a * b);
        }
    }

    @Override
    public void calculatePerimeter() {
        if (a <= 0 | b <= 0) {
            System.out.println("Прямоугольник не существует");
        } else {
            System.out.println((a + b) * 2);
        }
    }
}
