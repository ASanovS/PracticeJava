package task88;

public class MainB {
    public static int revers(int num) {
        int reversNum = 0;
        while (num > 0) {
            reversNum = reversNum * 10 + num % 10;
            num /= 10;
        }
        return reversNum;
    }
}
