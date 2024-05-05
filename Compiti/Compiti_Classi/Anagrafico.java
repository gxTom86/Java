class Anagrafico {
    public String nome;
    public String cognome;

    private String email;

    public void registro(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;

    }

    public String getEmail() {

        return email;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void stampaInfo() {
        System.out.println(" Nome : " + nome);
        System.out.println(" Cognome : " + cognome);
        System.out.println(" email : " + email);

    }

}