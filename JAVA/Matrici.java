import java.util.*;

class Matrice_3CI {
    public static Random casuale = new Random();
    public static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        final int RIGHE = 5;
        final int COLONNE = 5;
        
        int[][] mat1 = new int[RIGHE][COLONNE];  // Matrice quadrata 5x5
        int casMax, somma, sceltaColonna;

        System.out.print("\nQuale valore massimo vuoi generare per gli elementi della matrice? ");
        casMax = Integer.parseInt(input.nextLine()); // Legge il valore massimo per gli elementi della matrice

        // Riempimento della matrice con numeri casuali tra 1 e casMax
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                mat1[i][j] = casuale.nextInt(casMax) + 1;
            }
        }

        // Stampa della matrice
        System.out.println("\nMatrice generata:");
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                System.out.printf("%5d", mat1[i][j]);
            }
            System.out.println();
        }

        // Calcolo e stampa della traccia (somma degli elementi sulla diagonale principale)
        somma = 0;
        for (int i = 0; i < RIGHE; i++) {
            somma += mat1[i][i];
        }
        System.out.println("\nLa traccia (somma degli elementi della diagonale principale) vale: " + somma);

        // Calcolo e stampa della somma degli elementi sulla diagonale secondaria
        somma = 0;
        for (int i = 0; i < RIGHE; i++) {
            somma += mat1[i][RIGHE - 1 - i]; // i+j = RIGHE - 1
        }
        System.out.println("\nLa somma degli elementi della diagonale secondaria vale: " + somma);

        // Somma degli elementi di una colonna specifica, scelta dall'utente
        do {
            System.out.print("\nQuale colonna vuoi sommare (1-" + COLONNE + ")? ");
            sceltaColonna = Integer.parseInt(input.nextLine());
            if (sceltaColonna < 1 || sceltaColonna > COLONNE) {
                System.out.println("\nIl valore inserito non è valido. Riprova.");
            }
        } while (sceltaColonna < 1 || sceltaColonna > COLONNE);

        // Calcolo della somma della colonna scelta
        somma = 0;
        for (int i = 0; i < RIGHE; i++) {
            somma += mat1[i][sceltaColonna - 1];  // Conversione indice colonna da 1-based a 0-based
        }

        System.out.println("\nLa somma degli elementi della colonna " + sceltaColonna + " vale: " + somma);
    }
}
