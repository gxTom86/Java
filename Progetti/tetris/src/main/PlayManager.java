package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import mino.Block;
import mino.Mino;
import mino.Mino_L1;

public class PlayManager {

    // Main Play Area

    final int WIDHT = 360;
    final int HEIGHT = 600;
    // accessibili quindi da altre classi senza,
    // bisogno di un'istanza di PlayManager.
    public static int left_x; // Indica la coordinata x del lato sinistro dell'area di gioco
    public static int right_x; // Indica la coordinata x del lato destro dell'area di gioco. È calcolata come
                               // left_x + WIDHT, dove WIDHT
    public static int top_y; // Indica la coordinata y del bordo superiore dell'area di gioco.
    public static int bottom_y; // Indica la coordinata y del bordo inferiore dell'area di gioco

    // Mino
    Mino currentMino;
    final int MINO_START_X;
    final int MINO_START_Y;

    // Drop Mino
    public static int dropInterval = 60;// Mino drops in every 60 frames

    // costruttore; PlayManager(): È il costruttore della classe e viene utilizzato
    // per inizializzare i confini dell'area di gioco.
    public PlayManager() {
        // main Play Area Frame
        left_x = (GamePanel.WIDHT / 2) - (WIDHT / 2); // 1280/2 - 360/2 = 460
        right_x = left_x + WIDHT;
        top_y = 50;
        bottom_y = top_y + HEIGHT;

        MINO_START_X = left_x + (WIDHT / 2) - Block.SIZE;
        MINO_START_Y = top_y + Block.SIZE;

        // set the starting mino
        currentMino = new Mino_L1();
        currentMino.setXY(MINO_START_X, MINO_START_Y);
    }

    // chiama questi due metodi dal GamePanel
    public void update() {

        currentMino.update();
    }

    public void draw(Graphics2D g2) {
        // Draw PlayArea Frame
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(4f));
        g2.drawRect(left_x - 4, top_y - 4, WIDHT + 8, HEIGHT + 8);

        // Draw Next Mino Frame
        int x = right_x + 100;
        int y = bottom_y - 200;
        g2.drawRect(x, y, 200, 200);
        // Draw the text on the Mino Frame
        g2.setFont(new Font("Arial", Font.PLAIN, 30));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.drawString("Next", x + 70, y + 40);
        // Draw the current Mino
        if (currentMino != null) {
            currentMino.draw(g2);
        }

    }

}
