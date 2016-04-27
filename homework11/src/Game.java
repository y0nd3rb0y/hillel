

public class Game {
    public static void main(String[] args) {

        System.out.println("Game started.");
        TicTacToe ticTacToe = new TicTacToe();

        while(ticTacToe.checkGameState()){
            ticTacToe.makeMove();
        }
        System.out.println("Game finished.");
    }
}
