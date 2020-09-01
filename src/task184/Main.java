package task184;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны целые числа p, q, а1 . . . , аб7 ( p > q >= 0).
 * В последовательности а1 . . . , а67 заменить нулями члены,
 * модуль которых при делении на р дает в остатке q.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите 2 числа p и q с условием что p > q");
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int[] mas = new int[67];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }

        for (int i = 0; i < mas.length; i++) {
            int tmp = Math.abs(mas[i]) % p;
            if (tmp == q) {
                mas[i] = 0;
            }
        }

        for (int num : mas) {
            System.out.println("Число поледовательности = " + num);
        }
    }
}
