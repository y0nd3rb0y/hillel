import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private char currentPlayer;
    private Board board;
    private Scanner scanner = new Scanner(System.in);

    public TicTacToe(){
        board = new Board();
        board.printBoard();
    }

    public void printBoard(){
        this.board.printBoard();
    }

    public boolean checkGameState() {
        if(board.checkBoardForMatch()){
            System.out.println("Winner is: "+board.getWinner());
            return false;
        } else if(board.isBoardFull()){
            System.out.println("Draw game. No one looses.");
            return false;
        }
        return true;
    }

    public boolean makeMove() {

        System.out.println("Player "+currentPlayer+" moves...");
        System.out.println("Enter your move(row: 1|2|3 column: 1|2|3):");
        String move = scanner.next();
        int x = Character.getNumericValue(move.charAt(0))-1;
        int y = Character.getNumericValue(move.charAt(1))-1;
        if (!isMoveValid(x, y)) return false;
        board.doMove(x, y, currentPlayer);
        changeCurrentPlayer();
        board.printBoard();
        return true;

    }

    private void changeCurrentPlayer(){
        if(currentPlayer=='X'){
            currentPlayer='O';
        } else {
            currentPlayer='X';
        }
    }
    private boolean isMoveValid(int x, int y) {
        if (x > 2 || y > 2 || x < 0 || y < 0 || !board.isCellEmpty(x, y)) {
            return false;
        }
        return true;
    }



    public class Board {
        char[][] board = new char[3][3];
        private char winner;

        public Board() {
            for (int i = 0; i < board.length; i++) {
                Arrays.fill(board[i], ' ');
            }
            currentPlayer = 'X';
        }

        public boolean isCellEmpty(int x, int y){
            if(board[x][y]==' '){
                return true;
            }
            System.out.println("Selected cell is busy.");
            return false;
        }

        public boolean checkBoardForMatch(){
            for(int i =0; i<3; i++){
                if(checkCellMatch(board[0][i],board[1][i],board[2][i])
                        || checkCellMatch(board[i][0], board[i][1], board[i][2])
                        || checkCellMatch(board[0][0], board[1][1], board[2][2])
                        || checkCellMatch(board[2][0], board[1][1], board[0][2])){
                    return true;
                }
            }
            return false;
        }

        private boolean checkCellMatch(char c1, char c2, char c3){
            if(c1 == c2 && c2 == c3 && c3 != ' '){
                this.setWinner(c1);
                return true;
            }
            return false;
        }

        private void setWinner(char c){
            this.winner = c;
        }

        private char getWinner(){
            return this.winner;
        }

        public boolean isBoardFull(){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }

        private void doMove(int x, int y, char c){
            this.board[x][y]=c;
        }

        public void printBoard() {
            //System.out.print("\033[H\033[2J");
            //System.out.flush();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(" " + board[i][j]);
                    if (j != board.length - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (i != board.length - 1) {
                    System.out.println("--------");
                }
            }
        }




    }
}
