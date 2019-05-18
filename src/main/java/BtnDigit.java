import javax.swing.*;
import java.awt.*;

public class BtnDigit  extends JButton {
    JButton btnDigit = new JButton(); {
        this.setBackground(Color.cyan);
        this.setSize(80, 80);
        this.setVerticalTextPosition(JLabel.CENTER);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setFont(new Font("Arial", Font.PLAIN, 24));
        this.setVisible(true);
    }
}
