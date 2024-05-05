// Importazione delle librerie necessarie per l'interfaccia grafica e gli eventi
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Definizione della classe principale che estende JPanel per il disegno grafico,
// e implementa ActionListener per gestire eventi temporizzati
public class PallinaRimbalzante extends JPanel implements ActionListener {
    // Dimensioni della pallina
    private final int DIMENSIONE_PALLINA = 20;
    // Coordinate iniziali della pallina
    private int x = 0, y = 0;
    // Velocità iniziale della pallina, in pixel per aggiornamento
    private int dx = 2, dy = 0;
    
    // Costruttore della classe
    public PallinaRimbalzante() {
        // Crea un timer che chiama actionPerformed ogni 10 millisecondi
        Timer timer = new Timer(10, this);
        // Avvia il timer
        timer.start();
    }
    
    // Metodo per disegnare il componente (sovrascritto da JPanel)
    @Override
    public void paintComponent(Graphics g) {
        // Chiama il metodo paintComponent del genitore per pulire l'area
        super.paintComponent(g);
        // Imposta il colore del disegno a rosso
        g.setColor(Color.RED);
        // Disegna una pallina riempiendo un cerchio nelle coordinate (x, y)
        g.fillOval(x, y, DIMENSIONE_PALLINA, DIMENSIONE_PALLINA);
    }
    
    // Metodo chiamato ogni volta che il timer scatta
    @Override
    public void actionPerformed(ActionEvent e) {
        // Inverte la direzione orizzontale della pallina se tocca i bordi sinistro o destro
        if (x + dx < 0 || x + dx > getWidth() - DIMENSIONE_PALLINA)
            dx *= -1;
        // Inverte la direzione verticale della pallina se tocca i bordi superiore o inferiore
        if (y + dy < 0 || y + dy > getHeight() - DIMENSIONE_PALLINA)
            dy *= -1;
        
        // Aggiorna le coordinate della pallina in base alla sua velocità
        x += dx;
        y += dy;
        // Richiede il ridisegno del componente
        repaint();
    }
    
    // Metodo principale per eseguire il programma
    public static void main(String[] args) {
        // Crea una finestra utilizzando JFrame
        JFrame frame = new JFrame("Pallina Rimbalzante");
        // Crea un'istanza della classe PallinaRimbalzante
        PallinaRimbalzante pallina = new PallinaRimbalzante();
        // Aggiunge l'istanza al frame
        frame.add(pallina);
        // Imposta la dimensione della finestra
        frame.setSize(400, 400);
        // Configura l'operazione di chiusura della finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Rende visibile la finestra
        frame.setVisible(true);
    }
}
