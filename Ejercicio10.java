import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            option = scanner.nextInt();

            if (option >= 1 && option <= 4) {
                System.out.print("Número 1: ");
                double number1 = scanner.nextDouble();
                double number2;

                if (option == 4) {
                    do {
                        System.out.print("Número 2: ");
                        number2 = scanner.nextDouble();
                        if (number2 == 0) {
                            System.out.println("Error: no se puede dividir entre cero.");
                        }
                    } while (number2 == 0);
                } else {
                    System.out.print("Número 2: ");
                    number2 = scanner.nextDouble();
                }

                if (option == 1) System.out.println("Suma: " + (number1 + number2));
                if (option == 2) System.out.println("Resta: " + (number1 - number2));
                if (option == 3) System.out.println("Multiplicación: " + (number1 * number2));
                if (option == 4) System.out.println("División: " + (number1 / number2));
            }
        } while (option != 5);
    }
}
