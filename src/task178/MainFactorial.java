package task178;

public class MainFactorial {
    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else if (num < 1) {
            return 0;
        }
        return num * factorial(num - 1);
    }
}
