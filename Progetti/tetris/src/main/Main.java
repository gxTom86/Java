package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Simple Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x chiudere la finestra
        window.setResizable(false);// x regolare la finestra

        // Aggiungo il GamePanel alla window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        // Sets the location of the window relative to the specified
        // component according to the following scenarios.
        window.setLocationRelativeTo(null);
        window.setVisible(true);// Shows or hides this Window

        gp.launchGame();
    }
}
