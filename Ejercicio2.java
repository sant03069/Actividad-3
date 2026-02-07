import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Edad: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("Hola " + name + ", eres un niño.");
        } else if (age <= 17) {
            System.out.println("Hola " + name + ", eres un adolescente.");
        } else if (age <= 64) {
            System.out.println("Hola " + name + ", eres un adulto.");
        } else {
            System.out.println("Hola " + name + ", eres un adulto mayor.");
        }
    }
}
