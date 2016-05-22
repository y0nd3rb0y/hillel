
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Statistics {
    private static Statistics instance = null;
    private List<RoundResult> results = new ArrayList<>();
    public void addResult(RoundResult result){
        results.add(result);
    }
    private Statistics(){

    }

    public String toString(){

        String statistics = "Player\t\t\t\tResult\t\t\tDate\n";
        for(RoundResult result : results){
            statistics += result+"\n";
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
