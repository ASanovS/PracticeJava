package task43;

import java.util.Scanner;

/**
 * Даны три действительные числа. Возвести в квадрат те из них, значения которых неотрицательны.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.printf("a = %d, b = %d, c = %d", square(a), square(b), square(c));
    }

    static int square(int a) {
        return a > 0 ? a * a : a;
    }
}
