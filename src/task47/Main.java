package task47;

import java.time.Year;
import java.util.Scanner;

/**
 * Даны действительные положительные числа х, у , z.
 * а) Выяснить, существует ли треугольник с длинами
 * сторон х, y, z.
 * б) Если треугольник существует, то ответить— является ли он остроугольным.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x < 1 || y < 1 || z < 1) {
            System.out.println("Треугольника не существует");
        } else if (z * z < x * x + y * y) {
            System.out.println("Треугольник остроугольный");
        } else {
            System.out.println("Треугольник не остругольный");
        }
    }
}
