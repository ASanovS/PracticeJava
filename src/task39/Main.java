package task39;

import java.util.Scanner;

/**
 * Даны два действительных числа. Вывести первое
 * число, если оно больше второго, и оба числа, если это
 * не так.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.printf("%s", x > y ? x : x +" "+y);

    }
}
