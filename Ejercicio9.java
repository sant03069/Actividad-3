import java.util.Scanner;

class Libro {
    private String title;
    private String author;
    private int totalCopies;
    private int borrowedCopies;

    public Libro(String title, String author, int totalCopies) {
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.borrowedCopies = 0;
    }

    public boolean prestar() {
        if (totalCopies - borrowedCopies > 0) {
            borrowedCopies++;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (borrowedCopies > 0) {
            borrowedCopies--;
            return true;
        }
        return false;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Total: " + totalCopies);
        System.out.println("Prestados: " + borrowedCopies);
        System.out.println("Disponibles: " + (totalCopies - borrowedCopies));
    }
}

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libro book = new Libro("Minecraft", "Notch", 3);
        int option;

        do {
            System.out.println("1. Ver información");
            System.out.println("2. Prestar");
            System.out.println("3. Devolver");
            System.out.println("4. Salir");
            option = scanner.nextInt();

            if (option == 1) {
                book.mostrarInfo();
            } else if (option == 2) {
                if (book.prestar()) {
                    System.out.println("Préstamo realizado.");
                } else {
                    System.out.println("No hay ejemplares disponibles.");
                }
            } else if (option == 3) {
                if (book.devolver()) {
                    System.out.println("Devolución realizada.");
                } else {
                    System.out.println("No hay ejemplares prestados.");
                }
            }
        } while (option != 4);
    }
}
