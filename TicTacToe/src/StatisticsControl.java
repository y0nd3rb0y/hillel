import javax.swing.*;

public class StatisticsControl {
    private StatisticsPanel statisticsPanel;

    private ButtonPanel buttonPanel;

    public void setButtonPanel(ButtonPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    public void setStatisticsPanel(StatisticsPanel statisticsPanel) {
        this.statisticsPanel = statisticsPanel;
    }

    public void showStatistics(){
        statisticsPanel.setStatisticsField(buttonPanel.getStatistics());
    }
}
