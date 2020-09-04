package task196;

import java.util.Random;

/**
 * Даны целые числа а1, . . . , a50.
 * Получить последовательность Ь1, . . . , b50,
 * которая отличается от исходной тем,
 * что все нечетные члены удвоены.
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mas = new int[50];
        int[] masDouble = new int[50];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(20);
        }

        for (int number :
                mas) {
            System.out.print("Num = " + number + "; ");
        }

        for (int i = 0; i < masDouble.length; i++) {
            if (mas[i] % 2 == 0) {
                masDouble[i] = mas[i];
            } else {
                masDouble[i] = mas[i] * 2;
            }
        }

        System.out.println();
        for (int number :
                masDouble) {
            System.out.print("Num = " + number + "; ");
        }
    }
}
