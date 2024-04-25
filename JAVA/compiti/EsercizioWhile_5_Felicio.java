
class EsercizioWhile_5_Felicio
{
	//Esercizio 6 Stampare i caratteri di una stringa uno alla volta utilizzando il ciclo "while"

public static void main (String args[])

	{
	String parola = "hello mondo";
		int i=0;
		char carattere;

		
		while(i<=parola.length())
		{
			
			carattere = charAt(i);
			System.out.print(" " + carattere);

			i++;
		}
		
		

	}

private static char charAt(int i) {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException("Unimplemented method 'charAt'");
}

	
}

