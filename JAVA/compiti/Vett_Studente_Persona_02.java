
import java.util.Scanner;

class Vett_Studente_Persona_02
{
	private static Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{
		int numStudenti;
		String nome, cognome, classe;

		Studente_Persona_02 migliore, peggiore; // singoli oggetti che sevono a contenere i riferimenti del migliore e peggiore

		Studente_Persona_02[] studenti1 = new Studente_Persona_02[30]; //dichiarazione e dell'inizializzazione di un array. 

		System.out.print("\n Quanti studenti vuoi inserire? :  ");
		numStudenti = Integer.parseInt(input.nextLine());

		for (int i = 0; i<numStudenti; i++)
		{
			System.out.print("\n Inserire il nome :  ");
			nome = input.nextLine();

			System.out.print("\n Inserire il cognome :  ");
			cognome = input.nextLine();

			System.out.print("\n Inserire la classe :  ");
			classe = input.nextLine();

			studenti1[i] = new Studente_Persona_02(nome, cognome, classe);

			studenti1[i].assegnaVoti();

			studenti1[i].stampaPersona(); // Utilizzo un metodo ereditato

			studenti1[i].stampaVoti(); // Utilizzo un metodo appartenente alla classe alla quale
									// appartiene l'oggetto studenti1[i]

			System.out.println("\n Media dei voti :  " + studenti1[i].mediaVoti());

			System.out.println("\n -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		}

		// Ricerca dello studente migliore e peggiore

		migliore = studenti1[0]; // <- migliore e peggiore sono oggetti di tipo studente; 

		peggiore = studenti1[0];

		for (int i = 1; i<numStudenti; i++)
		{
			if ( migliore.mediaVoti() < studenti1[i].mediaVoti() )
				migliore = studenti1[i];

			if ( peggiore.mediaVoti() > studenti1[i].mediaVoti() )
				peggiore = studenti1[i];
		}

		System.out.println("\n Studente migliore...");

		migliore.stampaPersona();

		migliore.stampaVoti();

		System.out.println("\n Media dei voti :  " + migliore.mediaVoti());

		System.out.println("\n -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		System.out.println("\n Studente peggiore...");

		peggiore.stampaPersona();

		peggiore.stampaVoti();

		System.out.println("\n Media dei voti :  " + peggiore.mediaVoti());

		System.out.println(" ");
	}
}