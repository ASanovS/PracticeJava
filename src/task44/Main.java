package task44;

import java.util.Scanner;

/**
 * Если сумма трех попарно различных действительных чисел х, у , z меньше единицы, то наименьшее из
 * этих трех чисел заменить полусуммой двух других; в противном случае заменить меньшее из х и у полусуммой
 * двух оставшихся значений
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x + y + z < 1) {
            if (x < y && x < z) {
                x = (y + z) / 2;
            } else if (y < x && y < z) {
                y = (x + z) / 2;
            } else {
                z = (x + y) / 2;
            }
        } else if (x < y) {
            x = (y + z) / 2;
        } else {
            y = (x + z) / 2;
        }

        System.out.printf("x = %d, y = %d, z = %d", x, y, z);
    }
}
