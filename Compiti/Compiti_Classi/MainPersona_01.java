/*
 * Esercizio 1 Creare una classe Persona con campi nome e cognome,
inserire i metodi set e get per tutti gli attributi ed un metodo per la stampa, 
definire una classe contenente il main con il quale istanziare  
almeno due oggetti diversi dei quali farete la stampa degli attributi.
 */



public class MainPersona_01 {

    public static void main(String args[])
    {
        Persona_01 persona1 = new Persona_01("Giuseppe", "Marino");
        persona1.stampaInfo();

        System.out.println("");

        persona1.setNome("Paperina");
        persona1.stampaInfo();

        System.out.println("");

        System.out.println("\n Nome : " + persona1.getNome());
        System.out.println("\n Cognome : " + persona1.getCognome());
    }
    
}
