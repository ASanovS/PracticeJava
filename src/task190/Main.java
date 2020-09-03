package task190;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральное число п, целые числа a1 . . . , ап.
 * Получить сумму положительных и число отрицательных
 * членов последовательности а1У . . . , ап.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длинну массива");
        int n = scanner.nextInt();
        int[] mas = new int[n];
        int sumPlus = 0;
        int coutMinus = 0;

        if (mas.length <= 0) {
            System.out.println("Ввели длинну масива 0 или меньше");
        } else {
            for (int i = 0; i < mas.length; i++) {
                if (i % 2 == 0) {
                    mas[i] = random.nextInt(10);
                } else {
                    mas[i] = random.nextInt(10) * -1;
                }

                if (mas[i] > 0) {
                    sumPlus += mas[i];
                } else {
                    coutMinus ++;
                }
            }
        }

        System.out.println("Сумма положительных чисел = " + sumPlus);
        System.out.println("Количество отрицательных чисел = " + coutMinus);
    }
}
