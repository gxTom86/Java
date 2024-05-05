
class Vettori

{
	public static void main (String args[])
	{
		

		int vet1[]= new int[10];
		int vet2[] = new int[15];


	System.out.println(" ");

	for(int i=0; i<vet1.length; i++)

		

	{
		vet1[i] = (int) (Math.random() * 100 ) +1;

		System.out.print("  " + vet1[i]);
	}

	System.out.println(" ");

	for(int i=0; i<15; i++)	
	{
		vet2[i] = (i+1)*2;

		System.out.print("  " + vet2[i]);
	}




	}
}