package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y = scanner.nextInt();

        System.out.printf("|x|-|y| / 1+|x*y| = %s", (Math.abs(x) - Math.abs(y)) / (1 + Math.abs(x) * Math.abs(y)));
    }
}
