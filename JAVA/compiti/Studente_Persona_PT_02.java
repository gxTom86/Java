
import java.util.Scanner;
import java.util.Random;

class Studente_Persona_02 extends Persona_PT_02
{
	private Scanner input = new Scanner (System.in);
	private Random casuale = new Random();

	private String classe;
	private double[] voti = new double[10];
	private int numVoti;

	public Studente_Persona_02 (String nome, String cognome, String classe)
	{
		super(nome, cognome);
		this.classe = classe;
	}

	public void assegnaVoti()
	{
		System.out.print("\n Quanti voti vuoi inserire? :  ");

		numVoti = Integer.parseInt(input.nextLine());

		for (int i=0; i<numVoti; i++)
		{
			voti[i] = casuale.nextInt(8) + 3; // Genera un intero tra 3 e 10
		}
	}

	public Double mediaVoti()
	{
		int somma = 0;

		double media;

		for (int i=0; i<numVoti; i++)
			somma += voti[i];

		media = ((int) (((double) somma / numVoti) * 100)) / 100.0 ;

		return media;

		//return ((int) (((double) somma / numVoti) * 100)) / 100.0 ;
	}

	public void stampaVoti()
	{
		//super.stampaPersona();

		System.out.println("\n Classe :  " + classe);

		System.out.println("\n Voti :  \n");

		for (int i=0; i<numVoti; i++)
			System.out.print("   " + voti[i]);

		System.out.println("");
	}
}