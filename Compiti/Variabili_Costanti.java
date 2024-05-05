
class Variabili_Costanti
{
	public static void main (String args[])
	{
		final float PI_GRECO = 3.14f; // Definizione di una COSTANTE

		// PI_GRECO = 9.57; // Questa istruzione, se scommentata, genererebbe un errore.
							// Infatti non è possibile cambiare il valore di una costante.

		byte variabileByte = 100; // Intero che ha 8 bit ( Il numero positivo più grande è
								// (2^7) - 1 = 127 )

		short variabileShort = 31789; // Intero che ha 16 bit ( Il numero positivo più grande è
								// (2^15) - 1 = 32767 )

		int prezzo = 20; // Intero che ha 32 bit ( il numero positivo più grande
						// è (2^31) - 1 )

		long variabileLong = 34567893; // Intero che ha 64 bit ( Il numero positivo più grande è
									// (2^63) - 1 )

		float valoreFloat = 9.0f; // Ha 32 bit, può avere 7 cifre decimali

		double valoreDouble=8.27; // Ha 64 bit, può avere 16 cifre decimali

		float valoreFloatDue = (float) 7.89; // Casting esplicito: l'utente cambia
											// temporaneamente il tipo di una variabile

		int num1 = (int) 23.8; // Casting esplicito di variabile double, che
							// diventa, solo in questo punto, di tipo int

		int num2 = (int) valoreDouble; // Casting esplicito di variabile double, che
									// diventa, solo in questo punto, di tipo int

		valoreDouble = valoreFloat; // E' possibile assegnare una variabile float ad una
									// variabile double perché non può esserci perdita
									// di informazione

		valoreFloat = (float) valoreDouble; // Non è possibile assegnare un double ad un
											// float perché potrei avere una perdita di
											// informazione. Per poter permettere
											// l'assegnazione devo forzare una retrocessione
											// locale della variabile, a float,
											// usando un casting esplicito

		char carattere = '?'; // Ha 16 bit, in codifica Unicode, può contenere un solo
							// carattere

		System.out.println("\n " + carattere + "\n");

		String frase;

		frase = "Buongiorno studenti di Java!";

		boolean flag = false;

		System.out.println("\n Hai scritto \\  \" la frase :  " + frase);

		System.out.println(); // Oppure System.out.println("");

		System.out.println("\n Hai scritto \\  \" la \t frase :  " + frase + "\n");

		System.out.println(" Inserire un valore :  ");

		System.out.print(" Inserire un valore :  ");

		System.out.println("\n\n " + prezzo/num1); // Il risultato sarà int (senza nessun casting)

		prezzo = 11;

		valoreDouble = 3; // Oppure valoreDouble = 3.0;

		valoreFloat = 19;

		System.out.println("\n " + prezzo/valoreDouble); // Il risultato sarà double (con casting implicito su prezzo)

		System.out.println("\n " + (float) prezzo/num1); // Il risultato sarà float (con casting implicito su num1)

		System.out.println("\n " + prezzo/(float) num1); // Il risultato sarà float (con casting implicito su prezzo)

		System.out.println("\n " + (float) prezzo/(float) num1); // Il risultato sarà float (senza casting implicito)

		System.out.println("\n " + (int) (valoreFloat/valoreDouble)); // Il risultato sarà int (con casting implicito su valoreFloat)

		System.out.println("\n " + (int) valoreFloat/ (int) valoreDouble); // Il risultato sarà int (senza casting implicito)

		System.out.println("\n\n\n " + (int) valoreFloat/valoreDouble); // Il risultato sarà double (con casting implicito su (int) valoreFloat)

		System.out.println("");

		prezzo = prezzo +1;

		prezzo++; // E' equivalente a prezzo = prezzo +1;

		prezzo -= 5; // Forma compatta di prezzo = prezzo - 5;

		valoreDouble /= 7; // Forma compatta di valoreDouble = valoreDouble/7;

		int risultato = 99;

		risultato %= 5; // Forma compatta di risultato = risultato % 5; // (varrà 4)
	}

}