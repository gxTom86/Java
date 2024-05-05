public class Persona_01 {
    
    private String nome;
    private String cognome;

    //costruttore classe Persona

    public Persona_01(String nome, String cognome)
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

    public String getCognome() {
        return cognome;
    }
    public String getNome() {
        return nome;
    }

    public void stampaInfo()
    {
        System.out.println("\n Nome : " + nome);
        System.out.println("\n Cognome : " + cognome);

    }

    
}
