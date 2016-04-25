package hillel;

import java.util.Scanner;

/**
 * Created by User on 25.04.2016.
 */
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game started.");
        Board board = new Board();
        board.printBoard();
        while(!board.gameFinished()){
            System.out.println("Player "+board.currentPlayer+" moves...");
            System.out.println("Enter your move:");
            String move = scanner.next();
            if(!board.makeMove(move)){
                System.out.println("Incorrect input. Repeate your move.");
            }
            board.printBoard();

        }
        System.out.println("The winner is "+board.calculateWinner());
    }
}
