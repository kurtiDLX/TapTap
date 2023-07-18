import javax.swing.*;
import java.awt.*;

public class WindowComponents extends JFrame {
    private ImageIcon tomato;
    private int numAdd = 0;
    private JButton click;
    private JLabel clickText, clickResult;
    private Font font;
    public WindowComponents(){
        super("TapTap");
        setLayout(null);

        font = new Font("Arial", Font.BOLD, 16);

        clickText = new JLabel("click on the tomato");
        clickText.setBounds(64,10,200,40);
        clickText.setFont(font);

        tomato = new ImageIcon("src/tomato.png");

        click = new JButton();
        click.setBounds(85, 60, 100, 100);
        click.setBorder(BorderFactory.createEmptyBorder());
        click.setIcon(tomato);
        click.addActionListener(e -> {
            try {
                numAdd += 1;
                clickResult.setText("click: " + numAdd);

                if (numAdd >= 10) {
                    click.setIcon(new ImageIcon("src/tomatoTwo.png"));
                }

                 if (numAdd >= 50){
                     click.setIcon(new ImageIcon("src/tomatoFinal.png"));
                 }
            }catch (Exception ex){}
                });

        clickResult = new JLabel("click: " + numAdd);
        clickResult.setBounds(102, 160, 200, 40);
        clickResult.setFont(font);

        add(clickResult);
        add(click);
        add(clickText);
    }
}
