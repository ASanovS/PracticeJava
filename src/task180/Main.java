package task180;

import java.util.Scanner;

/**
 * Дано натуральное число n. Получить сумму тех
 * • чисел вида i^3 - 3*i*n^2 + n (i = l, 2, . . . , я), которые
 * являются утроенными нечетными *).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumNumbers = 0;

        for (int i = 0; i < number; i++) {
            int tmp = (i*i*i) - 3 * i * number + number;
            if (tmp % 3 == 0 & tmp % 2 == 1) {
                sumNumbers += tmp;
            }
        }

        System.out.printf("Сумма утроенных нечетных чисел = %d", sumNumbers);
    }
}

