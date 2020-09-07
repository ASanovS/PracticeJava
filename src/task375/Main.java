package task375;

import java.util.Random;
import java.util.Scanner;

/**
 * Дана действительная матрица размера n * m ,
 * в которой не все элементы равны нулю. Получить новую
 * матрицу путем деления всех элементов данной матрицы
 * на ее наибольший по модулю элемент.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int maxModuleNum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt() / 100000000;
                System.out.print(matrix[i][j] + " ");
                if (Math.abs(matrix[i][j]) > maxModuleNum) {
                    maxModuleNum = Math.abs(matrix[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] / maxModuleNum + " ");
            }
            System.out.println();
        }
    }
}
