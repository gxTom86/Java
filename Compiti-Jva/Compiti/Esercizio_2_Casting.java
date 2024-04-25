/*
Esercizio 3 Scrivi un programma Java che dichiara una variabile di tipo int chiamata "numeroIntero" e una variabile di tipo String chiamata "numeroStringa". 

Esegui un cast della variabile "numeroIntero" in String e assegna il valore risultante alla variabile "numeroStringa". 

Stampa il valore della variabile "numeroStringa".
*/
class Esercizio_3_Casting
{
    public static void main(String args[])
    {
        int numeroIntero = 10;
        
        String numeroStringa = 0;
        
        numeroStringa= (int)numeroIntero;
        
        System.out.println("il valore della variabile numeroStringa :" + numeroStringa);
    }
}