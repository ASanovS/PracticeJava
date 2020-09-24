package MobilePhoneNumberValidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона в формате 0667773366 или 380662451618");
        int phoneNumber = scanner.nextInt();
        int sumPhoneNumber;
        int countCalculate = 1;


        sumPhoneNumber = sumNumberPhone(phoneNumber, 0);
        System.out.printf("%dst round calculation = %d\n", countCalculate, sumPhoneNumber);
        while (sumPhoneNumber >= 10) {
                countCalculate++;
                sumPhoneNumber = sumNumberPhone(sumPhoneNumber, 0);
                System.out.printf("%dst round calculation = %d\n", countCalculate, sumPhoneNumber);
        }
        switch (sumPhoneNumber) {
            case 1 -> System.out.printf("Final round calculation = %s\n", "One");
            case 2 -> System.out.printf("Final round calculation = %s\n", "Two");
            case 3 -> System.out.printf("Final round calculation = %s\n", "Three");
            case 4 -> System.out.printf("Final round calculation = %s\n", "Four");
            case 5, 6, 7, 8, 9 -> System.out.printf("Final round calculation = %d\n", sumPhoneNumber);
        }
    }


    static int sumNumberPhone(long number, int acc) {
        acc += number % 10;
        if (number <= 0) {
            return acc;
        }
        return sumNumberPhone(number / 10, acc);
    }
}