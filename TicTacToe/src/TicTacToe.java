import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {

    private Statistics statistics;

    public TicTacToe(Statistics statistics){

        super("Tic Tac Toe");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = screenSize.width;
        int y = screenSize.height;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int) Math.round(x * 0.8), (int) Math.round(y * 0.8));
        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);
        this.statistics = statistics;
        this.play();
    }

    public void play() {
        while (true) {

            Player playerX = new Human("Ivan", "Ivanov", 20, 'X');
            Player playerO = new AI.Builder("Petr", 'O').lastname("Petrov").build();

            Round round = new Round(playerX, playerO);

            while (round.checkGameState()) {
                round.makeMove();
            }

            if(round.isRoundFinished()) break;
            statistics.addResult(new RoundResult(round.getWinner(), "wins"));
        }
        System.out.println(statistics);
    }





}
