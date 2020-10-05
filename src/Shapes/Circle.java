package Shapes;

public class Circle implements Shape {
    private double r;

    public Circle(double radius) {
        this.r = radius;
    }

    @Override
    public void calculateArea() {
        if (r <= 0) {
            System.out.println("Окружность не существует");
        } else {
            System.out.println(Math.PI * (r * r));
        }
    }

    @Override
    public void calculatePerimeter() {
        if (r <= 0) {
            System.out.println("Окружность не существует");
        } else {
            System.out.println(2 * Math.PI * r);
        }
    }
}
