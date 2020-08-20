package task65;

import java.util.Scanner;

/**
 * Дано натуральное число n ( n <= 9 9 ) . Выяснить,
 * верно ли, что n^2 равно кубу суммы цифр числа n.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int square = number * number;
        int cube = number * number * number;
        int sumNumbCube = 0;

        while (cube > 0) {
            sumNumbCube += cube % 10;
            cube = cube / 10;
        }

        if (square == sumNumbCube) {
            System.out.println("Квадрат числа n равен сумме цыфр n в кубе");
        } else {
            System.out.println("Квадрат числа n не равен сумме цыфр n в кубе");
        }
    }
}
