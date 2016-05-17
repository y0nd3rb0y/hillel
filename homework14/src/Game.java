import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        while (true) {

            Player playerX = new Player("Ivan", "Ivanov", 20, 'X');
            Player playerO = new Player("Peter", "Petrov", 35, 'O');

            TicTacToe ticTacToe = new TicTacToe(playerX, playerO);

            while (ticTacToe.checkGameState()) {
                ticTacToe.makeMove();
            }

            if(ticTacToe.isGameFinished()) break;
            statistics.addResult(new RoundResult(ticTacToe.getWinner(), "wins"));
        }
        System.out.println(statistics);
    }
}
