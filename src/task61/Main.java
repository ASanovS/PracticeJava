package task61;

import java.util.Scanner;

/**
 * Дано действительное число х.
 * Получить целую часть числа х;
 * затем— число х, округленное до ближайшего целого;
 * затем— число х без дробных цифр.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        System.out.printf("Целое х = %f \n", x - x % 1);
        System.out.printf("Округленное х = %f \n", x % 1 >= 0.5 ? x + (1 - x % 1) : x - x % 1);
        System.out.printf("Без дробных чисел х = %d", (int) x);
    }
}
