import java.util.Scanner;
class Prog_Libro_PT_08
{
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args)
	{
		final int MAX_LIBRI = 1;

        String autore,minuscolo;

        boolean trovato;

        Libro_PT_08[] vetLibri = new Libro_PT_08[MAX_LIBRI];    //vettore di oggetti

        for(int i=0; i<MAX_LIBRI; i++)
        {
            vetLibri[i] = new Libro_PT_08();    //allocazione in memoria con (New)
            vetLibri[i].inserisciLibro();   //utente inserisce i dati

        }

        System.out.println("\n Inserire Autore Ricercato : ");
        autore = input.nextLine();

        autore = autore.toLowerCase();

        trovato = false;

        for(int i=0; i<MAX_LIBRI; i++)
        {
            minuscolo = vetLibri[i].getAutore().toLowerCase();

            if(minuscolo.equals(autore))
            {
                System.out.println("");
                
                trovato = true;

                vetLibri[i].stampaInfo();

            }
        }

        System.out.println("");

        if(!trovato)//(trovato == false)
        {
            System.out.println("Autore non Presente ");
            System.out.println("");
        }

	}
}