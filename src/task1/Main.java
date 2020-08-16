package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("Sum = %s \n", a + b);
        System.out.printf("Difference = %s \n", a - b);
        System.out.printf("Multiplication = %s", a * b);
    }
}
