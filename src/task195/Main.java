package task195;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральное число n, действительные числа а, b, с1, . . . , сb.
 * Верно ли, что при 1 <= k <= n — 1 всякий раз, когда сk < а, выполнено ck+1 > b?
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
        }

        for (int number : mas) {
            System.out.println("Number = " + number);
        }

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
            if (1 <= i & i <= n - 1) {
                if (mas[i] < a) {
                    System.out.printf("%s\n", mas[i] + 1 > b ? "true" : "false");
                }
            }
        }
    }
}
