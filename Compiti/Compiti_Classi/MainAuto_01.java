/*
 * Esercizio 2 Creare una classe Auto con campi marca e modello, 
 * 
 * inserire i metodi set e get per tutti gli attributi ed un metodo per la stampa, 
 * 
 * definire una classe contenente il main 
 * 
 * con il quale istanziare  almeno due oggetti diversi dei quali farete la stampa degli attributi.
 */


 public class MainAuto_01
{
    public static void main(String[] args) 
    {
        Auto_01 auto1 = new Auto_01("Fiat", "500");
        auto1.StampaInfo();

        Auto_01 auto2 = new Auto_01("Tesla", "Model S");
        auto2.StampaInfo();
    }
}


    
    

