package task178;

import java.util.Random;

/**
 * Даны натуральные числа n, a.1, . . . , a.n. Определить количество
 * членов a.k последовательности a.1, . . . , а.n:
 * а) являющихся нечетными числами;
 * б) кратных 3 и не кратных 5;
 * в) являющихся квадратами четных чисел;
 * г) удовлетворяющих условию a.k < (a.k-1 + a.k+1 / 2 );
 * д) удовлетворяющих условию 2^k < a.k < k!;
 * е) имеющих четные порядковые номера и являющихся нечетными числами.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int lengMas = random.nextInt(10);
        int[] array = new int[lengMas];

        for (int i = 0; i < lengMas; i++) {
            array[i] = random.nextInt(200);
        }

        for (int m : array) {
            System.out.printf("Число %d %s \n", m, m % 2 == 0 ? "четное" : "не четное");
            if (m % 3 == 0 & m % 5 != 0) {
                System.out.printf("Число %d кратное 3 и не кратное 5\n", m);
            }
            if (Math.sqrt(m) % 2 == 0) {
                System.out.printf("Число %d является квадратом четного числа\n", m);
            }
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (2 * i < array[i] & array[i] < i ){
                System.out.printf("Число %d удовлетворяет условие a.k < (a.k-1 + a.k+1 / 2 )", array[i]);
            }
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < (array[i - 1] + array[i + 1]) / 2) {
                System.out.printf("Число %d удовлетворяет условие  2^k < a.k < k!", array[i]);
            }
        }


    }
}
