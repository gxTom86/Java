class Studente
{
	private String nome;
	private String cognome;
	private String matricola;

	public Studente(String nome,String cognome, String matricola)
	{
	this.nome = nome;
	this.cognome = cognome;
	this.matricola = matricola;
	}

	public String getNome()
	{
	return nome;
	}
	public String getCognome()
	{
	return cognome;
	}
	public String getMatricola()
	{
	return matricola;
	}

	public void stampaDati()
	{
	System.out.println("Nome : " + nome);
	System.out.println("Cognome : " + cognome);
	System.out.println("Matricola : " + nome);
	}

}