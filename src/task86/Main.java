package task86;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Дано натуральное число я.
 * а) Сколько цифр в числе я?
 * б) Чему равна сумма его цифр?
 * в) Найти первую цифру числа я.
 * г) Найти знакочередующуюся сумму цифр числа n (пусть
 * запись n в десятичной системе есть ak ak_i . . .о0; найти ak —
 * -ak-1 +... +( — l)ka0).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int sumNum = 0;
        int first = 0;
        int alternatingNum = 0; //знакочередующаяся сумма числа

        for (int i = number; i > 0; i = i / 10) {
            count++;
            first = i % 10;
            sumNum = sumNum + first;
            if (count % 2 != 0) {
                alternatingNum = alternatingNum + first;
            }else {
                alternatingNum = alternatingNum - first;
            }
        }
        System.out.printf("Количество цифр в числе = %d, \n" +
                "Сумма цифр в числе = %d, \n" +
                "Первая цифра в числе = %d, \n" +
                "Знакочередующуяся сумма числа = %d", count, sumNum, first, alternatingNum);
    }
}
