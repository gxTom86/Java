import javax.swing.JFrame;
import java.awt.Color;

class Java_awt_1 {

    public static void main(String args[]) {

        new Il_Mio_Frame();
    }
}

class Il_Mio_Frame {

    Il_Mio_Frame() {
        JFrame frame = new JFrame("Prima Finestra");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.getContentPane().setBackground(Color.BLACK);

        frame.setVisible(true);
    }

}