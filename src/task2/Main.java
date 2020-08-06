package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y = scanner.nextInt();

        System.out.printf("|x|-|y| / 1+|x*y| = %s", equationSolution(x, y));
    }

    static double equationSolution(double x, double y) {
        double firsPart = moduleNumber(x) - moduleNumber(y);
        double secondPart = 1 + (moduleNumber(x) * moduleNumber(y));
        return firsPart / secondPart;
    }

    static double moduleNumber(double number) {
        return number < 0 ? number * -1 : number;
    }
}
