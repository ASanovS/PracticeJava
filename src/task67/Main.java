package task67;

import java.util.Scanner;

/**
 * Дано натуральное число n (n <= 100).
 * а) Сколько цифр в числе n?
 * б) Чему равна сумма его цифр?
 * в) Найти последнюю цифру числа n.
 * г) Найти первую цифру числа n.
 * д) В предположении, что n >= 10 , найти предпоследнюю цифру числа n.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100");
        int number = scanner.nextInt();
        int count = 0;
        int sumNumbs = 0;
        int lastNumbs = 0;
        int firstNumbs = 0;

        if (number <= 100) {
            while (number > 0) {
                if (number < 10) {
                    firstNumbs = number;
                } else {
                    lastNumbs = number % 10;
                }
                count++;
                sumNumbs += number % 10;
                number /= 10;
            }
            System.out.printf("Кол-во цифр в числе = %d\n" +
                    "Сумма цифр в числе = %d\n" +
                    "Последняя цыфра в числе = %d\n" +
                    "Первая цыфра в числе = %d\n", count, sumNumbs, lastNumbs, firstNumbs);
        } else {
            System.out.println("Вы ввели число больше 100");
        }

    }
}
