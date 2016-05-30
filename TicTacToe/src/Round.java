

import java.util.Arrays;
import java.util.Scanner;

public class Round {
    private boolean isRoundFinished = false;
    private Player currentPlayer;
    Player playerX;
    Player playerO;

    public Round(Player playerX, Player playerO) {
        this.playerX = playerX;
        this.playerO = playerO;
        currentPlayer = playerX;
        board = new Board();
        board.printBoard();
        System.out.println("Round started.");
    }

    public boolean isRoundFinished() {
        return isRoundFinished;
    }

    public boolean checkGameState() {
        if (board.checkBoardForMatch()) {
            System.out.println("Winner is: " + this.getWinner());
            return false;
        } else if (board.isBoardFull()) {
            System.out.println("Draw game. No one looses.");
            return false;
        }
        if (this.isRoundFinished) {
            System.out.println("Game finished. Here are the results:");
            return false;
        }
        return true;
    }

    private void changeCurrentPlayer() {
        if (currentPlayer.getMark().equals("X")) {
            currentPlayer = playerO;
        } else {
            currentPlayer = playerX;
        }
    }

}
