import java.util.Scanner;

public class Esercizio_9_felicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prezzo originale del prodotto
        System.out.println("Inserisci il prezzo originale del prodotto: ");
        double prezzoOriginale = scanner.nextDouble();

        // percentuale di sconto
        System.out.println("Inserisci la percentuale di sconto (es. 20 per uno sconto del 20%): ");
        double percentualeSconto = scanner.nextDouble();

        // Calcolo il prezzo scontato
        double importoSconto = (prezzoOriginale * percentualeSconto) / 100;
        double prezzoScontato = prezzoOriginale - importoSconto;

       
        System.out.println("Il prezzo scontato del prodotto è: " + prezzoScontato + " €");
    }
}
