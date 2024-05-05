
import java.util.Scanner;

class CD_Musicali_PT_01
{
	private Scanner input = new Scanner (System.in);

	private String[] titolo = new String[10];
	private int[] durata = new int[10];
	private int numCanzoni = 0;

	public void setCanzone(String titolo, int durata)
	{
		this.titolo[numCanzoni] = titolo;
		this.durata[numCanzoni] = durata;

		numCanzoni++;
	}

	public void modificaTitolo(int n)
	{
		String nuovoTitolo;

		System.out.print("\n Inserire il nuovo titolo :  ");
		nuovoTitolo = input.nextLine();

		titolo[n-1] = nuovoTitolo;

		System.out.println("\n Il nuovo titolo è stato inserito");

	}

	public void modificaDurata(int n)
	{
		int nuovaDurata;

		System.out.print("\n Inserire la nuova durata :  ");
		nuovaDurata = Integer.parseInt(input.nextLine());

		durata[n-1] = nuovaDurata;

		System.out.println("\n La nuova durata è stata inserita");

	}

	public void ricercaDurata(String titoloRicercato)
	{
		boolean trovato = false;

		numCanzoni = numeroCanzoni();

		for (int i=0; i<numCanzoni; i++)
		{
			if ( titolo[i].equalsIgnoreCase(titoloRicercato) )
			{
				System.out.println("\n La canzone richiesta ha una durata di  " + durata[i] + "  secondi");

				trovato = true;
			}
		}

		if ( !trovato )
			System.out.println("\n Titolo non trovato!");
	}

	public int numeroCanzoni()
	{
		return numCanzoni;
	}

	public void stampaElenco()
	{
		numCanzoni = numeroCanzoni();

		for (int i=0; i<numCanzoni; i++)
		{
			System.out.println("\n " + (i+1) + ".  " + titolo[i] + "      " + durata[i] + "  secondi");
		}
	}
}