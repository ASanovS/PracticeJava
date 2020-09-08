package task379;

import java.util.Random;
import java.util.Scanner;

/**
 * Дана действительная матрица размера m * n. Определить числа b1, . . . , bm равные соответственно:
 * a) суммам элементов строк;
 * b) произведениям элементов строк;
 * c) наименьшим значениям элементов строк;
 * d) значениям средних арифметических элементов строк;
 * f) разностям наибольших и наименьших значений элементов строк.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt() / 100000000;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        а) суммам элементов строк;
        for (int i = 0; i < m; i++) {
            int sumElements = 0;
            for (int j = 0; j < n; j++) {
                sumElements += matrix[i][j];
            }

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == sumElements) {
                    System.out.printf("В строке №%d елемент строки %d равен сумме строки %d\n", i + 1, matrix[i][j], sumElements);
                }
            }
        }

//        b) произведениям элементов строк;
        System.out.println();
        for (int i = 0; i < m; i++) {
            int multiplyElements = 1;
            for (int j = 0; j < n; j++) {
                multiplyElements *= matrix[i][j];
            }

            for (int j = 0; j < n; j++) {
                if (multiplyElements == matrix[i][j]) {
                    System.out.printf("В строке №%d елемент строки %d равен произведению строки %d\n", i + 1, matrix[i][j], multiplyElements);
                }
            }
        }

//         c) наименьшим значениям элементов строк;
        System.out.println();
        for (int i = 0; i < m; i++) {
            var mimValue = 0;
            for (int j = 0; j < n; j++) {
                if (mimValue > matrix[i][j]){
                    mimValue = matrix[i][j];
                }
            }
            System.out.printf("В строке №%d наименьшим елементом строки является =  %d\n", i + 1, mimValue);
        }

//        d) значениям средних арифметических элементов строк;
        for (int i = 0; i < m; i++) {
            int sumElements = 0;
            int average = 0;
            for (int j = 0; j < n; j++) {
                sumElements += matrix[i][j];
            }
            average = sumElements / m;

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == average){
                    System.out.printf("В строке №%d елемент строки %d равен среднему арифметическому строки %d\n", i + 1, matrix[i][j], average);
                }
            }
        }

//        f) разностям наибольших и наименьших значений элементов строк.
    }
}
