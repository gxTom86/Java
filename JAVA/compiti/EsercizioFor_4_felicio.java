import java.util.Scanner;

public class EsercizioFor_4_felicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Calcolare il prodotto dei numeri dispari da 1 a 15 utilizzando un ciclo "for".

        int prodotto=1;

        for(int i=1; i<=15; i++){
            
            if(i%2!=0){
                prodotto =prodotto * i;
               
                
            }


        }
        System.out.println(" " + prodotto);


    }
}