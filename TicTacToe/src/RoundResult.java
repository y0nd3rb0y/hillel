
import java.util.Date;

public class RoundResult {

    private Player player;
    private Result result;
    private Date date;

    public Player getPlayer() {
        return player;
    }

    public Result getRoundResult() {
        return result;
    }

    public Date getDate() {
        return date;
    }

    public RoundResult(Player player, Result result) {
        this.player = player;
        this.result = result;
        this.date = new Date();
        player.setWins(player.getWins()+1);
    }

    public String toString(){
        return player.toString()+"\t"+result+"\t"+date;
    }

    public boolean equals(Object object){
        if (result == null) return false;
        if (this.getClass() != RoundResult.class) return false;
        if ((this.player == null) || (this.result == null)) return false;
        RoundResult result = (RoundResult) object;

        if(this.player == result.player && this.result == result.result && this.date == result.date) return true;
        return false;
    }

}
