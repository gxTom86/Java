class Cd_02 {
    private String[] titoli = new String[10];
    private int[] durate = new int[10];
    private int numCanzoni = 0;

    public void setCanzone(String titolo, int durata) {
        if (numCanzoni < 10) {
            titoli[numCanzoni] = titolo;
            durate[numCanzoni] = durata;
            numCanzoni++;
        } else {
            System.out.println("Il CD contiene già 10 brani, non puoi inserirne altri!");
        }
    }

    public int numCanzoni() {
        return numCanzoni;
    }

    public void stampaInfo() {
        for (int i = 0; i < numCanzoni; i++) {
            System.out.println("Titolo: " + titoli[i] + ", Durata: " + durate[i] + " min");
        }
    }
}
