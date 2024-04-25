
class Prog_LibroScolastico_PT_07 // main sottClasse
{
	public static void main(String args[])
	{
		LibroScolastico libroScuola1 = new LibroScolastico ("Informatica - Java ", " A.Lorenzi - T.Felicio ", 2024, 422, " Informatica ", 4);

		libroScuola1.stampaInfo();// fa stampaInfo della sottoClasse

		Libro_PT_07 libro1 = new Libro_PT_07("Il signore degli anelli", "R. Tolkien");

		libro1.setAnno(1954);

		libro1.setPagine(1178);

		libro1.stampaInfo();// overWriting


	}
	
}