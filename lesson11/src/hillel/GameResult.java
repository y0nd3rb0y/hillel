package hillel;

import java.util.Date;

public class GameResult {
    public Player getPlayer() {
        return player;
    }

    public String getResult() {
        return result;
    }

    public Date getDate() {
        return date;
    }

    private Player player;
    private String result;
    private Date date;


    public GameResult(Player player, String result){
        this.player = player;
        this.result = result;
        this.date = new Date();
    }

    public String toString;

}
