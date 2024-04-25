import java.util.Scanner;

public class EsercizioFor_9_felicio {

    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Esercizio 9 Stampare i quadrati dei numeri da 1 a 10 utilizzando un ciclo "for".
        
        int n= 0;
        int esp = 0;
        for (int i = 0; i<= 10; i++) {
            n = i;
            esp = n*n;
            System.out.println(" " + esp);
        }

          

       
        
    }
}