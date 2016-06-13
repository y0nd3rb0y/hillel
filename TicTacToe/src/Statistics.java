
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Statistics {
    private static Statistics instance = null;
    private List<RoundResult> results = new ArrayList<>();
    private List<Player> players = new ArrayList<>();
    public void addResult(RoundResult result){
        results.add(result);
    }
    public void addPlayer(Player player) { players.add(player); }
    private Statistics(){

    }

    public String toString(){

        String statistics = "Player\tResult\t\n";
        /*for(RoundResult result : results){
            statistics += result+"\n";
        }*/
        Collections.sort(players, new PlayerComparator());
        for(Player player: players){
            statistics += player.toString() +"\t"+ player.getWins()+"\n";
        }
        return statistics;
    }

    public static Statistics getInstance(){
        if(instance==null){
            instance = new Statistics();
        }
        return instance;
    }


}
