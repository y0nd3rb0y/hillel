package hillel;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    private List<GameResult> results = new ArrayList<>();
    public void addResult(GameResult result){
        results.add(result);
    }
    public void printStatistics(){
        System.out.println("Player\tResult\tDate");
        for(GameResult result : results){
            System.out.println(result.getPlayer()+"\t"+result.getResult()+"\t"+result.getDate());
        }
    }
}
