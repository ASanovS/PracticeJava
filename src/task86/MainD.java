package task86;

public class MainD {
    public static int alternatingSum(int num) {
        int sum = 0;
        int count = 0;
        while (num > 0) {
            if (count % 2 != 0) {
                sum += num % 10;
            } else {
                sum -= num % 10;
            }
            num /= 10;
            count++;
        }
        return sum;
    }
}
