
class Persona_PT_02
{
	private String nome;
	private String cognome;

	public Persona_PT_02(String nome, String cognome)
	{
		this.nome = nome;
		this.cognome = cognome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}

	public String getNome()
	{
		return nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public void stampaPersona()
	{
		System.out.println("\n Nome :  " + nome);
		System.out.println("\n Cognome :  " + cognome);
	}
}