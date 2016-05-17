import java.util.Date;

public class RoundResult {

    private Player player;
    private String result;
    private Date date;

    public Player getPlayer() {
        return player;
    }

    public String getRoundResult() {
        return result;
    }

    public Date getDate() {
        return date;
    }

    public RoundResult(Player player, String result) {
        this.player = player;
        this.result = result;
        this.date = new Date();
    }

    public String toString(){
        return player.toString()+"\t\t\t"+result+"\t\t\t"+date;
    }

}
