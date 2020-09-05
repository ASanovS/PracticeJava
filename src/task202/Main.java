package task202;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральное число n, действительные числа а1, . . . , аn.
 * а) Верно ли, что отрицательных членов в последовательности а19 . . . , аn больше, чем положительных?
 * б) Верно ли, что наибольший член последовательности  а19 . . . , аn по модулю больше единицы?
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[20];
        int countMinus = 0;
        int countPlus = 0;
        int maxModule = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt();
        }

        for (int number :
                mas) {
            System.out.println("Number = " + number);
        }

        for (int i = 0; i < mas.length; i++) {
            if (i > 18) {
                if (countMinus < mas[i]) {
                    countMinus++;
                } else {
                    countPlus++;
                }
            }
        }
        System.out.printf("Верно ли что отрицательных членов больше чем положительных = %b\n", countMinus > countPlus);

        for (int i = 0; i < mas.length; i++) {
            if (i > 18) {
                if (maxModule < Math.abs(mas[i])) {
                    maxModule = Math.abs(mas[i]);
                }
            }
        }
        System.out.printf("Верно ли что максимальное число по модулю больше 1 = %b", maxModule > 1);
    }
}
