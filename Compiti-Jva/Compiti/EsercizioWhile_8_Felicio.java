
import java.util.Scanner;

class EsercizioWhile_8_Felicio {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int vNumeri[] = new int[30]; // Array di 30 interi
        
        // Supponiamo di voler riempire l'array con degli interi inseriti dall'utente
        
        int i = 0; // Indice per riempire l'array
        System.out.println("Inserisci 30 numeri:");
        do {
            vNumeri[i] = input.nextInt(); // Legge un intero dall'utente e lo assegna all'array
            i++;
        } while(i < vNumeri.length); // Continua fino a che l'array è pieno

       
        i = 0; // Reset dell'indice per l'operazione di stampa
        System.out.println("Elementi dell'array:");
        do {
            System.out.println(vNumeri[i]); // Stampa dell'array
            i++;
        } while(i < vNumeri.length); // Continua fino alla fine dell'array
    }
}



