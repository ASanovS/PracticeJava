package task33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Даны действительные числа x , y. Получить: " +
                "Максимальное, " +
                "Минимальное, " +
                "Максимально и минимальное");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.printf("Максимальное число = %d \n",Math.max(x, y));
        System.out.printf("Минимальное число = %d \n",Math.min(x, y));
        System.out.printf("Максимально число = %d, минимальное число = %d", Math.max(x, y) , Math.min(x, y));
    }
}
