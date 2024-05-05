
import java.util.*;

class MenuSceltaRipetuto
{
	public static Scanner input = new Scanner(System.in);
	
	public static void  main(String[] args) 
	
	{
		short scelta;

		do 
		{
			System.out.println("\n -*-*-*- MENU DI SCELTA -*-*-*-");

			System.out.println("\n 1.  Inserire un nuovo utente ");

			System.out.println("\n 2.  Cancellare un utente ");

			System.out.println("\n 3.  Stampa utente");

			System.out.println("\n 0.  USCITA ");

			System.out.print("\n Digitare il numero desiderato : ");

			scelta = Short.parseShort(input.nextLine());

			switch(scelta)
			{
				case(1):
					{
						System.out.print("\n Inserire il nome utente : ");

						//chiamata funzione per l'inserimento per l'utente

						break;
					}

				case(2):
					{
						System.out.print("\n Quale utente vuoi cancellare? ");

						//chiamata funzione per l'inserimento per l'utente

						break;
					}
				case(3):
					{
						System.out.print("\n Stampa Dati utente ");

						//chiamata funzione per l'inserimento per l'utente

						break;
					}

				default:
					{
						if(scelta != 0 )
						System.out.println("\n Scelta non corretta!!");
					}

					
				
			}



		} while (scelta != 0);
		if (scelta == 0 );
		System.out.println("\n Programma terminato dall'utente ");

					System.out.println(" ");

	}
}