package task66;

import java.util.Scanner;

/**
 * Даны целые числа k , m, действительные числа х,
 * у , z. При k<m^2, k = m^2 или k>m^2 заменить модулем
 * соответственно значения х, у или z, а два других значения
 * уменьшить на 0.5.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if (k < m * m) {
            x = Math.abs(x);
            y /= 0.5;
            z /= 0.5;
            System.out.printf("x = %f, y = %f, z = %f", x, y, z);
        } else if (k == m * m) {
            y = Math.abs(x);
            x /= 0.5;
            z /= 0.5;
            System.out.printf("x = %f, y = %f, z = %f", x, y, z);
        } else {
            z = Math.abs(x);
            y /= 0.5;
            x /= 0.5;
            System.out.printf("x = %f, y = %f, z = %f", x, y, z);
        }
    }
}
