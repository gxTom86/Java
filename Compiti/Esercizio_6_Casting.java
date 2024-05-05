/*
 Esercizio 7 Scrivi un programma Java che dichiara una variabile di tipo float chiamata "numeroVirgola" e una variabile di tipo double chiamata "numeroDecimale". 

 Esegui un cast della variabile "numeroVirgola" in double e assegna il valore risultante alla variabile "numeroDecimale". 

 Stampa il valore della variabile "numeroDecimale".
*/
class Esercizio_7_Casting
{
    public static void main(String args[])
    {
        
    	float numeroVirgola=34.45343;

		Double numeroDecimale = (Double)numeroVirgola;
        System.out.println("il valore della variabile numeroDecimale :" + numeroDecimale);
    }
}