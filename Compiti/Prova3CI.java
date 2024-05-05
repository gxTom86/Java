	
class Prova3CI
{
	public static void main (String args[])
	{
		System.out.print("\n ciao 3CI\n");

		System.out.println("\n ciao 3CI");

		String frase1, frase2 = "a tutti";

		frase1 = "Ciao";

		int numInt1, numInt2;
		
		double numDouble1, numDouble2;
		
		float numFloat1, numFloat2;

		numInt1 = 9;
		
		numDouble1 = 2.89;

		System.out.println("\n " + numDouble1);
		
		numFloat1 = 4.78f;

		System.out.println("\n " + numFloat1);
		
		numFloat2 = (float) 9.47;

		System.out.println("\n " + numFloat2);

		numFloat1 = numInt1;

		System.out.println("\n " + numFloat1);

		numDouble1 = numInt1;

		System.out.println("\n " + numDouble1);

		numInt2 = (int) numFloat2;

		System.out.println("\n " + numInt2);

		System.out.println("\n " + (7.0/2));

		System.out.println("\n " + (7+2));

		System.out.println("\n " + (int) (7+2+4+6+ (double) numInt2));

		System.out.println("\n La somma di 2 con 3 vale :  " + (2 + 3));

		System.out.println("\n La somma di 2 con 3 vale :  " + 2 + 3);

		System.out.println("\n Buongiorno " + " classe!");

		System.out.println("\n " + frase1 + " " + frase2);

		System.out.println("\n " + numInt1 + numInt2);  // Concatena i contenuti delle variabili

		System.out.println("\n " + (numInt1 + numInt2)); // Inserendo le parentesi esegue il calcolo

	}
}