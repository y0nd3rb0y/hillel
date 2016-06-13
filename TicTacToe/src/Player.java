import javax.swing.*;

public abstract class Player implements Comparable {
    String lastname;
    String firstname;
    String mark;


    int wins;

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }



    public abstract void makeMove(JButton[][] buttons);

    public String toString(){
        return firstname+" "+lastname;
    }

    public boolean equals(Object object){
        if (object == null) return false;
        if (object.getClass() != Player.class) return false;
        Player player = (Player) object;
        if ((this.lastname == null) || (this.firstname == null)) return false;
        if (this.lastname.equals( player.lastname)
                && this.firstname.equals(player.firstname)
                && this.mark.equals(player.mark)) return true;
        return false;
    }

    @Override
    public int compareTo(Object o){
        Player player = (Player)o;
        if(this.getWins()>player.getWins()){
            return -1;
        }
        if(this.getWins()<player.getWins()){
            return 1;
        }
        return 0;
    }


}
