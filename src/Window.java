import javax.swing.*;
import java.awt.*;

public class Window {
    public static void main(String[] args) {
        WindowComponents window = new WindowComponents();
        window.setSize(290,250);
        window.getContentPane().setBackground(Color.PINK);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
