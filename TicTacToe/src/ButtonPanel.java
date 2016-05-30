import javax.swing.*;
import java.awt.*;


public class ButtonPanel extends JPanel {
    private Player winner;
    JButton [][] button= new JButton[3][3];
    GridBagConstraints gc = new GridBagConstraints();
    ButtonListener listener = new ButtonListener(button);


    public ButtonPanel() {
        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);
        //setVisible(true);
        Dimension dimension = new Dimension();
        dimension.height = 100;
        dimension.width = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                button[i][j] = new JButton();
                button[i][j].setPreferredSize(dimension);
                button[i][j].putClientProperty("OWNER", null);
                gc.gridx = i;
                gc.gridy = j;
                add(button[i][j], gc);
                button[i][j].addActionListener(listener);
                add(button[i][j]);
            }
        }
    }

}






}