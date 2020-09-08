package task384;

import java.util.Random;
import java.util.Scanner;

/**
 * Дана действительная матрица размера m х n . Найти
 * сумму наибольших значений элементов ее строк.
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int maxSumNum = 0;

        for (int i = 0; i < m; i++) {
            int maxNum = 0;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt() / 10000000;
                System.out.print(matrix[i][j] + " ");
                if (maxNum < matrix[i][j]) {
                    maxNum = matrix[i][j];
                }
            }
            maxSumNum += maxNum;
            System.out.println();
        }

        System.out.println("Сумма максимальных значений строк = " + maxSumNum);
    }
}
