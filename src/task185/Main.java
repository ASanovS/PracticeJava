package task185;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральное число n, действительные
 * числа а1 . . . , ап. Получить удвоенную сумму всех
 * положитильных членов последовательности а1 . . . ап.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        long doubleSum = 0;
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = i % 2 == 0 ? random.nextInt(100) : random.nextInt(100) * -1;
        }

        for (int num : mas) {
            System.out.println(num);
            if (num > 0) {
                doubleSum += num;
            }
        }
        System.out.printf("Удвоенная сумма всех положительных цыфр = %d", doubleSum * 2);
    }
}
