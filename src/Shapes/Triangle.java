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
    public void calculateArea() {
        double p = (a + b + c) / 2;
        if (p < a | p < b | p < c) {
            System.out.println("Треугольник не существует");
        } else {
            System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        }
    }

    @Override
    public void calculatePerimeter() {
        if (a + b < c | b + c < a | a + c < b) {
            System.out.println("Треугольник не существует");
        } else {
            System.out.println(a + b + c);
        }
    }
}
