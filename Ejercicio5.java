import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Palabra: ");
        String word = scanner.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                if ("aeiou".indexOf(letter) >= 0) vowels++;
                else consonants++;
            }
        }

        System.out.println("Vocales: " + vowels);
        System.out.println("Consonantes: " + consonants);
    }
}
