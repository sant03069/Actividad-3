import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Número: ");
                number = Integer.parseInt(scanner.nextLine());
                valid = true;
            } catch (Exception e) {
                System.out.println("Ingresa un número entero.");
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
