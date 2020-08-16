package task37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести действительные числа a, b, c. " +
                "Удвоить их если a>=b>=c, в противном случае заменить на абсолютное значение");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= b && b >= c) {
            System.out.printf("a = %d, b = %d, c = %d", a * 2, b * 2, c * 2);
        } else {
            System.out.printf("a = %d, b = %d, c = %d",
                    Math.abs(a),
                    Math.abs(b),
                    Math.abs(c));
        }
    }
}
