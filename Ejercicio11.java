import java.util.Scanner;

class Producto {

    String description;
    double price;

    Producto(String description, double price) {
        this.description = description;
        this.price = price;
    }

    double calcularPrecio(double tax) {
        return price + (price * tax / 100);
    }

    String getDescripcion() {
        return description;
    }
}

public class Ejercicio11 {

    static String compararProductos(Producto a, Producto b) {
        if (a.calcularPrecio(20) > b.calcularPrecio(20)) {
            return a.getDescripcion();
        } else {
            return b.getDescripcion();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Descripcion del producto 1:");
        String description1 = sc.nextLine();

        System.out.println("Precio del producto 1:");
        double price1 = Double.parseDouble(sc.nextLine());

        System.out.println("Descripcion del producto 2:");
        String description2 = sc.nextLine();

        System.out.println("Precio del producto 2:");
        double price2 = Double.parseDouble(sc.nextLine()); 

        Producto product1 = new Producto(description1, price1);
        Producto product2 = new Producto(description2, price2);

        String expensiveProduct = compararProductos(product1, product2);

        System.out.println("El producto mas caro con impuesto es: " + expensiveProduct);

        sc.close();
    }
}
