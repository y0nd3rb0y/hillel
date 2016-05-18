package tictactoe;

public class Game {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(new Statistics());
        ticTacToe.play();
    }
}
