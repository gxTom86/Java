import java.util.Scanner;

public class Esercizio_4_felicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un anno: ");
        int anno = scanner.nextInt(); // Legge l'anno come intero

        if (anno % 400 == 0) {
            System.out.println("Anno bisestile");
        } else if (anno % 4 == 0 && anno % 100 != 0) {
            System.out.println("Anno bisestile");
        } else {
            System.out.println("NON è un Anno bisestile");
        }
    }
}
