class Microonde {
    private String marca;
    private String alimentazione;
    private double prezzo;

    // Costruttori e metodi

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void stampaInfo() {
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("La marca: " + marca);
        System.out.println("Il tipo di alimentazione: " + alimentazione + " ");
        System.out.println("Prezzo: " + prezzo);
    }
}