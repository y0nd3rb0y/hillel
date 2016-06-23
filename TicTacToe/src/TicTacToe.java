import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class TicTacToe extends JFrame {

    private Statistics statistics;

    public TicTacToe() throws IOException, SQLException {

        super("Tic Tac Toe");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = screenSize.width;
        int y = screenSize.height;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize((int) Math.round(x * 0.4), (int) Math.round(y * 0.4));
        setSize(800, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        Player playerX = new Human("Ivan", "Ivanov", 20, "X");
        Player playerO = new AI.Builder("Petr", "O").lastname("Petrov").build();
        ButtonPanel buttonPanel = new ButtonPanel(playerX, playerO, statistics.getInstance());
        buttonPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
        StatisticsPanel statisticsPanel = new StatisticsPanel();
        statisticsPanel.setBorder(new EmptyBorder(40, 30, 30, 30));
        StatisticsControl statisticsControl = new StatisticsControl();
        statisticsControl.setButtonPanel(buttonPanel);
        statisticsControl.setStatisticsPanel(statisticsPanel);
        buttonPanel.setStatisticsControl(statisticsControl);
        LayoutManager layoutManager = new BorderLayout(50, 50);
        setLayout(layoutManager);
        add(buttonPanel, BorderLayout.WEST);
        add(statisticsPanel, BorderLayout.EAST);
    }


}


