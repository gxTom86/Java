class Cd_02 {
    private String titolo;
    private int durata;
    private int numCanzone;

    Cd_02 titoli = new Cd_02();
    Cd_02 durata = new Cd_02();

    public Cd_02(String titolo, int durata) {
        this.titolo[numCanzone] = titolo;
        this.durata[numCanzone] = durata;

        numCanzone++;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
     numCanzone =0;
     
    public void stampaInfo() {
        /*
         * System.out.print("");
         * System.out.println("Titolo: " + titolo);
         * System.out.println("Durata: " + durata + " minuti");
         */

        for (int i = 0; i < numCanzoni; i++) {

        }
    }
}