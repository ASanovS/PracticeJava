package task397;

import java.util.Random;

/**
 * Дана действительная квадратная матрица порядка 10. В строках с отрицательным элементом на
 * главной диагонали найти:
 * а) сумму всех элементов;
 * б) наибольший из всех элементов.
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rand.nextInt() / 100000000;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            int sumElements = 0;
            int maxElement = 0;
            int tmpI = rand.nextInt();

            for (int j = 0; j < matrix.length; j++) {
                if (j == i) {
                    if (matrix[i][j] < 0)
                        tmpI = i;
                }
            }

            if (tmpI == i) {
                for (int k = 0; k < matrix.length; k++) {
                    sumElements += matrix[i][k];
                    if (matrix[i][k] > maxElement) {
                        maxElement = matrix[i][k];
                    }
                }
                System.out.printf("Сумма чисел в строке № %d = %d\n", i + 1, sumElements);
                System.out.printf("Максимальное число в строке № %d = %d\n", i + 1, maxElement);
            }
        }
    }
}
