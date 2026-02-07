import java.util.Scanner;

public class Ejercicio6 {
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de números(Ejemplo: 1 2 3 4 9 ...): ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        if (isSorted(numbers)) {
            System.out.println("El arreglo está ordenado.");
        } else {
            System.out.println("El arreglo NO está ordenado.");
        }
    }
}
