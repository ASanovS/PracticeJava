package task65;

import java.util.Scanner;

/**
 * Дано натуральное число n ( n <= 9 9 ) . Выяснить,
 * верно ли, что n^2 равно кубу суммы цифр числа n.
 */
public class Main {
    private static int sum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int square = number * number;
        int cube = number * number * number;

        System.out.printf("Верно ли, что квадрат числа n равен" +
                "сумме цыфр n в кубе - %s", square == sumNumbCube(cube)? "true" : "false");
    }

    static int sumNumbCube(int num) {
        if (num > 0) {
            sum += num % 10;
            sumNumbCube(num /10);
        }
        return sum;
    }
}
