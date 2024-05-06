class Cd_02
{
    private String titolo;
    private int durata;

    public Cd_02(String titolo, int durata)
    {
        this.titolo = titolo;
        this.durata = durata;
    }

    public String getTitolo()
    {
        return titolo;
    }

    public int getDurata()
    {
        return durata;
    }

    public void setTitolo(String titolo)
    {
        this.titolo = titolo;
    }

    public void setDurata(int durata)
    {
        this.durata = durata;
    }


    public void stampaInfo()
    {
        System.out.print("");
        System.out.println("Titolo: " + titolo);
        System.out.println("Durata: " + durata + " minuti");
    }
}