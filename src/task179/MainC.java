package task179;

public class MainC {
    public static boolean posNumber(int num) {
        int a = 1;
        int b = 3 * num;
        int c = 5;
        int discriminant = b * b - 4 * a * c;
        int x;
        double x1;
        double x2;
        if (discriminant > 0) {
            x1 = ((-b) + Math.sqrt(discriminant)) / 2 * a;
            x2 = ((-b) - Math.sqrt(discriminant)) / 2 * a;
            return x1 > 0 & x2 > 0;
        } else if (discriminant == 0) {
            x = -b / 2 * a;
            return x > 0;
        } else {
            return false;
        }
    }
}
