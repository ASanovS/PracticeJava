package task86;

import java.util.Scanner;

/**
 * Дано натуральное число n
 * а) Сколько цифр в числе n?
 * б) Чему равна сумма его цифр?
 * в) Найти первую цифру числа n
 * г) Найти знакочередующуюся сумму цифр числа n (пусть
 * запись n в десятичной системе есть ak ak_i . . .о0; найти ak —
 * -ak-1 +... +( — l)ka0).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.printf("Сколько цифр в числе %d = %d\n", number, MainA.countNums(number));
        System.out.printf("Сумма цифр числа %d = %d\n", number, MainB.sumNums(number));
        System.out.printf("Первая цифра числа %d = %d\n", number, MainC.firstNum(number));
        System.out.printf("Знакочередующуюся сумма числа %d = %d\n", number, MainD.alternatingSum(number));
    }
}

