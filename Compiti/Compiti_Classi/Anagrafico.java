package Compiti_Classi;

class Anagrafico {
    public String nome;
    public String cognome;
    private int eta;
    private String lavoro;

    public Anagrafico(String nome, String cognome, int eta, String lavoro) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.lavoro = lavoro;
    }

    public void registro(String nome, String cognome, String lavoro, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.lavoro = lavoro;

    }

    public int getEta() {

        return eta;
    }

    public String getNome() {
        return nome;
    }

    public String getLavoro() {
        return lavoro;
    }

    public void setLavoro(String lavoro) {
        this.lavoro = lavoro;
    }

    /*
     * public String getCognome() {
     * return cognome;
     * }
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void stampaInfo() {
        System.out.println(" Nome : " + nome);
        System.out.println(" Cognome : " + cognome);
        System.out.println(" Età : " + eta + "anni");
        System.out.println(" Lavoro : " + lavoro);

    }

}