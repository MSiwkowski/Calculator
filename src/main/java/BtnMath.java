import javax.swing.*;
import java.awt.*;

public class BtnMath extends JButton {
    JButton btnMath = new JButton();

    {
        this.setBackground(Color.blue);
        this.setSize(90, 70);
        this.setVerticalTextPosition(JLabel.CENTER);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setFont(new Font("Arial", Font.PLAIN, 36));
        setVisible(true);
    }
}