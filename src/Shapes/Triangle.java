package Shapes;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;


    public Triangle(double sideA, double sideB, double sideC) {
        this.a = sideA;
        this.b = sideB;
        this.c = sideC;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
