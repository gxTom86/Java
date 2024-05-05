public class VisibilitaVariabili
{
	public static int varGlobale; // Variabile visibile dal main e da tutte le altre eventuali funzioni

	public static void main(String args[])
	{
		int intA;
		
		intA = 7;
		
		System.out.println(intA);
		
		{   // Apro un sotto_ambito

			int intB;

			// int intA;  // Non posso dichiare una variabile già dichiarata in un sovra_ambito
		
			intA = 10;
			
			intB = 15;
			
			System.out.println(intA); // La variabile intA è visibile dentro
									// il blocco nel quale è stata definita e nei suoi
									// sottoblocchi. Quindi in questo sottoblocco è
									// visibile.
			
			System.out.println(intB);
			
		} // Chiusura del sottoambito
		
		// intB = 25; // La variabile intB è visibile solamente dentro
									// il blocco nel quale è stata definita e nei suoi
									// sottoblocchi. Quindi in questo punto non è
									// visibile.

		// System.out.println(intB); // La variabile intB è visibile solamente dentro
									// il blocco nel quale è stata definita e nei suoi
									// sottoblocchi. Quindi in questo punto non è
									// visibile.
		
	}
}