
/*
Holy diver
1-10 turni 
2-ad ogni turno si affronta un boss con diverse statistiche(più forte)
3-lo scontro avviene con un lancio di dado 6 faccie
4- L'esito del lacio va a sommarsi alle statistiche del Personaggio/avversario 
5-ad ogni avversario sconfitto si aggiungono dei attributi alla forza
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Random;
import java.util.Scanner;

class MainHolyDiver {
    static Random casuale = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        MainBoss[] vettBoss = new MainBoss[10];
        /*
         * vettBoss[0] = new MainBoss("Grimlock il Terrore", 2.0, 2.0);
         * vettBoss[1] = new MainBoss("Vulthar il Sanguinario", 7.0, 8.0);
         * vettBoss[2] = new MainBoss("Cronos Ombra Eterna", 7.0, 10.0);
         * vettBoss[3] = new MainBoss("Skullgrim il Distruttore", 12.0, 10.0);
         * vettBoss[4] = new MainBoss("Morthak Maestro delle Ombre", 16.0, 17.0);
         * vettBoss[5] = new MainBoss("Zarvox il Corruttore", 20.0, 24.0);
         * vettBoss[6] = new MainBoss("Thornaxe l'Implacabile", 27.0, 25.0);
         * vettBoss[7] = new MainBoss("Gorthon il Decaduto", 35.0, 36.0);
         * vettBoss[8] = new MainBoss("Ravencrow il Macabro", 54.0, 48.0);
         * vettBoss[9] = new MainBoss("Drakmar il Vendicativo", 60.0, 60.0);
         */

        vettBoss[0] = new MainBoss("Grimlock il Terrore", -1.0, -1.0);
        vettBoss[1] = new MainBoss("Vulthar il Sanguinario", 0.0, 0.0);
        vettBoss[2] = new MainBoss("Cronos Ombra Eterna", 1.0, 1.0);
        vettBoss[3] = new MainBoss("Skullgrim il Distruttore", 2.0, 2.0);
        vettBoss[4] = new MainBoss("Morthak Maestro delle Ombre", 3.0, 3.0);
        vettBoss[5] = new MainBoss("Zarvox il Corruttore", 4.0, 4.0);
        vettBoss[6] = new MainBoss("Thornaxe l'Implacabile", 5.0, 5.0);
        vettBoss[7] = new MainBoss("Gorthon il Decaduto", 6.0, 6.0);
        vettBoss[8] = new MainBoss("Ravencrow il Macabro", 7.0, 7.0);
        vettBoss[9] = new MainBoss("Drakmar il Vendicativo", 8.0, 8.0);

        MainBoss giocatore1 = new MainBoss("Holy Diver", 0.0, 0.0);

        System.out.println("______________________");
        System.out.println("BENVENUTO A HOLY DIVER");
        System.out.println("______________________");

        boolean decisione;

        boolean testa = false;
        boolean croce = false;

        String scelta = "";

        do {

            decisione = false;

            System.out.println("Che la Fortuna Sia Con Te");
            System.out.println("Scegli per Procedere :");
            System.out.print("Testa o Croce : ");

            scelta = scanner.nextLine();

            if (scelta.equals("Testa")) {
                decisione = true;

                System.out.println("Si lancia!!!!");

                int dado = casuale.nextInt(2);

                if (dado == 1) {
                    System.out.println("_______________________________");
                    System.out.println("è uscito Testa");
                    System.out.println("Inizi Tu. Via!!");

                    testa = true;

                    combattimento(vettBoss, giocatore1, testa, !testa);
                }

                else {
                    System.out.println("_______________________________");
                    System.out.println("è uscito Croce");
                    System.out.println("Inizi L'avversario. Via!!");
                    combattimento(vettBoss, giocatore1, testa, !testa);

                }

            }

            if (scelta.equals("Croce")) {
                int dado = casuale.nextInt(2);

                System.out.println("Si lancia!!!!");

                decisione = true;

                if (dado == 1) {
                    System.out.println("_______________________________");
                    System.out.println("è uscito Croce");
                    System.out.println("Inizi Tu. Via!!");

                    croce = true;

                    combattimento(vettBoss, giocatore1, testa, !testa);
                }

                else {
                    System.out.println("_______________________________");
                    System.out.println("è uscito Testa");
                    System.out.println("Inizia L'avversario. Via!!");
                    combattimento(vettBoss, giocatore1, testa, !testa);

                }

            }

        } while (!decisione);

    }

    static void combattimento(MainBoss vettBoss[], MainBoss giocatore1, boolean testa, boolean croce) {

        double forza = 0.0;
        double difesa = 0.0;
        double attaccoPassato = 0.0;
        int attaccoPassatoBoss = 0;
        double attSubito = 0.0;
        int contatoreRoundGiocatore = 0;
        int contatoreRoundBoss = 0;
        int contatoreScontro = 0;
        double aggiungiBonus = 0.0;

        if (testa) {
            for (int i = 0; i < vettBoss.length; i++) {

                giocatore1.resetStats();

                System.out.println("_______________________________");
                contatoreScontro++;
                System.out.println(" ");
                System.out.println("Scontro N. " + contatoreScontro + " Sei contro: " + vettBoss[i].getNome());

                for (int round = 0; round < 2; round++) {
                    System.out.println("Round n." + round);

                    giocatore1.assegnaValore(casuale);
                    vettBoss[i].assegnaValore(casuale);

                    System.out.println("_______________________________");
                    System.out.println("STATISTICHE");
                    System.out.println("Giocatore : ");

                    System.out.println("Attacco : " + giocatore1.getForza());
                    System.out.println("Difesa : " + giocatore1.getDifesa());

                    System.out.println("Avversario :");
                    System.out.println("Attacco : " + vettBoss[i].getForza());
                    System.out.println("Difesa : " + vettBoss[i].getDifesa());

                    System.out.println("_______________________________");

                    if (giocatore1.getForza() > vettBoss[i].getDifesa()) {
                        attaccoPassato = giocatore1.getForza() - vettBoss[i].getDifesa();

                        giocatore1.setForza(attaccoPassato);

                        System.out.println("Gli hai Fatto " + attaccoPassato + " Danni ");

                        contatoreRoundGiocatore++;
                        // System.out.println(" ");
                    }

                    else {
                        System.out.println("Non riesci a fare danno al nemico");
                    }

                    if (vettBoss[i].getForza() > giocatore1.getDifesa()) {
                        attSubito = vettBoss[i].getForza() - giocatore1.getDifesa();

                        vettBoss[i].setForza(attaccoPassatoBoss);

                        System.out.println("Hai Subito " + attSubito + " Danni ");
                        contatoreRoundBoss++;
                    }

                    else
                        System.out.println("Non ti passa Danno");

                    if (vettBoss[i].getForza() < giocatore1.getDifesa()
                            && giocatore1.getForza() < vettBoss[i].getDifesa()) {
                        System.out.println("Lo scontro è andato al pareggio, ma ci deve essere un vincitore.");

                        do {
                            for (round = 0; round < 2; round++) {
                                System.out.println("Round n." + round);

                                giocatore1.assegnaValore(casuale);
                                vettBoss[i].assegnaValore(casuale);

                                System.out.println("_______________________________");
                                System.out.println("STATISTICHE");
                                System.out.println("Giocatore:");
                                System.out.println("Attacco: " + giocatore1.getForza());
                                System.out.println("Difesa: " + giocatore1.getDifesa());
                                System.out.println("Avversario:");
                                System.out.println("Attacco: " + vettBoss[i].getForza());
                                System.out.println("Difesa: " + vettBoss[i].getDifesa());

                                if (giocatore1.getForza() > vettBoss[i].getDifesa()) {
                                    attaccoPassato = giocatore1.getForza() - vettBoss[i].getDifesa();
                                    System.out.println("Gli hai fatto " + attaccoPassato + " danni");
                                    contatoreRoundGiocatore++;
                                } else {
                                    System.out.println("Non riesci a fare danno al nemico");
                                }

                                if (vettBoss[i].getForza() > giocatore1.getDifesa()) {
                                    attSubito = vettBoss[i].getForza() - giocatore1.getDifesa();
                                    System.out.println("Hai subito " + attSubito + " danni");
                                    contatoreRoundBoss++;
                                } else {
                                    System.out.println("Non ti passa danno");
                                }
                            }
                        } while (vettBoss[i].getForza() < giocatore1.getDifesa()
                                && giocatore1.getForza() < vettBoss[i].getDifesa());
                    }

                }
                System.out.println("_______________________________");

                if (contatoreRoundGiocatore >= contatoreRoundBoss) {
                    System.out.println("Hai vinto lo scontro contro " + vettBoss[i].getNome() + "!");
                    // giocatore1.incrementaForza(5);
                    // giocatore1.incrementaDifesa(5);
                } else {
                    System.out.println("Hai perso lo scontro contro " + vettBoss[i].getNome());
                    System.out.println("Spera nella tua Vittoria la Prossima Volta,Forse");
                    break;

                }
            }

        } // if (testa)

        if (croce) {

            for (int i = 0; i < vettBoss.length; i++) {
                giocatore1.resetStats();

                System.out.println("_______________________________");
                contatoreScontro++;
                System.out.println(" ");
                System.out.println("Scontro N. " + contatoreScontro + " Sei contro: " + vettBoss[i].getNome());
                for (int round = 0; round < 2; round++) {

                    System.out.println("Round n." + round);

                    giocatore1.assegnaValore(casuale);
                    vettBoss[i].assegnaValore(casuale);

                    System.out.println("_______________________________");
                    System.out.println("STATISTICHE");

                    System.out.println("Attacco : " + giocatore1.getForza());
                    System.out.println("Difesa : " + giocatore1.getDifesa());

                    System.out.println("Avversario :");
                    System.out.println("Attacco : " + vettBoss[i].getForza());
                    System.out.println("Difesa : " + vettBoss[i].getDifesa());

                    if (vettBoss[i].getForza() > giocatore1.getDifesa()) {
                        attSubito = vettBoss[i].getForza() - giocatore1.getDifesa();

                        vettBoss[i].setForza(attaccoPassatoBoss);

                        System.out.println("Hai Subito " + attSubito + " Danni ");
                        contatoreRoundBoss++;
                    }

                    else
                        System.out.println("Non ti passa danno");

                    if (giocatore1.getForza() > vettBoss[i].getDifesa()) {
                        attaccoPassato = giocatore1.getForza() - vettBoss[i].getDifesa();

                        giocatore1.setForza(attaccoPassato);

                        System.out.println("Gli hai Fatto " + attaccoPassato + " Danni ");

                        contatoreRoundGiocatore++;
                    }

                    else {
                        System.out.println("Non riesci a fare danno al nemico");
                    }

                    if (vettBoss[i].getForza() < giocatore1.getDifesa()
                            && giocatore1.getForza() < vettBoss[i].getDifesa()) {
                        System.out.println("Lo scontro è andato al pareggio, ma ci deve essere un vincitore.");

                        do {
                            for (round = 0; round < 2; round++) {
                                System.out.println("Round n." + round);

                                giocatore1.assegnaValore(casuale);
                                vettBoss[i].assegnaValore(casuale);

                                System.out.println("_______________________________");
                                System.out.println("STATISTICHE");
                                System.out.println("Giocatore:");
                                System.out.println("Attacco: " + giocatore1.getForza());
                                System.out.println("Difesa: " + giocatore1.getDifesa());
                                System.out.println("Avversario:");
                                System.out.println("Attacco: " + vettBoss[i].getForza());
                                System.out.println("Difesa: " + vettBoss[i].getDifesa());

                                if (giocatore1.getForza() > vettBoss[i].getDifesa()) {
                                    attaccoPassato = giocatore1.getForza() - vettBoss[i].getDifesa();
                                    System.out.println("Gli hai fatto " + attaccoPassato + " danni");
                                    contatoreRoundGiocatore++;
                                } else {
                                    System.out.println("Non riesci a fare danno al nemico");
                                }

                                if (vettBoss[i].getForza() > giocatore1.getDifesa()) {
                                    attSubito = vettBoss[i].getForza() - giocatore1.getDifesa();
                                    System.out.println("Hai subito " + attSubito + " danni");
                                    contatoreRoundBoss++;
                                } else {
                                    System.out.println("Non ti passa danno");
                                }
                            }
                        } while (vettBoss[i].getForza() < giocatore1.getDifesa()
                                && giocatore1.getForza() < vettBoss[i].getDifesa());
                    }

                }
                System.out.println("_______________________________");
                if (contatoreRoundGiocatore >= contatoreRoundBoss) {
                    System.out.println("Hai vinto lo scontro contro " + vettBoss[i].getNome() + "!");
                    // giocatore1.incrementaForza(5);
                    // giocatore1.incrementaDifesa(5);
                } else {
                    System.out.println("Hai perso lo scontro contro " + vettBoss[i].getNome());
                    System.out.println("Spera nella tua Vittoria la Prossima Volta,Forse");
                    break;
                }
            } // for combattimento

        } // if (croce)
    }// metod combattimento
}// classe Main

class MainBoss {
    private double forza;
    private double difesa;
    private String nome;

    public MainBoss(String nome, double forza, double difesa) {
        this.forza = forza;
        this.difesa = difesa;
        this.nome = nome;
    }

    public void incrementaForza(int incremento) {
        this.forza += incremento;
    }

    public void incrementaDifesa(int incremento) {
        this.difesa += incremento;
    }

    public double getForza() {
        return forza;
    }

    public double getDifesa() {
        return difesa;
    }

    public String getNome() {
        return nome;
    }

    public void setForza(double forza) {
        this.forza = forza;
    }

    public void setDifesa(double difesa) {
        this.difesa = difesa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void assegnaValore(Random casuale) {
        int addForza = casuale.nextInt(6) + 1;
        int addDifesa = casuale.nextInt(6) + 1;

        this.incrementaForza(addForza);
        this.incrementaDifesa(addDifesa);
    }

    public void resetStats() {
        this.forza = 0.0;
        this.difesa = 0.0;

    }

}