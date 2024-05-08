import java.util.Scanner;

class MainAnagrafico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Anagrafico dati = new Anagrafico("", "", 0);
        Anagrafico dati1 = new Anagrafico("Marco", "Rossi", 34);
        Anagrafico dati2 = new Anagrafico("Sebastian", "Felicio de Jesus", 23);
        Anagrafico dati3 = new Anagrafico("Sarah", "Immobilvsz", 45);

        CurriculumAnagrafico curriculum = new CurriculumAnagrafico("3664866086", "Abilità Organizzativa", "Terza Media",
                "Lava cessi");
        CurriculumAnagrafico curriculum2 = new CurriculumAnagrafico("234764375", "Sviluppatore Programmi",
                "Master In Informatica", "Videoludica");
        CurriculumAnagrafico curriculum3 = new CurriculumAnagrafico("345476457", "Socievole",
                "Diploma in Scienze Politiche", "Nessuna");

        // Creare un'istanza di MainAnagrafico
        MainAnagrafico main = new MainAnagrafico();
        String scelta = "";

        main.menu(dati, dati1, dati2, dati3, scanner, scelta, curriculum, curriculum2, curriculum3);
    }

    public void menu(Anagrafico dati, Anagrafico dati1, Anagrafico dati2, Anagrafico dati3, Scanner scanner,
            String scelta,
            CurriculumAnagrafico curriculum, CurriculumAnagrafico curriculum2, CurriculumAnagrafico curriculum3) {
        do {

            System.out.println("Cosa Vuoi Fare?");
            System.out.println("1 - Vedere i vari Lavoratori della tua città");
            System.out.println("2 - Inserire i Tuoi Dati");
            System.out.println("Uscire [*]");
            scelta = scanner.nextLine();

            switch (scelta) {
                case "1":
                    dati1.stampaInfo();
                    dati2.stampaInfo();
                    dati3.stampaInfo();

                    System.out.println("==========================");
                    System.out.println("Vuoi vedere più nel dettaglio i lavoratori? [Si/No]");
                    scelta = scanner.nextLine();

                    if (scelta.equalsIgnoreCase("si")) {
                        System.out.println("Di chi vuoi vedere il curriculum?");
                        System.out.println("==========================");
                        System.out.println(" ");

                        System.out.println("1 - Marco Rossi\n2 - Sebastian Felicio de Jesus\n3 - Sarah Immobilvsz");
                        scelta = scanner.nextLine();

                        switch (scelta) {
                            case "1":
                                System.out.println("==========================");

                                curriculum.stampaCurriculum();
                                break;
                            case "2":
                                System.out.println("==========================");

                                curriculum2.stampaCurriculum();
                                break;
                            case "3":
                                System.out.println("==========================");

                                curriculum3.stampaCurriculum();
                                break;
                        }
                    }
                    break;

                case "2":
                    System.out.println("Inserisci il tuo Nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Inserisci il tuo Cognome:");
                    String cognome = scanner.nextLine();
                    System.out.println("Inserisci la tua Età:");
                    int eta = Integer.parseInt(scanner.nextLine());
                    System.out.println("==========================");

                    dati.registro(nome, cognome, eta);
                    dati.stampaInfo();
                    break;

                case "*":
                    System.out.println("Uscita dal Programma");
                    return; // Uscire dal metodo

                default:
                    System.out.println("La scelta effettuata non è corretta!");
                    break;
            }
        } while (!scelta.equals("*"));
    }
}
