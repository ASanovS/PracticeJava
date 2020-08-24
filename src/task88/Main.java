package task88;

import java.util.Scanner;

/**
 * Дано натуральное число л.
 * а) Выяснить, входит ли цифра 3 в запись числа n^2.
 * б) Поменять порядок цифр числа n на обратный.
 * в) Переставить первую и последнюю цифры числа n.
 * г) Приписать по единице в начало и в конец записи числа n.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numSquare = number * number;
        int revers = 0;
        int three = 0;
        int firstNum = 0;
        int lastNum = number % 10;
        int remainder = 1;

        for (int i = number / 10; i > 0; i /= 10) {
            remainder *= 10;
        }

        for (int i = number; i > 0; i /= 10) {
            revers = revers * 10 + i % 10;
            firstNum = i % 10;
        }

        for (int i = numSquare; i > 0; i /= 10) {
            if (i % 10 == 3) {
                three++;
            }
        }
        int swapFirstLast = (lastNum * (remainder / 10) + number % remainder / 10) * 10 + firstNum;
        int addNumOne = (10 * remainder + number) * 10 + 1;
        System.out.printf("Цыфра 3 %s в квадрат чиста %d \n" +
                        "Обратный порядок числа %d => %d \n" +
                        "Перестановка первой и последней цифры числа %d местами => %d \n" +
                        "Приписать по единице к числу %d в начало и конец => %d",
                three > 0 ? "входит" : "не входит", number,
                number, revers,
                number, swapFirstLast,
                number, addNumOne);
    }
}
