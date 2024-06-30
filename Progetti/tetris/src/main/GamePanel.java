
package main;

import javax.swing.JPanel;
import java.awt.Dimension;// utilizzata per incapsulare la larghezza e l'altezza 
import java.awt.Graphics;
import java.awt.Graphics2D;
//di un componente in un singolo oggetto
import java.awt.Color;

public class GamePanel extends JPanel implements Runnable {

    // imposto la grandezza schermo
    public static final int WIDHT = 1280;
    public static final int HEIGHT = 720;
    final int FPS = 60;
    Thread gameThread;// serve a eseguire il game loop
                      // Consente di eseguire più parti del codice contemporaneamente
    PlayManager pm;

    public GamePanel()// costruttore
    {
        // impostazioni Panel
        this.setPreferredSize(new Dimension(WIDHT, HEIGHT));
        this.setBackground(Color.black);
        this.setLayout(null);
        
        // Key Listener
        this.addKeyListener(new KeyHandler());
        this.setFocusable(true);

        pm = new PlayManager();
    }

    public void launchGame() {
        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {
        // Imposta l'intervallo di disegno basato sul numero di frame per secondo (FPS)
        // desiderato.
        double drawInterval = 1000000000 / FPS; // 1 secondo = 1,000,000,000 nanosecondi
        double delta = 0; // Accumulatore per il tempo trascorso
        long lastTime = System.nanoTime(); // Tempo iniziale in nanosecondi
        long currentTime; // Variabile per memorizzare il tempo corrente in nanosecondi

        // Ciclo principale del gioco (game loop)
        while (gameThread != null) {
            // Registra il tempo corrente in nanosecondi
            currentTime = System.nanoTime();

            // Aggiorna l'accumulatore 'delta' con il rapporto tra il tempo trascorso
            // dall'ultimo ciclo e l'intervallo di disegno
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime; // Aggiorna 'lastTime' per il prossimo ciclo

            // Se 'delta' è maggiore o uguale a 1, significa che è il momento di aggiornare
            // e ridisegnare il gioco
            if (delta >= 1) {
                update(); // Aggiorna la logica del gioco
                repaint(); // Ridisegna il gioco
                delta--; // Riduci 'delta' di 1 per prepararti al prossimo aggiornamento
            }
        }
    }

    // aggionare i vari dati del gioco
    private void update() {

        pm.update();
    }

    /*
     * questo è il draw cioè che scrive su schermo il dato che è
     * cambiato come la posizione del giocatore ,
     * o come in questo contesto lo score, i punti fatti
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        pm.draw(g2);
    }

}
