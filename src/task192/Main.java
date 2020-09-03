package task192;

import java.util.Random;

/**
 * Даны целые числа а1 . . . ,а45. Получить число
 * отрицательных членов последовательности а1 . . . , а35 и
 * число нулевых членов всей последовательности а1 . . . ,а45.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[45];
        int countMinus = 0;
        int countZero = 0;

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                mas[i] = random.nextInt(10);
            } else {
                mas[i] = random.nextInt(10) * -1;
            }

            System.out.println("Nember " + mas[i]);
            if (i < 34 & mas[i] < 0) {
                countMinus++;
            }

            if (mas[i] == 0) {
                countZero++;
            }
        }
        System.out.printf("Число отрицательный чисел до 35 = %d\n", countMinus);
        System.out.printf("Число цыфр равное 0 = %d\n", countZero);
    }
}
