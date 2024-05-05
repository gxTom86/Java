
class VettoreLibro_02 {
    private String titolo;
    private int pagine;
    private String autore;
    private int capitoli;

    public VettoreLibro_02(String titolo, int pagine, String autore, int capitoli) {
        this.titolo = titolo;
        this.pagine = pagine;
        this.autore = autore;
        this.capitoli = capitoli;
    }

    public int getPagine() {
        return this.pagine;
    }
                

   public void stampaInfo() {
        // Corrected the newline character
        System.out.println("\nTitolo: " + titolo + ", Autore: " + autore + ", Capitoli: " + capitoli + ", Pagine: " + pagine);
    }
} 