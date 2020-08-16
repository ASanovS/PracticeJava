package task45;

import java.util.Scanner;

/**
 * Даны действительные числа а, Ь, с, d. Если a<=b<=c<=d
 * то каждое число заменить наибольшим из
 * них; если а > Ъ > с > d, то числа оставить без изменения;
 * в противном случае все числа заменяются их квадратами.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int maxNum = a > b && a > c && a > d ? a : b > a && b > c && b > d ? b : c > a && c > b && c > d ? c : d;

        if (a <= b && b <= c && c <= d) {
            a = maxNum;
            b = maxNum;
            c = maxNum;
            d = maxNum;
            System.out.printf("a = %d, b = %d, c = %d, d = %d", a, b, c, d);
        } else if (a > b && b > c && c > d) {
            System.out.printf("a = %d, b = %d, c = %d, d = %d", a, b, c, d);
        } else {
            System.out.printf("a = %d, b = %d, c = %d, d = %d", a * a, b * b, c * c, d * d);
        }
    }
}
