package task86;

public class MainC {
    public static int firstNum(int num) {
        int firts = 0;
        while (num > 0) {
            firts = num % 10;
            num /= 10;
        }
        return firts;
    }
}
