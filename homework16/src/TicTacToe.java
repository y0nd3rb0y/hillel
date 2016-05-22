
public class TicTacToe {

    private Statistics statistics;

    public TicTacToe(Statistics statistics){
        this.statistics = statistics;
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
