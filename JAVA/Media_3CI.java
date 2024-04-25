
import java.util.*;

class Media_3CI

{
	public static Scanner input = new Scanner(System.in);

	public static void main (String args[])
	{
		//Scanner input = new Scanner(System.in); <-- non possiamo usare al di fuori dal main se lo metto qua.

		int eta1,eta2,eta3,mediaInt;
		float mediaFloat;
		double mediaDouble;

		System.out.print("\n Inserire la prima età :  ");
		eta1 = Integer.parseInt(input.nextLine());

		System.out.print("\n Inserire la seconda età  :  ");
		eta2 = Integer.parseInt(input.nextLine());

		System.out.print("\n Inserire la terza età  :  ");
		eta3 = Integer.parseInt(input.nextLine());

		mediaInt = (eta1+eta2+eta3)/3;

		mediaDouble = (eta1+eta2+eta3)/3.0;

		mediaDouble = (double) (eta1+eta2+eta3)/3;
		System.out.println("\n" + mediaDouble + "\n");

		mediaDouble = (eta1+(double)eta2+eta3)/3;

		mediaDouble = (eta1+eta2+eta3)/(double) 3; 

		mediaFloat = (float) (eta1+eta2+eta3)/3;

		mediaFloat = (eta1+(float)eta2+eta3)/3f;

		mediaFloat = (eta1+eta2+eta3)/(float)3;

		mediaDouble = 189.56787;
		System.out.println("\n" + mediaDouble + "\n");

		System.out.println("\n" + (int)mediaDouble + "\n");

		mediaDouble = ((int) (189.56787*100)/100.0);
		System.out.println("\n" + mediaDouble + "\n");

		System.out.print("\n" + Math.round(189.56787) + "\n");
		
	}
	
	}
