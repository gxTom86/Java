
class Prog_Libro_PT_07
{
	public static void main (String[] args)
	{
		System.out.println(" ");

		System.out.println("LIBRO 1");

		Libro_PT_07 libro1 = new Libro_PT_07 ("Il signore degli anelli", "R. Tolkien", 1954, 1178);

		libro1.stampaInfo();

		System.out.println("");

		System.out.println("LIBRO 2");

		Libro_PT_07 libro2 = new Libro_PT_07 ("Cent'anni di solitudine", "Gabriel García Márquez", 1967, 471);

		//libro2.stampaInfo();

		System.out.println("\n "+ libro2);

		System.out.println("");

		System.out.println("LIBRO 3");

		Libro_PT_07 libro3 = new Libro_PT_07 ("il fu Mattia Pascal " , "L.Pirandello ");

		//libro3.anno=1925;  essendo privato non posso accedere devo fare un metodo

		libro3.setAnno(1925);// così posso

		libro3.setPagine(175);

		libro3.stampaInfo();

		System.out.println("");

		System.out.println("LIBRO 4");

		Libro_PT_07 libro4 = new Libro_PT_07("Il brucomela", " Mattone ", 2000, 150);

		
		System.out.println("TITOLO : " + libro4.getTitolo());
		System.out.println("AUTORE : " +  libro4.getAutore());
		System.out.println("PAGINE : " + libro4.getPagine());
		System.out.println("ANNO : " +libro4.getAnno());



		libro4.stampaInfo();




		















		System.out.println("");

	}
}