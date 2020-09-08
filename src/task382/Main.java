package task382;

import java.util.Random;

/**
 * Дана действительная матрица размера 6 x 9 . Найти
 * среднее арифметическое наибольшего и наименьшего зна
 * чений ее элементов.
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix = new int[6][9];
        int maxValue = 0;
        int minValue = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = rand.nextInt() / 1000000;
                if (maxValue < matrix[i][j]) {
                    maxValue = matrix[i][j];
                } else if (minValue > matrix[i][j]) {
                    minValue = matrix[i][j];
                }
            }
        }

        System.out.println("Среднее арифметического большего и меньшего числа матрицы = " + (maxValue + minValue) / 2);
    }
}
