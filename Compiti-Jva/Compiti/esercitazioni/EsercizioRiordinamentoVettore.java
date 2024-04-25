import java.util.Random;

public class EsercizioRiordinamentoVettore {
    public static Random casuale = new Random();

    public static void main(String[] args) {
        int[] vett = new int[10];
        int scambio = 0;

        for (int i = 0; i < 10; i++) {
            vett[i] = casuale.nextInt(100);

            System.out.println(" " + vett[i]);
        }

        for (int i = 0; i <= 10; i++) {
            if (vett[i] > vett[i + 1]) {
                vett[i] = scambio;
                vett[i + 1] = vett[i];
                vett[i] = scambio;
            }

            for (i = 0; i < 10; i++) {

                System.out.println(" " + vett[i]);
            }
        }
    }
}
