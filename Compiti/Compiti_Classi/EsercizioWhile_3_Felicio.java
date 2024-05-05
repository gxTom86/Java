
class EsercizioWhile_3_Felicio
{
	//Esercizio 4 Calcolare il prodotto dei numeri dispari da 1 a 15 utilizzando il ciclo "while"


public static void main (String args[])

	{
	
		int i=0;
		int risultato=0;

		while(i<=15){
			if(i%2!=0){
				risultato = risultato+1;
				System.out.print(" " + risultato);
			}
			i++;
		}
		

	}

	
}

