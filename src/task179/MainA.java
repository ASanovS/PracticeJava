package task179;

public class MainA {
    public static boolean doubleOdd(int num) {
        if (num % 2 == 0) {
            int tmp = num / 2;
            return tmp % 2 == 1;
        }
        return false;
    }
}
