package Shapes;

public class Circle implements Shape {
    private double r;

    public Circle(double radius) {
        this.r = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (r * r);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}