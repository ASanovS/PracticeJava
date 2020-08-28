package task178;

import java.util.Random;

/**
 * Даны натуральные числа n, a.1, . . . , a.n. Определить количество
 * членов a.k последовательности a.1, . . . , а.n:
 * a) являющихся нечетными числами;
 * b) кратных 3 и не кратных 5;
 * c) являющихся квадратами четных чисел;
 * d) удовлетворяющих условию a.k < (a.k-1 + a.k+1 / 2 );
 * e) удовлетворяющих условию 2^k < a.k < k!;
 * f) имеющих четные порядковые номера и являющихся нечетными числами.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int langMas = random.nextInt(10);
        int[] array = new int[langMas];

        for (int i = 0; i < langMas; i++) {
            array[i] = random.nextInt(200);
        }

        for (int m : array) {
            System.out.printf("Число %d = %s\n", m, MainA.evenOdd(m));
            System.out.printf("Число %d является кратным 3 и не кратным 5 =  %s\n", m, MainB.multiple(m));
            System.out.printf("Число %d является квадратом четного числа = %s\n", m, MainC.square(m));
        }

        System.out.println();
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < (array[i - 1] + array[i + 1]) / 2) {
                System.out.printf("Число %d удовлетворяет условию a.k < (a.k-1 + a.k+1 / 2) \n", array[i]);
            } else {
                System.out.printf("Число %d не удовлетворяет условию a.k < (a.k-1 + a.k+1 / 2) \n", array[i]);
            }
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (2 * i < array[i] & array[i] < MainFactorial.factorial(i)) {
                System.out.printf("Число %d удовлетворяет условию удовлетворяющих условию 2^k < a.k < k!\n", array[i]);
            } else {
                System.out.printf("Число %d не удовлетворяет условию удовлетворяющих условию 2^k < a.k < k!\n", array[i]);
            }
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 & array[i] % 2 != 0) {
                System.out.printf("Число %d имеет четный порядковый номер и является не четным\n", array[i]);
            }
        }
    }
}
