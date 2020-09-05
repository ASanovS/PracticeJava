package task201;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральное число п, действительные числа а1,... аn. Получить:
 * a) max(a1, . . . аn),
 * b) min (a1, . . . , аn),
 * c) max (а2, а4, . . . ) ;
 * d) min(a1, а3, . . . ) ;
 * e) min (а2, а4, . . . ) + max(a1, а3, . . . ) ;
 * f) max (|а1|, . . |аn|);
 * g) (min(a1, . . ., аn))^2 — min(а1^2, . . . ., аn^2).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt();
        }

        int max = 0;
        for (int number : mas) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number = " + max);

        int min = 0;
        for (int number : mas) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println("Min number = " + min);

        int maxEven = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                if (mas[i] > maxEven) {
                    maxEven = mas[i];
                }
            }
        }
        System.out.println("Max even number = " + maxEven);

        int minNoEven = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0) {
                if (minNoEven < mas[i]) {
                    minNoEven = mas[i];
                }
            }
        }
        System.out.println("Min no even number = " + minNoEven);

        int minEven = 0;
        int maxNoEven = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                if (minEven < mas[i]) {
                    minEven = mas[i];
                }
            } else {
                if (mas[i] > maxNoEven) {
                    maxNoEven = mas[i];
                }
            }
        }
        System.out.printf("Sum min even + max no even numbers = %d\n", minEven + maxNoEven);

        int maxAbs = 0;
        for (int ma : mas) {
            if (maxAbs < Math.abs(ma)) {
                maxAbs = Math.abs(ma);
            }
        }
        System.out.println("Max module number = " + maxAbs);

        int minAftSquare = min;
        int minBefSquare = 0;
        for (int ma : mas) {
            if (minBefSquare < ma * ma) {
                minBefSquare = ma * ma;
            }
        }
        System.out.println("Sum numbers (min(a1, . . ., аn))^2 — min(а1^2, . . . ., аn^2) = " + ((minAftSquare * minAftSquare) - minBefSquare));
    }
}
