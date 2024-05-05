class Città_01 {
    private String nome;
    private int popolazione;
    private int edifici;
    private double inquinamento;

    public Città_01(String nome, int popolazione, int edifici, double inquinamento) {
        this.nome = nome;
        this.popolazione = popolazione;
        this.edifici = edifici;
        this.inquinamento = inquinamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopolazione(int popolazione) {
        this.popolazione = popolazione;
    }

    public void setEdifici(int edifici) {
        this.edifici = edifici;
    }

    public void setInquinamento(double inquinamento) {
        this.inquinamento = inquinamento;
    }

    public String getNome() {
        return nome;
    }

    public int getPopolazione() {
        return popolazione;
    }

    public int getEdifici() {
        return edifici;
    }

    public double getInquinamento() {
        return inquinamento;
    }

    public void StampaInfo() {
        System.out.println("La città è : " + nome);
        System.out.println("La popolazione è di : " + popolazione);
        System.out.println("Gli edifici sono : " + edifici);
        System.out.println("L'inquinamento è di : " + inquinamento + "%");
    }
}
