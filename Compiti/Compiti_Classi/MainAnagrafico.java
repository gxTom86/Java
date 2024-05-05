import java.util.Scanner;

class MainAnagrafico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Anagrafico dati = new Anagrafico();

        System.out.println(" Inserisci Nome : ");
        String nome = scanner.nextLine();
        dati.setNome(nome);

        System.out.println(" Inserisci Cognome : ");
        String cognome = scanner.nextLine();
        dati.setCognome(cognome);

        System.out.println(" Inserisci Email : ");
        String email = scanner.nextLine();
        dati.setEmail(email);

        System.out.println("____________________");
        dati.stampaInfo();
    }
}
