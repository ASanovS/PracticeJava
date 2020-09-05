package task394;

import java.util.Random;
import java.util.Scanner;

/**
 * Дана целочисленная квадратная матрица порядка n .
 * Найти номера строк;
 * a) все элементы которых — нули;
 * b) элементы в каждой из которых одинаковы;
 * c) все элементы которых четны;
 * d) элементы каждой из которых образуют монотонную последовательность (монотонно убывающую или монотонно возрастающую);
 * д) элементы которых образуют симметричные последовательности (палиндромы).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(2);
//                matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }

//        a) все элементы которых — нули;
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            int countZero = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    countZero++;
                }
            }
            if (countZero == matrix.length) {
                System.out.println("Строка содержит все числа = 0 № = " + i);
            } else {
                System.out.println("Нет строк содержащих все 0");
            }
        }

//        b) элементы в каждой из которых одинаковы;
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            int count = 1;
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[i][j] == matrix[i][j + 1]) {
                    count++;
                }
            }
            if (count == matrix.length) {
                System.out.println("Строка содержит все одинаковые числа № = " + i);
            } else {
                System.out.println("Нет строк содержащих все одинаковые цифры");
            }
        }


    }
}
