
class Anagrafico extends CurriculumAnagrafico {
    public String nome;
    public String cognome;
    private int eta;

    public Anagrafico(String nome, String cognome, int eta) {

        // Passare i parametri al costruttore della superclasse
        super("contatto di default", "competenze di default", "istruzione di default", "esperienza di default");
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;

    }

    /*public CurriculumDati(String contatto, String competenze, String istruzione, String esperienza) {
        super(contatto, competenze, istruzione, esperienza);
    }*/

    public void registro(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;

    }

    public int getEta() {

        return eta;
    }

    public String getNome() {
        return nome;
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
        System.out.println("==========================");
        System.out.println(" Nome : " + nome);
        System.out.println(" Cognome : " + cognome);
        System.out.println(" Età : " + eta + "anni");
        

    }

}