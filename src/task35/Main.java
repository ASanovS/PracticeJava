package task35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int max = Math.max(x + y + z, x * y * z);
        int min = Math.min(x + y + z / 2, x * y * z);

        System.out.printf("Max = %d\n", max);
        System.out.printf("Min = %d", (min*min) + 1);
    }
}
