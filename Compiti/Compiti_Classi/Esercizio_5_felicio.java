import java.util.Scanner;

public class Esercizio_5_felicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int numero = scanner.nextInt(); 
        
        if ( numero % 2 == 0 && numero > 0){

            System.out.println(" il numero è pari e positivo ");
        }

        else{

            System.out.println(" il numero non è pari e positivo ");
        }
    }
}