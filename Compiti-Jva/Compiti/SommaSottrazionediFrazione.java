
/* 
Realizzare un programma Java che richieda l'inserimento di di due frazioni e calcoli poi la somma e la sottrazione delle due frazioni, come riportato negli esempi allegati.

Realizzare il codice utilizzando il maggior numero di funzioni, così da demandare ad esse lo svolgimento delle parti di programma che devono essere ripetute.

In caso in cui non riusciate ad utilizzare le funzioni, realizzare tutto il codice nel main() .

Come indicato nelle immagini allegate, nel caso in cui il risultato presentasse 1 al denominatore, aggiungere un output in modo tale da non scriverlo.

La frazione risultante deve essere semplificata in modo opportuno. La semplificazione si ottiene dividendo numeratore e denominatore della frazione risultato per il MCD (Massimo Comun Divisore) ottenuto da numeratore e denominatore del risultato.
*/
import java.util.Scanner;

class SommaSottrazionediFrazione {
    public static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("*************************");
        System.out.println(" ");
        System.out.println("*************************");

        // Chiama il metodo InserimentoDati per ottenere i numeratori e denominatori
        // delle frazioni.

        int[] y = InserimentoDati();  // Assegna i valori inseriti dall'utente all'array y.

        ControlloDatiFrazione1(y[1], y[3]); // sono le celle dove ci sono i denominatori;  Controlla che i denominatori non siano zero.

        int denominatoreComune = CalcoloDenominatore(y[1], y[3]);

        SommaFrazioni(y[0], y[1], y[2], y[3], denominatoreComune);

        SottrazioneFrazione(y[0], y[1], y[2], y[3], denominatoreComune);
    }

    private static int[] InserimentoDati() {
        int[] x = new int[4];// creo vettore

        System.out.println("Inserisci i valori relativi al NUMERATORE e DENOMINATORE ");
        System.out.println("_________________________________________________________ ");

        System.out.print("Inserisci il NUMERATORE: ");
        x[0] = input.nextInt();
        System.out.print("Inserisci il DENOMINATORE: ");
        x[1] = input.nextInt();

        System.out.println(" ");

        System.out.println("Inserisci la SECONDA frazione ");
        System.out.println("_________________________________________________________ ");

        System.out.print("Inserisci il NUMERATORE: ");
        x[2] = input.nextInt();
        System.out.print("Inserisci il DENOMINATORE: ");
        x[3] = input.nextInt();
        return x;
    }

    private static void ControlloDatiFrazione1(int b, int d) {
        if (b == 0 || d == 0) {
            System.out.println(" ");
            System.out.println("MATH ERROR");
            System.out.println(" ");
            System.exit(1);//rileva l'errore ,  Questo comando termina il programma,  impostato a 1 per indicare che l'esecuzione è terminata a causa di un errore. 
                          //Di solito, 0 indica un'uscita senza errori, mentre altri valori (come 1) indicano vari tipi di errori.
        }

    }

    private static int CalcoloDenominatore(int b, int d) {
        int mcm = (b * d) / calcolaMCD(b, d); // Calcola il MCM come denominatore comune
        System.out.println("Il denominatore comune è: " + mcm);
        System.out.println("_________________________________________________________ ");
        System.out.println(" ");
        return mcm;
    }

    private static void SommaFrazioni(int numeratore1, int denominatore1, int numeratore2, int denominatore2,
            int denominatoreComune) {
        int numeratoreComune = (numeratore1 * (denominatoreComune / denominatore1)) +
                (numeratore2 * (denominatoreComune / denominatore2)); // faccio il calcolo della somma

        int[] risultatoSemplificato = Semplificazione(numeratoreComune, denominatoreComune);
        System.out
                .println("La somma delle due frazioni è: " + risultatoSemplificato[0] + "/" + risultatoSemplificato[1]);
        System.out.println("_________________________________________________________ ");
        System.out.println(" ");
    }

    private static void SottrazioneFrazione(int numeratore1, int denominatore1, int numeratore2, int denominatore2,
            int denominatoreComune) {
        int numeratoreComune = (numeratore1 * (denominatoreComune / denominatore1)) -
                (numeratore2 * (denominatoreComune / denominatore2)); // faccio il calcolo della somma

        int[] risultatoSemplificato = Semplificazione(numeratoreComune, denominatoreComune);

        System.out.println(
                "La sottrazione delle due frazioni è: " + risultatoSemplificato[0] + "/" + risultatoSemplificato[1]);
        System.out.println("_________________________________________________________ ");
        System.out.println(" ");
    }
/**
 * Calcola il Massimo Comune Divisore (MCD) di due numeri interi utilizzando l'algoritmo di Euclide.
 * 
 * L'algoritmo di Euclide per trovare il MCD di due numeri si basa sulla proprietà che il MCD non cambia
 * se si sostituisce il numero maggiore con la sua differenza rispetto al numero minore.
 * In questa implementazione, usiamo il modulo (%) per trovare il resto della divisione tra i due numeri,
 * che è equivalente alla differenza utilizzata nell'algoritmo di sottrazione di Euclide.
 */
   
    private static int calcolaMCD(int a, int b) {
    while (b != 0) {
        int temp = b; // Memorizza temporaneamente il valore di b.
        b = a % b;   // Assegna a b il resto della divisione di a per b.
        a = temp;   // Assegna a a il valore originale di b, conservato in temp.
    }
    // Quando b diventa 0, a contiene il MCD tra i due numeri.
    return a;
}

    private static int[] Semplificazione(int numeratore, int denominatore) {
        int mcd = calcolaMCD(numeratore, denominatore);         // Calcola il MCD di numeratore e denominatore.
        numeratore /= mcd;                                     // Divide il numeratore per il MCD per semplificarlo.
        denominatore /= mcd;                                  // Divide il denominatore per il MCD per semplificarlo.
        return new int[] { numeratore, denominatore };       // Restituisce la frazione semplificata come array di due elementi.
    }
}
