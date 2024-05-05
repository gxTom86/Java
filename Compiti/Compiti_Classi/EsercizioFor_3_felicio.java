import java.util.Scanner;

public class EsercizioFor_3_felicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Esercizio 3 Stampare i numeri pari da 1 a 20 utilizzando un ciclo "for".

        for(int i=0; i<=20; i++){
            if(i%2==0){
                System.out.println(" " +i);
            }
        }


    }
}