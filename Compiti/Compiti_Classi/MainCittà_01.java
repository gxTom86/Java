/*
Esercizio 9: Creare una classe Città

Campi: nome, nazione, popolazione.
Metodi: set e get per tutti gli attributi e un metodo per la stampa.
Main: istanziare almeno due oggetti diversi e stampare gli attributi di ciascuno.
*/
class MainCittà_01 {
    public static void main(String args[]) {
        Città_01 città = new Città_01("Alessandria", 1234252, 10000, 91.6);
        città.StampaInfo();
    }
}
