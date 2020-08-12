package task38;

import java.util.Scanner;

/**
 * Даны действительные числа x, y. Вычислить z:
 * если x > y, то z = x - y;
 * в противном случае z = y - x + 1;
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.printf("z = %d", x > y ? x - y : y - x + 1);
    }
}
