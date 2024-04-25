/*
 Esercizio 5 Scrivi un programma Java che dichiara una variabile di tipo double chiamata "numeroDecimale" e una variabile di tipo int chiamata "numeroIntero".

 Esegui un cast della variabile "numeroDecimale" in int e assegna il valore risultante alla variabile "numeroIntero". 

 Stampa il valore della variabile "numeroIntero".

*/
class Esercizio_5_Casting
{
    public static void main(String args[])
    {
        
        Double numeroDecimale = 19.5;
        int numeroIntero = 10;
        
        numeroDecimale = ((Double)(numeroDecimale/numeroIntero));
        System.out.println("il valore della variabile numeroDecimale :" + numeroDecimale);
    }
}