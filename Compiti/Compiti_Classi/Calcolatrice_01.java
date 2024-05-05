public class Calcolatrice_01 {
    private double numero1;
    private double numero2;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double somma() {
        return numero1 + numero2;
    }

    public double sottrazione() {
        return numero1 - numero2;
    }

    public double moltiplicazione() {
        return numero1 * numero2;
    }

    public double divisione() {
        if (numero2 != 0)
            return numero1 / numero2;
        else
            return Double.NaN; // Double.NaN è comunemente usato in situazioni
                               // in cui un'espressione matematica non produce un valore definito
    }

    public void stampaAttributi() {
        System.out.printf("Numero1: , Numero2: ", numero1, numero2);
    }
}