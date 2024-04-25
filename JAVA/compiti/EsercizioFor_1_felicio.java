import java.util.Scanner;

public class EsercizioFor_1_felicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Esercizio 1 Stampare i numeri da 1 a 10 utilizzando un ciclo "for"

        int contatore=0;

        for(int i=0; i<=100; i++){
           contatore += i;
           System.out.println(" " + contatore);
        }


    }
}