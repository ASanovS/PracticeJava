package task68;

import java.util.Scanner;

/**
 * Дано натуральное число n (n<= 9999).
 * а) Является ли это число палиндромом (перевертышем)
 * с учетом четырех цифр, как, например, числа 2222, 6116,
 * 0440 и т. д.?
 * б) Верно ли, что это число содержит ровно три
 * одинаковые цифры, как, например, числа 6676, 4544, 0006 и т. д.?
 * в) Верно ли, что все четыре цифры числа различны?
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1000 до 9999");
        int number = scanner.nextInt();
        int numRevers = 0;
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;

        if (number >= 1000 & number <= 9999) {
            for (int i = number; i > 0; i = i / 10) {
                int nums = i % 10;
                numRevers = numRevers * 10 + nums;
                switch (nums) {
                    case 0 -> zero++;
                    case 1 -> one++;
                    case 2 -> two++;
                    case 3 -> three++;
                    case 4 -> four++;
                    case 5 -> five++;
                    case 6 -> six++;
                    case 7 -> seven++;
                    case 8 -> eight++;
                    case 9 -> nine++;
                }
            }
            if (number == numRevers) {
                System.out.printf("Число %d является палиндромом\n", number);
            } else if (zero == 3 | one == 3 | two == 3 | three == 3 |
                    four == 3 | five == 3 | six == 3 |
                    seven == 3 | eight == 3 | nine == 3) {
                System.out.printf("Число %d содержит три одинаковые цифры\n", number);
            } else if (number % 10 != number % 100 / 10 &
                    number % 100 / 10 != number % 1000 / 100 &
                    number % 1000 / 100 != number % 10000 / 1000) {
                System.out.printf("Число %d содержит все разные цифры", number);
            }
        } else {
            System.out.printf("Вы ввели число %d", number);
        }
    }
}
