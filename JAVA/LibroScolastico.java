
class LibroScolastico extends Libro_PT_07
{
	private String materia;
	private int annoScolastico;


	//dichiarare il costruttore

	public LibroScolastico(String titolo, String autore, int anno, int pagine,String materia, int annoScolastico)
	{
		/*

		MODO DI DICHIARARE GLI ATTRIBUTI,DALLA SUPER CLASSE

		super.setTitolo(titolo);
		super.setAutore(autore);
		super.setAnno(anno);
		super.setPagine(pagine);
		
		*/

		
		//chiama il costruttore della superClasse Libro_PT_07

		super(titolo , autore , anno , pagine);

		//attributi classe LibroScolastico

		this.materia = materia;
		this.annoScolastico = annoScolastico;
	}

	public void setMateria(String materia)
	{
		this.materia = materia;
	}

	public void setAnnoScolastico(int anno)
	{
		this.annoScolastico = anno;
	}

	public String getMateria()
	{
		return materia;
	}

	public int getAnnoScolastico()
	{
		return annoScolastico;
	}

	public void stampaInfo()//stesso metodo per vedere overWriting
	{
		
		
		System.out.println("\n TITOLO :  " + super.getTitolo()); //ho messo get perchè è un attributo privato della super classe, cosi posso acedervi
		System.out.println("\n AUTORE :  " + super.getAutore());
		System.out.println("\n ANNO :  "   + super.getAnno());
		System.out.println("\n PAGINE :  " + super.getPagine());
		
		

		//super.stampaInfo;

		System.out.println("\n MATERIA :  " + getMateria()); // anche se l'ho dichiarata qua in questa classe, posso usare il get
		System.out.println("\n ANNO SCOLASTICO :  " + annoScolastico); //questo è un altro modo per farlo
	}






}