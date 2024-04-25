import java.util.Scanner;

public class Esercizio_8_felicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una lettera ");
        String lettera  = scanner.nextLine();
        
        

        
        if (lettera.equals("a") || lettera.equals("e") || lettera.equals("i") || lettera.equals("o") || lettera.equals("u")) {// per confrontare una stringa si usa lettera.equals("e")
    System.out.println("è una vocale");
} else {
    System.out.println("è una consonante");
}
    }
}
