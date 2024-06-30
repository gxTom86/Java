package Java_Git.Progetti.Prove_Grafiche.Java_Swing.src;

import javax.swing.JFrame;

public class PrimoFrame extends TutorialFrame 
{
    public PrimoFrame()
    {
        // Creazione del frame
        JFrame frame = new JFrame("Prima Finestra");

        // Impostazione dell'operazione di chiusura della finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Posizionamento Finestra Schermo
        // frame.setLocation(200, 200);

        // Per farla apparire al centro dello schermo
        frame.setLocationRelativeTo(null);

        // Per farsi che Non si puo midificare la Dimnesione della Finestra
        frame.setResizable(false);

        // Impostazione delle dimensioni della finestra
        frame.setSize(400, 300);

        // Rende la finestra visibile
        frame.setVisible(true);
    }

}