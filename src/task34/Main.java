package task34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        System.out.printf("Максимально число из трех = %d \n", x > y && x > z ? x : y > x && y > z ? y : z);
        System.out.printf("Минимальное число из трех = %d", x <y && x < z ? x : y < x && y < z ? y : z);
    }
}
