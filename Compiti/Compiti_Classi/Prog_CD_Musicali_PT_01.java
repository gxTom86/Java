
import java.util.Scanner;

class Prog_CD_Musicali_PT_01
{
	public static Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{
		CD_Musicali_PT_01 CD1 = new CD_Musicali_PT_01();
		CD_Musicali_PT_01 CD2 = new CD_Musicali_PT_01();
		CD_Musicali_PT_01 CD3 = new CD_Musicali_PT_01();

		menu(CD1);
		menu(CD2);
		menu(CD3);

		System.out.println("\n Programma terminato dall'utente");

		System.out.println("");
	}

	public static void menu (CD_Musicali_PT_01 CD)
	{
		int durata, numCanzoni, sceltaCanzone;

		String titolo, scelta;

		do
		{
			System.out.println("\n -*-*-*-*-*-  MENU' di SCELTA  -*-*-*-*-*-");
			System.out.println("\n 1. Inserisci nuova canzone");
			System.out.println("\n 2. Stampa contenuto del CD");
			System.out.println("\n 3. Modifica titolo canzone");
			System.out.println("\n 4. Modifica durata canzone");
			System.out.println("\n 5. Cerca durata canzone");
			System.out.println("\n *  USCITA");

			System.out.print("\n Effettuare la scelta :  ");

			scelta = input.nextLine();

			switch (scelta)
			{
				case ("1"):
					{
						numCanzoni = CD.numeroCanzoni();

						if (numCanzoni < 10)
						{
							System.out.print("\n Inserire il nuovo titolo :  ");
							titolo = input.nextLine();

							System.out.print("\n Inserire la durata :  ");
							durata = Integer.parseInt(input.nextLine());

							CD.setCanzone(titolo, durata);
						}

						else
						{
							System.out.print("\n Il CD contiene già 10 brani, non puoi inserirne altri!");
						}

						break;
					}

				case ("2"):
					{
						System.out.println("\n =========================================");
						
						CD.stampaElenco();

						numCanzoni = CD.numeroCanzoni();

						System.out.println("\n Il CD contiene  " + numCanzoni + "  canzoni");

						System.out.println("\n =========================================");

						break;
					}

				case ("3"):
					{
						System.out.print("\n Quale titolo vuoi modificare? (inserire il numero della canzone) :  ");
						sceltaCanzone = Integer.parseInt(input.nextLine());

						CD.modificaTitolo(sceltaCanzone);

						break;
					}

				case ("4"):
					{
						System.out.print("\n Quale durata vuoi modificare? (inserire il numero della canzone) :  ");
						sceltaCanzone = Integer.parseInt(input.nextLine());

						CD.modificaDurata(sceltaCanzone);

						break;
					}

				case ("5"):
					{
						System.out.print("\n La durata di quale brano ti serve? (inserire il numero della canzone) :  ");
						titolo = input.nextLine();

						CD.ricercaDurata(titolo);

						break;
					}

				default:
					{
						if (!scelta.equals("*"))
						{
							System.out.println("\n =========================================");
							System.out.println("\n La scelta effettuata non è corretta!");
							System.out.println("\n =========================================");
						}

						break;
					}
			}

		} while (!scelta.equals("*"));

		System.out.println("\n Sei uscito dal CD");
	}
}