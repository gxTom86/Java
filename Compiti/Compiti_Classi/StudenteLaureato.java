class StudenteLaureato extends Studente
{
	private String titoloTesi;
	private String universita;
	private int annoLaurea;

	public StudenteLaureato(String nome,String cognome,String matricola,String titoloTesi,String universita,int annoLaurea)
	{
	super(nome,cognome,matricola);
	this.titoloTesi = titoloTesi;
	this.universita = universita;
	this.annoLaurea = annoLaurea;
	}

	public String getTitoloTesi()
	{
	return titoloTesi;
	}
	public String getUniversita()
	{
	return universita;	
	}
	public int getAnnoLaurea()
	{
	return annoLaurea;
	}

	public void stampaDati()
	{
	System.out.println("Nome :" + getNome());
	System.out.println("Cognome :" + getCognome());
	System.out.println("Matricola :" + getMatricola());
	System.out.println("Titolo tesi :" + titoloTesi);
	System.out.println("Università :" + universita);
	}

}