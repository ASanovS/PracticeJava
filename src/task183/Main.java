package task183;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральные числа n, p, целые числа
 * а1 . . . , ап. Получить произведение членов
 * последовательности а1 . . . , an, кратных р.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите 2 числа n и p");
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int multiplicationNum = 1;
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }

        for (int num : mas) {
            if (num % p == 0) {
                multiplicationNum *= num;
            }
        }
        System.out.printf("Произведение чисел кратных числу %d = %d", p, multiplicationNum);
    }
}
