import java.util.Scanner;

public class Esercizio_3_felicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci un carattere: ");
        String input = scanner.next(); // Legge l'input dall'utente
        char carattere = input.charAt(0); // Prende il primo carattere dell'input

        if (Character.isUpperCase(carattere)) {
            System.out.println(carattere + " è una lettera maiuscola.");
        } else if (Character.isLowerCase(carattere)) {
            System.out.println(carattere + " è una lettera minuscola.");
        } else {
            System.out.println(carattere + " non è una lettera.");
        }
    }
}
