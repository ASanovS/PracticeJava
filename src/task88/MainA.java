package task88;

public class MainA {
    public static boolean numSquare(int num) {
        int square = num * num;
        int numberThree = 0;
        while (square > 0) {
            if (square % 10 == 3) {
                numberThree++;
                if (numberThree > 0) {
                    return true;
                }
            }
            square /= 10;
        }
        return false;
    }
}
