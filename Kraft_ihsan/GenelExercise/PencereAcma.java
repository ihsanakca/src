package GenelExercise;

import javax.swing.*;
import java.awt.*;

public class PencereAcma {
    public static void main(String[] args) {
        JFrame f = new JFrame("JFrame Çerçevesi");
        f.setSize(250, 250);
        f.setLocation(300, 200);
        f.getContentPane().add(BorderLayout.CENTER, new JTextArea(30, 70));
        f.setVisible(true);
    }
}
