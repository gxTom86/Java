import java.util.Scanner; 


class EquazioniDiPrimoESecondoGrado {

    public static Scanner input = new Scanner(System.in);
    
    
    public static void main(String args[]) {
        char scelta; // Variabile per memorizzare la scelta dell'utente dal menu.

        do { 
            scelta = mostraMenu(); // Chiama il metodo mostraMenu per visualizzare le opzioni e ottenere la scelta dell'utente.
            // Utilizza lo switch per eseguire diverse azioni in base alla scelta dell'utente.
            switch (scelta) {
                case '1': 
                    risolviEquazionePrimoGrado();
                    break; 
                case '2': 
                    risolviEquazioneSecondoGrado();
                    break; 
                case '*': 
                    System.out.println("Uscita in corso...");
                    break;
                default: 
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != '*'); 
    }

    // Metodo per mostrare il menu e ritornare la scelta dell'utente.
    private static char mostraMenu() {
        // Stampa le opzioni del menu.
        System.out.println("\n---------------------------------");
        System.out.println("Risolvi Equazione Primo Grado   [1]");
        System.out.println("Risolvi Equazione Secondo Grado [2]");
        System.out.println("Uscita Programma                [*]");
        System.out.println("---------------------------------");
        System.out.print("FAI LA TUA SCELTA: ");
        char scelta = input.next().charAt(0); // Legge il primo carattere dell'input dell'utente.
        input.nextLine(); // Consuma la nuova linea rimanente per evitare problemi di input.
        return scelta; // Ritorna la scelta dell'utente.
    }

    // Metodo per risolvere un'equazione di primo grado.
    private static void risolviEquazionePrimoGrado() {
        // Chiede all'utente di inserire i coefficienti.
        System.out.print("Inserisci il coefficiente di X: ");
        double a = input.nextDouble();
        System.out.print("Inserisci il termine NOTO: ");
        double b = input.nextDouble(); 

        // determinare la soluzione dell'equazione.
        if (a == 0 && b == 0) {
            System.out.println("L'equazione è sempre vera."); // Caso di infinite soluzioni.
        } else if (a == 0) {
            System.out.println("L'equazione è impossibile."); // Nessuna soluzione.
        } else {
            double risultato = -b / a; // Calcola la soluzione dell'equazione.
            System.out.println("Il risultato è: " + risultato); // Stampa il risultato.
        }
        input.nextLine(); // Consuma il newline rimasto.
    }

    // Metodo per risolvere un'equazione di secondo grado.
    private static void risolviEquazioneSecondoGrado() {
        
        // Chiede all'utente di inserire i coefficienti.
        
        System.out.print("Inserisci il coefficiente di X^2: ");
        double a = input.nextDouble(); 
        System.out.print("Inserisci il coefficiente di X: ");
        double b = input.nextDouble(); 
         System.out.print("Inserisci il termine noto: ");
        double c = input.nextDouble(); 

        // Verifica se si tratta effettivamente di un'equazione di secondo grado.
        if (a == 0) {
            System.out.println("Non è un'equazione di secondo grado."); // Non è di secondo grado se a è 0.
            return; // Termina il metodo.
        }

        double delta = b * b - 4 * a * c; // Calcola il discriminante.

        // Determina il numero di soluzioni in base al valore di delta.
        if (delta > 0) {
           
            // Due soluzioni reali e distinte.
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("L'equazione ha due soluzioni reali e distinte: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
           
            // Una soluzione reale doppia.
            double x = -b / (2 * a);
            System.out.println("L'equazione ha una soluzione reale doppia: x = " + x);
        } else {
            // Nessuna soluzione reale.
            System.out.println("L'equazione non ha soluzioni reali.");
        }
        input.nextLine(); // Consuma il newline rimasto per prepararsi al prossimo input.
    }
}
