
/*
 *  Classe Mino
    La classe Mino rappresenta un tetrimino intero, ovvero uno dei pezzi classici del Tetris che sono formati da quattro blocchi.

    Variabili e Proprietà:

    public Block b[] = new Block[4]: Un array di quattro oggetti Block, che costituiscono il tetrimino.
    public Block tempB[] = new Block[4]: Un array temporaneo di blocchi, possibilmente utilizzato per operazioni come la rotazione del pezzo senza alterare immediatamente l'array principale b.
    Metodo create(Color c):

    Questo metodo inizializza sia l'array b che tempB con nuovi blocchi di colore specificato. Serve a definire e resettare i pezzi con un colore uniforme.
    Metodi di Gestione del Movimento:

    public void setXY(int x, int y): Un metodo vuoto, che presumibilmente dovrebbe impostare le coordinate iniziali del tetrimino.
    public void updateXY(int direction): Un altro metodo vuoto, che dovrebbe aggiornare la posizione del tetrimino in base alla direzione fornita (probabilmente sinistra, destra, giù).
    public void update(): Metodo vuoto, che potrebbe essere destinato a gestire aggiornamenti generali dello stato del tetrimino, come la verifica di collisioni o il posizionamento finale.
    Metodo draw(Graphics2D g2):

    Un metodo vuoto che dovrebbe contenere la logica per disegnare il tetrimino sul pannello di gioco, probabilmente iterando attraverso l'array b e chiamando il metodo draw di ogni Block.
*/
package mino;

import java.awt.Color;
import java.awt.Graphics2D;

import main.KeyHandler;
import main.PlayManager;

public class Mino {

    public Block b[] = new Block[4];
    public Block tempB[] = new Block[4];
    int autoDropCounter = 0;

    public void create(Color c) {
        b[0] = new Block(c);
        b[1] = new Block(c);
        b[2] = new Block(c);
        b[3] = new Block(c);

        tempB[0] = new Block(c);
        tempB[1] = new Block(c);
        tempB[2] = new Block(c);
        tempB[3] = new Block(c);
    }

    public void setXY(int x, int y) {
    }

    public void updateXY(int direction) {
    }

    public void update() {

        // Move the Mino
        if (KeyHandler.upPressed) {
        }
        if (KeyHandler.downPressed) {
            b[0].y += Block.SIZE;
            b[1].y += Block.SIZE;
            b[2].y += Block.SIZE;
            b[3].y += Block.SIZE;

            // When moved Down Reset the AutoDrop
            autoDropCounter = 0;

            KeyHandler.downPressed = false;

        }
        if (KeyHandler.leftPressed) {
            b[0].x -= Block.SIZE;
            b[1].x -= Block.SIZE;
            b[2].x -= Block.SIZE;
            b[3].x -= Block.SIZE;

            KeyHandler.leftPressed = false;
        }
        if (KeyHandler.rightPressed) {
            b[0].x += Block.SIZE;
            b[1].x += Block.SIZE;
            b[2].x += Block.SIZE;
            b[3].x += Block.SIZE;

            KeyHandler.rightPressed = false;
        }

        autoDropCounter++; // Il contatore aumenta ad ogni frame
        if (autoDropCounter == PlayManager.dropInterval) {

            // Il mino Va giù
            b[0].y += Block.SIZE;
            b[1].y += Block.SIZE;
            b[2].y += Block.SIZE;
            b[3].y += Block.SIZE;

            autoDropCounter = 0;

        }
    }

    public void draw(Graphics2D g2) {
        g2.setColor(b[0].c); // Imposta il colore per il disegno
        // How to separate Each Bock
        int margin = 2;
        // Disegna il primo blocco
        g2.fillRect(b[0].x + margin, b[0].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
        // Disegna il secondo blocco
        g2.fillRect(b[1].x + margin, b[1].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
        // Disegna il terzo blocco
        g2.fillRect(b[2].x + margin, b[2].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
        // Disegna il quarto blocco
        g2.fillRect(b[3].x + margin, b[3].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
    }
}
