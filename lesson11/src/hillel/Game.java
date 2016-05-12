package hillel;

import java.util.Scanner;

/**
 * Created by User on 25.04.2016.
 */
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Statistics statistics = new Statistics();
        while(!input.equals("exit")) {
            System.out.println("Game started.");
            Player playerX = new Player("Ivan", "Ivanov", 20, 'X');
            Player playerO = new Player("Peter", "Petrov", 35, 'O');

            Board board = new Board(playerX, playerO);


            board.printBoard();
            while (!board.gameFinished()) {
                System.out.println("Player " + board.currentPlayer + " moves...");
                System.out.println("Enter your move:");
                String move = scanner.next();
                if (!board.makeMove(move)) {
                    System.out.println("Incorrect input. Repeate your move.");
                }
                board.printBoard();

            }
            System.out.println("The winner is " + board.calculateWinner());
            GameResult result = new GameResult(board.currentPlayer, "wins");
            statistics.addResult(result);

        }
        statistics.printStatistics();
    }
}
