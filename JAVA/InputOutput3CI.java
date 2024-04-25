
//import java.util.Scanner;

import java.util.*;

class InputOutput3CI
{
	public static Scanner input = new Scanner(System.in);

	public static void main (String args[])
	{
		float varFloat1;

		double varDouble1;

		String frase1;

		System.out.print("\n Inserire un valore, anche decimale :  ");
		frase1 = input.nextLine();

		varFloat1 = Float.parseFloat(frase1);

		System.out.println("\n Hai inserito il valore :  " + varFloat1);

		System.out.print("\n Inserire un valore, anche decimale :  ");
		varDouble1 = Double.parseDouble(input.nextLine());

		System.out.println("\n Hai inserito il valore :  " + varDouble1);

		System.out.print("\n Inserire una frase :  ");
		frase1 = input.nextLine();

		System.out.println("\n Hai inserito la frase :  " + frase1);
	}


}