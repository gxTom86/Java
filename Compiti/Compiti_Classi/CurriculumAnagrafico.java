class CurriculumAnagrafico {
    private String contatto;
    private String competenze;
    private String istruzione;
    private String esperienza;

    public CurriculumAnagrafico(String contatto, String competenze, String istruzione, String esperienza) {
        this.contatto = contatto;
        this.competenze = competenze;
        this.istruzione = istruzione;
        this.esperienza = esperienza;
    }

    public String getContatto() {
        return contatto;
    }

    public String getCompetenze() {
        return competenze;
    }

    public String getIstruzione() {
        return istruzione;
    }

    public String getEsperienza() {
        return esperienza;
    }

    public void setContatto(String contatto) {
        this.contatto = contatto;
    }

    public void setCompetenze(String competenze) {
        this.competenze = competenze;
    }

    public void setIstruzione(String istruzione) {
        this.istruzione = istruzione;
    }

    public void setEsperienza(String esperienza) {
        this.esperienza = esperienza;
    }

    
    public void stampaCurriculum() {
        System.out.println("Il mio contatto : " + contatto);
        System.out.println(" ");

        System.out.println("Le mie Competenze : " + competenze);
        System.out.println(" ");
        System.out.println("Istrzione : " + istruzione);
        System.out.println(" ");
        System.out.println("Esperienza : " + esperienza);

    }

}