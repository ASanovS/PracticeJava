package task194;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны натуральное число n, целые числа а, x1 ,..., xn
 * Если в последовательности х1...,хn
 * есть хотя бы один член, равный а, то получить сумму всех членов,
 * следующих за первым таким членом;
 * в противном случае ответом должно быть число — 10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int sumMas = 0;
        int count = 0;
        int indexNum = 0;
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
        }

        for (int num :
                mas) {
            System.out.println("number " + num);
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == a) {
                indexNum = i;
                count++;
                break;
            }
        }

        if (count > 0) {
            for (int i = 0; i < mas.length; i++) {
                if (i >= indexNum) {
                    sumMas += mas[i];
                }
            }
            System.out.println(sumMas);
        } else {
            System.out.println("10");
        }
    }
}
