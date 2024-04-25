/*
Esercizio 4 Scrivi un programma Java che dichiara una variabile di tipo String chiamata "numeroStringa" e una variabile di tipo int chiamata "numeroIntero". 

Esegui un cast della variabile "numeroStringa" in int e assegna il valore risultante alla variabile "numeroIntero". 

Stampa il valore della variabile "numeroIntero".

*/
class Esercizio_3_Casting
{
    public static void main(String args[])
    {
        int numeroIntero = 10;
        
        String numeroStringa = numeroIntero + "";  //Aggiungendo un int a una stringa vuota,  esegue automaticamente la conversione dell'intero in una stringa.
        
        System.out.println("il valore della variabile numeroIntero :" + numeroIntero);
    }
}