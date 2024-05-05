/*
  Esercizio 8 Scrivi un programma Java che dichiara una variabile di tipo byte chiamata "numeroPiccolo" e una variabile di tipo int chiamata "numeroGrande".

   Esegui un cast della variabile "numeroPiccolo" in int e assegna il valore risultante alla variabile "numeroGrande". 

   Stampa il valore della variabile "numeroGrande".

*/
class Esercizio_8_Casting
{
    public static void main(String args[])
    {
       
    	byte numeroPiccolo=5;

		int numeroGrande = numeroPiccolo;

        System.out.println("il valore della variabile numeroGrande :" + numeroGrande);
    }
}