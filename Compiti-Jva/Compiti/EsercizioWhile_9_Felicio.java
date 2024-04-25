class EsercizioWhile_10_Felicio
{
    //Esercizio10 Stampare i numeri pari da 10 a 1 utilizzando il ciclo "do-while"

public static void main (String args[])

    {
    
        int i=0;
        int numero=10;

        do{
            if(numero%2==0){
                System.out.println(" " + numero);

            }
            numero--;
        }while(numero>=1);
        

    }

    
}
