

public class Cerchio {
    private double raggio;  

    // Costruttore della classe Cerchio
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    
    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    
    public double getRaggio() {
        return raggio;
    }

    
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    
    public double calcolaCirconferenza() {
        return 2 * Math.PI * raggio;
    }

    
    public void stampaDettagli() {
        System.out.println("Raggio: " + raggio + ", Area: " + calcolaArea() + ", Circonferenza: " + calcolaCirconferenza());
    }
}


