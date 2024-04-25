
import java.util.Scanner;

class Libro_PT_08
{
    private Scanner input = new Scanner(System.in);

	private String titolo;
	public  String autore;
	private int anno;
	public int pagine;

    public void inserisciLibro()
    {
        System.out.println("Inserire Titolo : ");
        titolo = input.nextLine();

        System.out.println("Inserire Autore : ");
        autore = input.nextLine();

		boolean errore;

		do
		{
			errore = false;
				try //lancia l'errore
			{
				System.out.println("Inserire Anno : ");
				anno = Integer.parseInt(input.nextLine());
				
				System.out.println("Inserire Pagine : ");
				pagine = Integer.parseInt(input.nextLine());
				
			}
			catch(Exception e) //cattura l'errore, manda messaggio all'utente
			{
				errore=true;
				System.out.println("");
				System.out.println("Errore, dato/i non Corretti ");

			}
		}while(errore);//richiede i dati fin che no li metti giusti
    }

	public Libro_PT_08() // costruttore di default
	{}

	public Libro_PT_08 (String titolo, String autore)  //overloading // libro 3
	{
		this.titolo = titolo;
		this.autore = autore;
	}

	public Libro_PT_08 (String titolo, String autore, int anno, int pagine)
	{
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
		this.pagine = pagine;
	}

	public Libro_PT_08(String titolo,int anno, int pagine)
	{
		this.titolo = titolo;
		this.anno = anno;
		this.pagine = pagine;
	}




	public void setTitolo(String titolo)
	{
		this.titolo = titolo;
		
	}

	public void setAutore(String autore)
	{
		this.autore = autore;

	}

	public void setAnno(int anno)
	{
		this.anno = anno;
		
	}

	public void setPagine (int pagine)
	{
		this.pagine = pagine;
		
	}



	public String getTitolo()
	{
		return titolo;
		
	}

	public String getAutore()
	{
		return autore;

	}

	public int getAnno()
	{
		return anno;

	}

	public int getPagine()
	{
		return pagine;

	}




	public void stampaInfo ()
	{
		System.out.println("\n TITOLO :  " + titolo);
		System.out.println("\n AUTORE :  " + autore);
		System.out.println("\n ANNO :  " + anno);
		System.out.println("\n PAGINE :  " + pagine);
	}

	
	
	public String toString() //overwriting
	{
		String output;

		output = "\n TITOLO : " + titolo + "\n AUTORE " + autore + " ANNO " + anno + " PAGINE " + pagine;
		
		return output;
	}
}