package task40;

import java.util.Scanner;

/**
 * Даны два действительных числа. Заменить первое
 * число нулем, если оно меньше или равно второму, и оставить
 * числа без изменения в противном случае.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x <= y) {
            x = 0;
            System.out.printf("x = %d, y = %d", x, y);
        } else {
            System.out.printf("x = %d, y = %d", x, y);
        }
    }
}
