package task46;

import java.util.Scanner;

/**
 * Даны действительные числа х, у. Если х и у отрицательны,
 * то каждое значение заменить его модулем;
 * если отрицательно только одно из них, то оба значения
 * увеличить на 0.5; если оба значения неотрицательны и ни
 * одно из них не принадлежит отрезку [0.5, 2.0], то оба
 * значения уменьшить в 10 раз; в остальных случаях х и у
 * оставить без изменения.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x < 0 && y < 0) {
            System.out.printf("x = %f, y = %f", Math.abs(x), Math.abs(y));
        } else if (x < 0 || y < 0) {
            System.out.printf("x = %f, y = %f", x * 0.5, y * 0.5);
        } else if (x < 0.5 || x > 2 && y < 0.5 || y > 2) {
            System.out.printf("x = %f, y = %f", x / 10, y / 10);
        } else {
            System.out.printf("x = %f, y = %f", x, y);
        }
    }
}
