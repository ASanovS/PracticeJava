package task63;

import java.util.Scanner;

/**
 * Определить, верно ли, что при делении неотрицательного целого числа а
 * на положительное целое число Ь получается остаток,
 * равный одному из двух заданных чисел r или s.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = scanner.nextInt();
        int s = scanner.nextInt();

        if (a % b == r | a % b == s) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
