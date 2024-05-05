import java.util.Scanner;

public class EsercizioFor_7_felicio {

    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Esercizio 7: Calcolare il fattoriale di un numero utilizzando un ciclo "for".
        System.out.println("Inserisci un numero: ");
        int numero = Integer.parseInt(input.nextLine());

        
        int fattoriale = 1;

        for (int i = 1; i <= numero; i++) {
            fattoriale *= i; // Moltiplica il fattoriale per i (fattoriale = fattoriale * i)
        }

       
        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);
    }
}