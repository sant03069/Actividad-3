import java.util.Scanner;

class Rectangulo {
    private double width;
    private double height;

    public Rectangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calcularArea() {
        return width * height;
    }

    public double calcularPerimetro() {
        return 2 * (width + height);
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Ancho: ");
                width = Double.parseDouble(scanner.nextLine());
                System.out.print("Alto: ");
                height = Double.parseDouble(scanner.nextLine());
                valid = true;
            } catch (Exception e) {
                System.out.println("Ingresa valores numéricos válidos.");
            }
        }

        Rectangulo rectangle = new Rectangulo(width, height);

        System.out.println("Área: " + rectangle.calcularArea());
        System.out.println("Perímetro: " + rectangle.calcularPerimetro());
    }
}
