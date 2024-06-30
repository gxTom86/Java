package mino;

/*
 *  Classe Block
    La classe Block rappresenta un singolo blocco quadrato, che è l'unità base di costruzione dei pezzi nel Tetris. 
    Ogni pezzo di Tetris, o "tetrimino", è composto da quattro di questi blocchi.

    Variabili e Proprietà:

    public int x, y: Le coordinate x e y del blocco, che indicano la sua posizione nel pannello di gioco.
    public static final int SIZE = 30: Una costante che definisce la dimensione di ciascun blocco, che in questo caso è un quadrato di 30x30 pixel.
    public Color c: Il colore del blocco, che consente di differenziare i vari tipi di tetrimini.
    Metodo draw(Graphics2D g2):

    Questo metodo usa un oggetto Graphics2D per disegnare il blocco.
    Imposta il colore del blocco e poi disegna un rettangolo pieno (fillRect) alle coordinate (x, y) con dimensione definita da SIZE.
*/

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Block extends Rectangle {
    // Qui si creano in vari blocchi del tetris
    // ognuno di loro sono composti da 4 blocchi

    public int x, y;
    public static final int SIZE = 30;// 30x30 block
    public Color c;

    public Block(Color c) {
        this.c = c;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(c);
        g2.fillRect(x, y, SIZE, SIZE);
    }
}
