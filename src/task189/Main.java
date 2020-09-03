package task189;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральное число n, действительные числа а1 . . . , ап.
 * В последовательности а1 . . . , ап все неотрицательные члены,
 * не принадлежащие отрезку [ 1, 2] заменить на единицу.
 * Кроме того, получить число отрицательных членов и число членов,
 * принадлежащих отрезку [ 1, 2].
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длинну массива");
        int n = scanner.nextInt();
        int[] mas = new int[n];
        int sumMinus = 0;
        int sumCoutnOneTwo = 0;

        if (n == 0) {
            System.out.println("Введите число больше 0");
        } else {
            for (int i = 0; i < mas.length; i++) {
                if (i % 2 == 0) {
                    mas[i] = random.nextInt(10);
                } else {
                    mas[i] = random.nextInt(10) * -1;
                }

                if (i > 1 & mas[i] > 0) {
                    mas[i] = 1;
                }

                if (mas[i] < 0) {
                    sumMinus += mas[i];
                }

                if (i <= 1) {
                    sumCoutnOneTwo += mas[i];
                }
            }
        }

        for (int num : mas) {
            System.out.println("Число " + num);
        }

        System.out.println("Число отрицательных членов массива = " + sumMinus);
        System.out.println("Число членов принадлежащее к отрезку 1, 2 = " + sumCoutnOneTwo);
    }
}
