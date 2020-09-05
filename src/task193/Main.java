package task193;

import java.util.Random;
import java.util.Scanner;

/**
 * Пусть х0 = а; xk = qxk-1 + b, (k = 1 , 2, . . . ) .
 * Даны неотрицательное целое n , действительные а, b, с, d, q (с < d).
 * Принадлежит ли xn интервалу (с, d)?
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int q = scanner.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(100);
            if (i == 0) {
                mas[i] = a;
            } else {
                mas[i] = q * mas[i] - 1 + b;
            }
        }

        for (int ma : mas) {
            System.out.printf("Число %d  принадлежит интервалу c < d = %b\n", ma, ma * n > c & ma * n < d);
        }
    }
}
