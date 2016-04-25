package hillel;

import java.util.Arrays;

/**
 * Created by User on 25.04.2016.
 */
public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        char currentPlayer = 'X';
        Arrays.fill(board, ' ');

        while(!gameFinished(board)){
            System.out.println("Player "+currentPlayer+" moves...");
            System.out.println("Enter your move: ");
            String move = "12";
            makeMove(move, board);

        }
        char winner = calculateWinner(board);
    }

    private static char calculateWinner(char[][] board) {
        return 'X';
    }

    private static void makeMove(String move, char[][] board) {

    }


    public static boolean gameFinished(char[][] board){
        return false;
    }
}
