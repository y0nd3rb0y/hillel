import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Statistics {
    private List<RoundResult> results = new ArrayList<>();
    public void addResult(RoundResult result){
        results.add(result);
    }

    public String toString(){

        String statistics = "Player\t\t\tResult\t\t\tDate\n";
        for(RoundResult result : results){
            statistics += result+"\n";
        }
        return statistics;
    }


}
