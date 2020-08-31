package task179;

import java.util.Random;

/**
 * Даны натуральные числа n, q1, . . . , qn. Найти
 * те члены qi последовательности q1, . . . , qn, которые
 * a) являются удвоенными нечетными числами;
 * b) при делении на 7 дают остаток 1, 2 или 5;
 * c) обладают тем свойством, что корни уравнения
 * х^2 + 3q.i — 5 действительны и положительны.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(200);
        }

        for (int num : mas) {
            System.out.printf("Число %d являются удвоенными нечетными числами = %b\n", num, MainA.doubleOdd(num));
        }

        System.out.println();
        for (int num : mas) {
            System.out.printf("Число %d при делении на 7 дают остаток 1, 2 или 5 = %b\n", num, MainB.remainder(num));
        }
    }
}
