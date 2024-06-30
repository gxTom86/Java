import java.util.Scanner;

class MainCd_02 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Cd_02 disco1 = new Cd_02();
        menu(disco1);// perchè si fa menu(disco1);
    }

    public static void menu(Cd_02 disco)// perchè si mette come paramtri "Cd_02 disco" 
    {
        String scelta;
        String titolo;
        int durata = 0;
        do {

            System.out.println("\n -*-*-*-*-*-  MENU' di SCELTA  -*-*-*-*-*-");
            System.out.println("\n 1. Inserisci nuova canzone");
            System.out.println("\n 2. Stampa contenuto del CD");
            // System.out.println("\n 3. Modifica titolo canzone");
            // System.out.println("\n 4. Modifica durata canzone");
            // System.out.println("\n 5. Cerca durata canzone");
            System.out.println("\n *  USCITA");

            System.out.print("\n Effettuare la scelta :  ");
            scelta = input.nextLine();

            switch (scelta) {
                case ("1"):

                    if (disco.numCanzoni() < 10)// perchè disco.numCanzoni()?
                     {
                        System.out.print("Insersci il titolo : ");
                        titolo = input.nextLine();
                        System.out.print("Inserisci la durata :");
                        durata = Integer.parseInt(input.nextLine());
                        disco.setCanzone(titolo, durata); // cos'è disco.setCanzone(titolo, durata);
                    } else {
                        System.out.print("\n Il CD contiene già 10 brani, non puoi inserirne altri!");
                    }
                    break;

                case ("2"):

                    disco.stampaInfo();

                    break;

                case ("*"):

                    System.out.print(" Uscita ");
                    break;

                default:
                    System.out.println("\n Scelta non valida!");
                    break;

            }

        } while (!scelta.equals("*"));
    }
}
