package task186;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральное число п, действительные числа
 * ai, . . . , ап. Вычислить обратную величину произведения
 * тех членов ai последовательности a1, . . . , an, для которых
 * выполнено i + 1 < ai < i!.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int multipleNum = 1;
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
            System.out.println("number " + mas[i]);
            if (i + 1 < mas[i] & mas[i] < factorial(i)) {
                multipleNum *= mas[i];
            }
        }
        System.out.printf("Обратное произведение чисел прошедших условие i + 1 < ai < i! = %d", multipleNum * -1);
    }

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else if (num < 1) {
            return 0;
        }
        return num * factorial(num - 1);
    }
}
