
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class Statistics {
    private static Statistics instance = null;
    private List<RoundResult> results = new ArrayList<>();
    private List<Player> players = new ArrayList<>();
    public void addResult(RoundResult result){
        results.add(result);
    }
    public void addPlayer(Player player) { players.add(player); }
    Properties properties;
    Connection connection;
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

    public static Statistics getInstance() throws IOException, SQLException {
        if(instance==null){
            instance = new Statistics();
        }
        instance.properties = instance.loadProperties();
        instance.connection = DriverManager
                .getConnection(instance.properties.getProperty("url"),
                        instance.properties.getProperty("username"),
                        instance.properties.getProperty("password"));
        return instance;
    }
    private Properties loadProperties() throws IOException {
        Properties properties = new Properties();
        InputStream stream = getClass().getResourceAsStream("resources/db.properties");
        properties.load(stream);
        return properties;
    }


}
