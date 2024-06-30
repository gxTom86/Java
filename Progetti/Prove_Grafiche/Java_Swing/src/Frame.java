// Rimuovere la dichiarazione del pacchetto se non necessaria
// package Java_Git.Progetti.Prove_Grafiche.Java_Swing.src;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
    private JTextArea textArea;
    private JButton button;

    public Frame() {
        super("Titolo Finestra");

        setLayout(new BorderLayout());

        textArea = new JTextArea();  // Correzione: Usa JTextArea invece di JFrameArea
        button = new JButton("Eccomi");

        add(textArea, BorderLayout.CENTER);
        add(button, BorderLayout.PAGE_START);

        setSize(500, 500);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Frame();
    }
}
