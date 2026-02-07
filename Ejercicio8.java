import java.util.Scanner;

public class Ejercicio8 {
    public static int searchElement(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println("Ingresa los números del arreglo (ejemplo:1 8 7 0 9 9 ....):");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Número a buscar: ");
        int value = scanner.nextInt();

        int index = searchElement(numbers, value);

        if (index >= 0) {
            System.out.println("El número " + value + " se encontró en el índice: " + index);
        } else {
            System.out.println("El número no se encontró.");
        }
    }
}
