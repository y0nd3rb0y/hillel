import javax.swing.*;
import java.awt.*;

public class StatisticsPanel extends JPanel{
    JTextArea statisticsField = new JTextArea();;
    public StatisticsPanel(){
        Dimension dimension = new Dimension();
        dimension.width = 300;
        dimension.height = 300;
        statisticsField.setPreferredSize(dimension);
        add(statisticsField);
    }
    public void setStatisticsField(String s) {
        statisticsField.setText(s);
    }

}

