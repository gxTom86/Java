/*
 Esercizio 5 Creare una classe Cerchio con un campo raggio e metodi per calcolare l'area e la circonferenza, 
 
 inserire i metodi set e get per tutti gli attributi ed un metodo per la stampa, 

 definire una classe contenente il main con il quale istanziare 

 almeno due oggetti diversi dei quali farete la stampa degli attributi.
 */


public class MainCerchio {
    public static void main(String[] args) {
        
        Cerchio cerchio1 = new Cerchio(5.0);
        cerchio1.stampaDettagli();  

        // Creazione del secondo oggetto Cerchio
        Cerchio cerchio2 = new Cerchio(7.5);
        cerchio2.stampaDettagli();  
    }
}