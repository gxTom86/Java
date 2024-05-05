class Auto_01 
{
    private String marca;
    private String modello;

    public Auto_01(String marca, String modello) 
    {
        this.marca = marca;
        this.modello = modello;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getMarca() 
    {
        return marca;
    }

    public void setModello(String modello) 
    {
        this.modello = modello;
    }

    public String getModello() 
    {
        return modello;
    }

    public void StampaInfo() 
    {
        System.out.println(" ");
        System.out.println("Marca: " + marca + ", Modello: " + modello);
        System.out.println(" ");
    }
}
