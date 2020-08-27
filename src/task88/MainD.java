package task88;

public class MainD {
    public static int addNumOne(int num) {
        int remainder = 1;
        int tmpNum = num;
        while (tmpNum > 0) {
            remainder *= 10;
            tmpNum /= 10;
        }
        return (remainder + num) * 10 + 1;
    }
}
