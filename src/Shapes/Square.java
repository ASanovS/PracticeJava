package Shapes;

public class Square implements Shape {
    private double a;

    public Square(double sideA) {
        this.a = sideA;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return a * 4;
    }
}
