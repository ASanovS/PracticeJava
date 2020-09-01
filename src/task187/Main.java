package task187;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральное число п, действительные числа
 * а1 . . . , ап. В последовательности а1 . . . an ,
 * все отрицательные члены увеличить на 0.5, а все
 * неотрица тельные заменить на 0.1.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        double[] mas = new double[n];

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                mas[i] = random.nextInt(100);
            } else {
                mas[i] = random.nextInt(100) * -1;
            }

            if (mas[i] < 0) {
                mas[i] *= 0.5;
            } else {
                mas[i] = 0.1;
            }
        }

        for (double num : mas) {
            System.out.printf("Все отрицательные умножаются на 0.5, а положительные заменяются на 0.1 = %f\n", num);
        }
    }
}
