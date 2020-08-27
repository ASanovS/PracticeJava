package task88;

public class MainC {
    public static int swapFirstLast(int num) {
        int remainder = 1;
        int firsNum = 0;
        int lastNum = num % 10;
        int tempNum = num;
        while (tempNum > 0) {
            remainder *= 10;
            firsNum = tempNum % 10;
            tempNum /= 10;
        }
        return lastNum * (remainder / 10) + (num * 10 % remainder / 100) * 10 + firsNum;
    }
}
