import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {

    private Statistics statistics;

    public TicTacToe(){

        super("Tic Tac Toe");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = screenSize.width;
        int y = screenSize.height;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int) Math.round(x * 0.5), (int) Math.round(y * 0.5));
        setLocationRelativeTo(null);
        setVisible(true);
        Player playerX = new Human("Ivan", "Ivanov", 20, "X");
        Player playerO = new AI.Builder("Petr", "O").lastname("Petrov").build();
        ButtonPanel buttonPanel = new ButtonPanel(playerX, playerO, statistics.getInstance());
        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);
        add(buttonPanel, BorderLayout.CENTER);
    }


}


