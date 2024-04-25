/*
 Esercizio 6 Scrivi un programma Java che dichiara una variabile di tipo long chiamata "numeroLungo" e una variabile di tipo int chiamata "numeroIntero". 

 Esegui un cast della variabile "numeroLungo" in int e assegna il valore risultante alla variabile "numeroIntero". 

 Stampa il valore della variabile "numeroIntero".
*/
class Esercizio_6_Casting
{
    public static void main(String args[])
    {
        
    	long numeroLungo;

		int numeroIntero = (int) numeroLungo.longValue();
        System.out.println("il valore della variabile numeroIntero :" + numeroIntero);
    }
}