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

        System.out.printf("Входит число 3 в корен числа %d => %b\n", number, MainA.numSquare(number));
        System.out.printf("Обратный порядок числа %d => %d \n", number, MainB.revers(number));
        System.out.printf("Перестановка первой и последней цифры числа %d местами => %d \n", number, MainC.swapFirstLast(number));
        System.out.printf("Приписать по единице к числу %d в начало и конец => %d", number, MainD.addNumOne(number));
    }
}
