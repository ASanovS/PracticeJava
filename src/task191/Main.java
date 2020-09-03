package task191;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральное число п, целые числа aiy . . . , ап.
 * Заменить все большие семи члены последовательности
 * a1 . . . , ап числом 7. Вычислить количество таких
 * членов
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] mas = new int[n];
        int countSeven = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
            if (mas[i] > 7) {
                countSeven++;
                mas[i] = 7;
            }
        }

        for (int num : mas) {
            System.out.println("Number " + num);
        }
        System.out.printf("Количество чисел больше 7 = %d", countSeven);
    }
}
