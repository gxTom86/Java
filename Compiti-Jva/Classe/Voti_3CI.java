
import java.util.*;

class Voti_3CI
{
	public static Scanner input = new Scanner(System.in);

	public static void main (String args[])
	{
		double voto;

		do 
		{
			do
			{
				System.out.print("\n  Inserire un voto(per uscire inserire un numero minore di [0]) : ");

			voto = Integer.parseInt(input.nextLine());
			
			}while (voto<0 || voto > 10 );
			

			System.out.print("\n  Inserire un voto(per uscire inserire un numero minore di [0]) : ");

			voto = Integer.parseInt(input.nextLine());

			if (voto >= 6)
			{
				System.out.print("\n Il voto è sufficente :) ");
			}

			else if (voto > 0)
			{
				System.out.print("\n Il voto è insufficente ");
			}

		} while(voto > 0);

		System.out.print("\n Programma Terminato.");
		
		System.out.print("\n");
	}
}