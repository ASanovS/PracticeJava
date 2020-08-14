package task42;

import java.util.Scanner;

/**
 * Даны действительные числа х, у (.х != у ). Меньшее
 * из. этих двух чисел заменить их полусуммой, а большее —
 * их удвоенным произведением.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x < y) {
            System.out.printf("x = %d, y = %d", (x + y) / 2, (x * y) * 2);
        } else {
            System.out.printf("x = %d, y = %d", (x * y) * 2, (x + y) / 2);
        }
    }
}