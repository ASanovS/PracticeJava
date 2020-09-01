package task188;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральное число n, действительные
 * числа х1 . . . , хп. В последовательности х1 . . . , хп все члены,
 * меньшие двух, заменить нулями. Кроме того, получить
 * сумму членов, принадлежащих отрезку [3, 7], а также
 * число таких членов.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] mas = new int[n];
        int sumCoutThreeSeven = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
        }
        for (int num : mas) {
            System.out.println("Число массива " + num);
        }

        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 2) {
                mas[i] = 0;
            }
            System.out.printf("Если число меньше 2 заменить его 0 = %d\n", mas[i]);
        }

        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (i >= 2 & i <= 6) {
                sumCoutThreeSeven += mas[i];
                System.out.println("Число которое в ходи в предел от 3 до 7 = " + mas[i]);
            }
        }
        System.out.println("Сумма чисел в пределе от 3 до 7 числа = " + sumCoutThreeSeven);
    }
}
