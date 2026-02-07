import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Primer número: ");
                number1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Segundo número: ");
                number2 = Integer.parseInt(scanner.nextLine());
                valid = true;
            } catch (Exception e) {
                System.out.println("Ingresa solo números enteros.");
            }
        }

        int sum = number1 + number2;
        System.out.println("La suma de " + number1 + " y " + number2 + " es: " + sum);
    }
}