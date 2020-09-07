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
 * f) элементы которых образуют симметричные последовательности (палиндромы).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 0) {
                    matrix[i][j] = 0;
                } else if (i == 1) {
                    matrix[i][j] = 1;
                } else if (i == 2) {
                    matrix[i][j] = 2;
                } else if (i == 3) {
                    matrix[i][j] = j;
                } else if (i == 4) {
                    matrix[i][j] = n--;
                }else {
                    matrix[i][j] = random.nextInt(5);
                }
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
                System.out.printf("Строка %d содержит все 0\n", i + 1);
            } else {
                System.out.printf("В строке %d не содержит всех цифр равных 0\n", i + 1);
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
                System.out.printf("Строка %d содержит все одинаковые числа\n", i + 1);
            } else {
                System.out.printf("Строка %d не содержит все одинаковые цифры\n", i + 1);
            }
        }

//        c) все элементы четные
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            int countEven = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    countEven++;
                }
            }
            if (countEven == matrix.length) {
                System.out.printf("Строка %d содержит четные элементы\n", i + 1);
            } else {
                System.out.printf("Строка %d не содержит всех четных элементов\n", i + 1);
            }
        }

//        d) элементы каждой из которых образуют монотонную последовательность (монотонно убывающую или монотонно возрастающую);
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            int countUp = 1;
            int countDown = 1;
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[i][j] < matrix[i][j + 1]) {
                    countUp++;
                } else if (matrix[i][j] > matrix[i][j + 1]) {
                    countDown++;
                }
            }
            if (countUp == matrix.length) {
                System.out.printf("Строка № %d монотонно возрастающая\n", i + 1);
            } else if (countDown == matrix.length) {
                System.out.printf("Строка № %d монотонно убывающая\n", i + 1);
            }
        }

//        f) элементы которых образуют симметричные последовательности (палиндромы).
        for (int i = 0; i < matrix.length; i++) {
            int number = 0;
            for (int j = 0; j < matrix.length; j++) {
                number = number * 10 + matrix[i][j];
            }
            int reverse = 0;
            while (number > 0) {
                reverse = reverse * 10 + number % 10;
                number /= 10;
            }
            System.out.printf("Число в строке № %d является плоиндромо = %b\n", i, number == reverse);
        }
    }
}
