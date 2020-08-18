package task62;

import java.util.Scanner;

/**
 * Определить, является ли данное целое число четным.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.printf("Какое число ввели: %s", x % 2 > 0 ? "нечетное" : "четное");
    }
}
