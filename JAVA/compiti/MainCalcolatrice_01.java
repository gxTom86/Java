import java.util.Scanner;

public class MainCalcolatrice_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calcolatrice_01 calcolatrice = new Calcolatrice_01();

        System.out.print("Inserisci il primo numero: ");
        calcolatrice.setNumero1(scanner.nextDouble());
        System.out.print("Inserisci il secondo numero: ");
        calcolatrice.setNumero2(scanner.nextDouble());

        int scelta;
        do {
            System.out.println("\nScegli l'operazione da eseguire:");
            System.out.println("1. Somma");
            System.out.println("2. Sottrazione");
            System.out.println("3. Moltiplicazione");
            System.out.println("4. Divisione");
            System.out.println("5. Stampa attributi");
            System.out.println("0. Esci");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Somma: " + calcolatrice.somma());
                    break;
                case 2:
                    System.out.println("Sottrazione: " + calcolatrice.sottrazione());
                    break;
                case 3:
                    System.out.println("Moltiplicazione: " + calcolatrice.moltiplicazione());
                    break;
                case 4:
                    System.out.println("Divisione: " + calcolatrice.divisione());
                    break;
                case 5:
                    calcolatrice.stampaAttributi();
                    break;
                case 0:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        } while (scelta != 0);
    }
}
