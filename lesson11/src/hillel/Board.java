package hillel;

import java.io.IOException;
import java.util.Arrays;

public class Board {
    char[][] board = new char[3][3];
    char currentPlayer;

    public Board() {
        for (int i = 0; i < board.length; i++) {
                Arrays.fill(board[i], ' ');
        }
        currentPlayer = 'X';
    }

    public void printBoard() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
    }

    public boolean gameFinished() {
        if(board[0][0]=='X' && board[0][1]=='X' && board[0][2]=='X'){
            return true;
        }
        return false;
    }

    public boolean makeMove(String move) {
        int x = Character.getNumericValue(move.charAt(0));
        int y = Character.getNumericValue(move.charAt(1));
        if (!isMoveValid(x, y)) return false;
        board[x][y] = currentPlayer;
        changeCurrentPlayer();
        return true;

    }

    public char calculateWinner(){
        return 'X';
    }

    private void changeCurrentPlayer(){
        if(currentPlayer=='X'){
            currentPlayer='O';
        } else {
            currentPlayer='X';
        }
    }
    private boolean isMoveValid(int x, int y) {
        if (x > 2 || y > 2 || x < 0 || y < 0) {
            return false;
        }
        return true;
    }
}
