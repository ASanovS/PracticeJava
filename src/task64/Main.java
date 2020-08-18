package task64;

import java.util.Scanner;

/**
 * Дано натуральное число n (n > 99). Определить
 * число сотен в нем.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 99) {
            System.out.printf("Число сотен в n = %d", n / 100);
        } else {
            System.out.println("Число n не содержит сотни т.к. оно меньше 100");
        }
    }
}
