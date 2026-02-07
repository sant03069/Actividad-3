import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de calificaciones: ");
        int count = scanner.nextInt();

        double[] grades = new double[count];
        double sum = 0;
        int approved = 0;
        int failed = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
            if (grades[i] >= 70) approved++;
            else failed++;
        }

        System.out.println("Promedio: " + (sum / count));
        System.out.println("Aprobadas: " + approved);
        System.out.println("Reprobadas: " + failed);
    }
}
