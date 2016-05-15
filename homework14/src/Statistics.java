import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Statistics {
    private List<RoundResult> results = new ArrayList<>();
    public void addResult(RoundResult result){
        results.add(result);
    }

    public void printStatistics(){

        System.out.println("Player\tResult\tDate");
        for(RoundResult result : results){
            System.out.println(result.getPlayer()+"\t"+result.getRoundResult()+"\t"+result.getDate());
        }
    }


}
