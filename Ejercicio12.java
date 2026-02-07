import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Frase: ");
        String phrase = scanner.nextLine().toLowerCase().replace(" ", "");

        boolean palindrome = true;
        int left = 0;
        int right = phrase.length() - 1;

        while (left < right) {
            if (phrase.charAt(left) != phrase.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (palindrome) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase NO es un palíndromo.");
        }
    }
}
