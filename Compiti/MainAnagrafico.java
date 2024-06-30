//package Compiti_Classi;

import java.util.Scanner;

class MainAnagrafico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Anagrafico dati = new Anagrafico("", "", 0, "");
        Anagrafico dati1 = new Anagrafico("Marco", "Rossi", 34, "Cameriere");
        Anagrafico dati2 = new Anagrafico("Sebastian", "Felicio de jesus", 23, "Disocupato");
        Anagrafico dati3 = new Anagrafico("Sarah", "Immobilvsz", 45, "Avvocato");

        System.out.println(" Inserisci il tuo  Nome : ");
        String nome = scanner.nextLine();

        System.out.println(" Inserisci il tuo Cognome : ");
        String cognome = scanner.nextLine();

        System.out.println(" Inserisci la tua Età : ");
        int eta = Integer.parseInt(scanner.nextLine());

        System.out.println(" Inserisci il tuo attuale Lavoro : ");
        String lavoro = scanner.nextLine();

        System.out.println("____________________");
        dati.stampaInfo();

        System.out.print("Cosa Vuoi Fare?");

        System.out.print("");

        System.out.print(" 1-Vedere i vari Lavoratori della tua città");
        System.out.print(" 2-Vedere i tuoi dati");
        System.out.print("Uscire [*]");

    }

    public void menu(Anagrafico dati, Anagrafico dati1, Anagrafico dati2, Anagrafico dati3) // MainAnagrafico
                                                                                            // registro,Scanner scanner,
    {
        String scelta = "";

        do {
            switch (scelta) {
                case ("1"):

                    dati1.stampaInfo();
                    dati2.stampaInfo();
                    dati3.stampaInfo();
                    break;
                case ("2"):

                    dati.stampaInfo();

                case ("*"):

                    System.out.print("Uscita dal Programma");

                default:
                    if (!scelta.equals("*")) {
                        System.out.println("\n =========================================");
                        System.out.println("\n La scelta effettuata non è corretta!");
                        System.out.println("\n =========================================");
                    }

                    break;

            }
        } while (!scelta.equals("*"));
    }
}
