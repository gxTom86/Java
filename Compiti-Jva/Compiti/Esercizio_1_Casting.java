/*
Esercizio 2 Scrivi un programma Java che dichiara una variabile di tipo double chiamata "numeroDecimale" e una variabile di tipo int chiamata "numeroIntero". 

Esegui un cast della variabile "numeroDecimale" in int e assegna il valore risultante alla variabile "numeroIntero". 

Stampa il valore della variabile "numeroIntero".
*/
class Esercizio_1_Casting
{
    public static void main(String args[])
    {
        int numeroIntero = 10;
        
        double numeroDecimale = 10;
        
        numeroIntero= (int)numeroDecimale;
        
        System.out.println("il valore della variabile  numeroDecimale  :" + numeroIntero);
    }
}