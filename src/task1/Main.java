package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("Sum = %s \n", sum(a, b));
        System.out.printf("Difference = %s \n", difference(a, b));
        System.out.printf("Multiplication = %s", multiplication(a, b));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int difference(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

}
