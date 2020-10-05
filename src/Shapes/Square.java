package Shapes;

public class Square implements Shape {
    private double a;

    public Square(double sideA) {
        this.a = sideA;
    }

    @Override
    public void calculateArea() {
        if (a <= 0) {
            System.out.println("Квадрат не существует");
        } else {
            System.out.println(a * a);
        }
    }

    @Override
    public void calculatePerimeter() {
        if (a <= 0) {
            System.out.println("Квадрат не существует");
        } else {
            System.out.println(a * 4);
        }
    }
}
