package task41;

/**
 * Даны три действительных числа. Выбрать из них
 * те, которые принадлежат интервалу ( 1, 3).
 */
public class Main {
    public static void main(String[] args) {
        int[] mas = {1, 3, 5};
        for (int m : mas) {
            if (m < 4) {
                System.out.printf("%d ", m);
            }
        }
    }
}
