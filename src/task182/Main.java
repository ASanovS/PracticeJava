package task182;

import java.util.Random;

/**
 * Даны натуральное число n, целые числа a1 . . . , ап.
 * Найти количество и сумму тех членов данной
 * последовательности, которые делятся на 5 и не делятся на 7.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[20];
        int sumNumb = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }

        for (int n :
                mas) {
            System.out.println("numb " + n);
        }

        System.out.println();
        for (int n : mas) {
            if (n % 5 == 0 & n % 7 != 0) {
                System.out.println("numb " + n);
                sumNumb += n;
            }
        }
        System.out.println("Сумма чиел которые делятся на 5 и не делятся на 7 = " + sumNumb);
    }
}
