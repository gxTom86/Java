/*
 Esercizio 4 Creare una classe Libro con campi titolo, autore e anno di pubblicazione, 
 
 inserire i metodi set e get per tutti gli attributi ed un metodo per la stampa, 
 
 definire una classe contenente il main con il quale istanziare  
 
 almeno due oggetti diversi dei quali farete la stampa degli attributi.
 */

public class MainLibro_01 
{
    public static void main(String args[])
    {
        Libro_01 libro1 = new Libro_01("Divina Commedia ", "Dante ",2024);
        libro1.stampaInfo();
    }
}
