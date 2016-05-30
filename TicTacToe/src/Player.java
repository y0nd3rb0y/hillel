
public abstract class Player {
    String lastname;
    String firstname;
    String mark;

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }



    public abstract String makeMove();

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


}
