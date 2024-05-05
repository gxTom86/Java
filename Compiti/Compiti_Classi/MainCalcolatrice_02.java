import java.util.Scanner;

public class MainCalcolatrice_02 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Calcolatrice_02 calcolo = new Calcolatrice_02();

        System.out.println(" Inserisci il primo Valore : ");
        calcolo.setNum1(scanner.nextDouble());

        System.out.println(" Inserisci il secondo Valore : ");
        calcolo.setNum2(scanner.nextDouble());

        int scelta;
        do {
            System.out.println("*******************************");

            System.out.println("Quale operazione vuoi eseguire?");
            System.out.println("\nScegli l'operazione da eseguire:");
            System.out.println("1. Somma");
            System.out.println("2. Sottrazione");
            System.out.println("3. Moltiplicazione");
            System.out.println("4. Divisione");
            System.out.println("5. Stampa attributi");
            System.out.println("0. Esci");
            scelta = scanner.nextInt();

            switch (scelta) {
                case (1):
                    System.out.println(" Somma " + calcolo.sommaNum());
                    break;

                case (2):
                    System.out.println(" Sottrazione " + calcolo.sottrazioneNum());
                    break;

                case (3):
                    System.out.println(" Moltiplicazione " + calcolo.moltiplicazioneNum());
                    break;

                case (4):
                    System.out.println(" Divisione " + calcolo.divisioneNum());
                    break;

                case (0):
                    System.out.println(" Esci dal programma ");
                    break;

            }

        } while (scelta != 0);

    }
}