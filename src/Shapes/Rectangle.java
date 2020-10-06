package Shapes;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double sideA, double sideB) {
        this.a = sideA;
        this.b = sideB;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return (a + b) * 2;
    }
}
