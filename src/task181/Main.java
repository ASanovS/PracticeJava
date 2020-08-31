package task181;

import java.util.Random;

/**
 * Даны целые числа а1, . . . a50. Получить сумму
 * тех чисел данной последовательности, которые
 * a) кратны 5;
 * b) нечетны и отрицательны;
 * c) удовлетворяют условию | а.i | < i^2.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[10];
        int sumMultFiveNum = 0;
        int sumOddNegative = 0;
        int sumNumber = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0) {
                mas[i] = random.nextInt(100);
                mas[i] *= -1;
            } else {
                mas[i] = random.nextInt(100);
            }
        }


        for (int num : mas) {
            if (num % 5 == 0) {
                sumMultFiveNum += num;
            }
        }
        System.out.printf("Сумма чисел кратных 5 = %d\n\n", sumMultFiveNum);

        for (int num : mas) {
            if (num % 2 != 0 & num < 0) {
                sumOddNegative += num;
            }
        }
        System.out.printf("Сумма нечетных и отрицательных чисел = %d\n\n", sumOddNegative);

        for (int i = 0; i < mas.length; i++) {
            if (Math.abs(mas[i]) < i * i) {
                sumNumber += mas[i];
            }
        }
        System.out.printf("Сумма чисел удовлеворяющая условие | а.i | < i^2 = %d", sumNumber);
    }
}
