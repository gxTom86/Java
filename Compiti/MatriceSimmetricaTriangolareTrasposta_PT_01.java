import java.util.*;

class MatriceSimmetricaTriangolareTrasposta_PT_01 {
    // Inizializza un generatore di numeri casuali e uno scanner per l'input
    // dell'utente
    public static Random casuale = new Random();
    public static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        // Definisce le dimensioni delle matrici
        final int RIGHE = 7; // Numero di righe per la matrice quadrata
        final int COLONNE = RIGHE; // Numero di colonne per la matrice quadrata (uguale al numero di righe)
        final int RIGHE2 = 5; // Numero di righe per la seconda matrice (rettangolare)
        final int COLONNE2 = 7; // Numero di colonne per la seconda matrice (rettangolare)

        // Inizializza le matrici
        int mat1[][] = new int[RIGHE][COLONNE]; // Matrice quadrata
        int mat2[][] = new int[RIGHE2][COLONNE2]; // Matrice rettangolare
        int mat2Trasposta[][] = new int[COLONNE2][RIGHE2]; // Matrice trasposta della matrice rettangolare

        // Variabili di supporto
        int maxCasuale; // Il valore massimo per i numeri casuali generati
        int scambio; // Variabile di appoggio per lo scambio di elementi

        // Variabili booleane per controllare le proprietà delle matrici
        boolean simmetrica, triangAlta, triangBassa;

        // Chiede all'utente il valore massimo per i numeri casuali
        System.out.print("\n Quale valore casuale massimo vuoi generare? :  ");
        maxCasuale = Integer.parseInt(input.nextLine());

        // Creazione di una matrice triangolare alta
        for (int i = 0; i < RIGHE; i++) { // Itera sulle righe
            for (int j = 0; j < COLONNE; j++) { // Itera sulle colonne
                if (j >= i) // Se la colonna è uguale o maggiore della riga, inserisci un numero casuale
                    mat1[i][j] = casuale.nextInt(maxCasuale) + 1;
                else // Altrimenti, inserisci zero
                    mat1[i][j] = 0;
            }
        }

        // Stampa la matrice triangolare alta
        System.out.println("\n Matrice Triangolare ALTA...\n");
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++)
                System.out.printf("%5d", mat1[i][j]);
            System.out.println("\n");
        }

        // Verifica se la matrice è effettivamente triangolare alta
        triangAlta = true;
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                if (j < i && mat1[i][j] != 0) // Se trova un elemento non nullo sotto la diagonale principale, non è triangolare alta
                    triangAlta = false;
            }
        }

        if (triangAlta)
        {
            System.out.println("\n La matrice è Triangolare ALTA");
        }
            
        else
            {
                System.out.println("\n La matrice NON è Triangolare ALTA");
            }

        // Creazione di una matrice triangolare bassa (procedura simile a quella precedente ma con condizioni invertite)

        // Stampa e verifica di una matrice triangolare bassa (procedura simile a quella per la triangolare alta)

        // Trasposizione di una matrice quadrata (scambio di righe con colonne)

        // Stampa della matrice trasposta

        // Verifica se la matrice è simmetrica (una matrice è simmetrica se è uguale alla sua trasposta)

        // Creazione di una matrice simmetrica con valori 100 sulla diagonale

        // Stampa e verifica della matrice simmetrica

        // Creazione e trasposizione di una matrice rettangolare (procedura diversa data la diversa dimensione delle righe e colonne)

        // Qui il codice è stato troncato, ma la logica segue quanto illustrato sopra per la gestione delle matrici, la loro trasposizione e la verifica delle loro
