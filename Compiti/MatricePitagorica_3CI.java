import java.util.*;

class MatricePitagorica_3CI {
    public static Random casuale = new Random();
    public static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        final int RIGHE = 20;
        final int COLONNE = 20;

        int righe, colonne;
        int contatore; // Dichiarazione della variabile contatore
        int somma; // Dichiarazione della variabile somma
        int sommaAttesa;

        int[][] mat1;
        mat1 = new int[RIGHE][COLONNE];

        do {
            System.out.print("\nQuante righe vuoi utilizzare? max[20]: ");
            righe = Integer.parseInt(input.nextLine());

            if (righe < 1 || righe > RIGHE)
                System.out.print("\nValore inserito non accettabile");

        } while (righe < 1 || righe > RIGHE);

        do {
            System.out.print("\nQuante colonne vuoi utilizzare? max[20]: ");
            colonne = Integer.parseInt(input.nextLine());

            if (colonne < 1 || colonne > COLONNE)
                System.out.print("\nValore inserito non accettabile");

        } while (colonne < 1 || colonne > COLONNE);

        // Riempimento della matrice con valori incrementali da 1
        contatore = 1; // Inizializzazione della variabile contatore
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                mat1[i][j] = contatore++;
            }
        }

        // Stampa della matrice

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.printf("%5d", mat1[i][j]);
            }
            System.out.println(); // Modificato per migliorare la leggibilità
        }

        // Calcolo della somma degli elementi della matrice

        somma = 0;
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                somma += mat1[i][j];
            }
        }
        //controllo se il risultato sia giusto 

        System.out.println("\nLa somma degli elementi: " + somma);

        sommaAttesa = (righe*colonne)*(righe*colonne+1)/2;

        System.out.println("\n  La somma attesa è : " + sommaAttesa);

        if(somma == sommaAttesa)
            System.out.println("\n La somma dei valori è corretta!");
        
        else 
            System.out.println("\n La somma dei valori NON è corretta!");

        System.out.println("\n");

        // riempio la matrice pitagorica 

        for (int i = 0; i < righe; i++) 
            for (int j = 0; j < colonne; j++) 
                mat1[i][j] = (i+1)*(j+1);
        


        // stampa della matrice pitagorica

            System.out.printf("\n");

        
        

         for (int i = 0; i < righe; i++) 
         {
            for (int j = 0; j < colonne; j++) 
                System.out.printf("%5d", mat1[i][j]);

            System.out.printf("\n");
                

        }






        

        


    }
}
