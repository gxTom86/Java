/*
 Esercizio 4 Creare una classe Libro con campi titolo, autore e anno di pubblicazione, 
 
 inserire i metodi set e get per tutti gli attributi ed un metodo per la stampa, 
 
 definire una classe contenente il main con il quale istanziare  
 a
 lmeno due oggetti diversi dei quali farete la stampa degli attributi.
 */

public class Libro_01 
{
    private String titolo;
    private String autore;
    private int anno;

    public Libro_01(String titolo, String autore, int anno)
    {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }

    public void setTitolo(String titolo)
    {
        this.titolo = titolo;
    }
    public void setAutore(String autore)
    {
        this.autore = autore;
    }
    public void setAnno(int anno)
    {
        this.anno = anno;
    }

    public String getTitolo()
    {
        return titolo;
    }
    public String getAutore()
    {
        return autore;
    }
    public int getAnno()
    {
        return anno;
    }

    public void stampaInfo()
    {
        System.out.println("Titolo : " + titolo);
        System.out.println("Autore : " + autore);
        System.out.println("Anno : " + anno);
    }
}
