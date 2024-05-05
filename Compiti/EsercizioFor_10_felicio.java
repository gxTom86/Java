import java.util.Scanner;

public class EsercizioFor_10_felicio {

    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Esercizio 10 Stampare tutta la sequenza di numeri interi a partire da 1 fino al valore inserito in input dall'utente, utilizzando un ciclo "for".
        
        System.out.println(" inserisci un numero : " );
        int n = Integer.parseInt(input.nextLine());

        for (int i = 1; i<= n; i++) {
            
            System.out.println("\n " + i);
        }

          

       
        
    }
}
