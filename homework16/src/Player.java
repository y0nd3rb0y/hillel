
public abstract class Player {
    String lastname;
    String firstname;
    char mark;

    public char getMark() {
        return mark;
    }
    public void setMark(char mark) {
        this.mark = mark;
    }

    /*public Player(String firstname, String lastname, int age, char mark) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.mark = mark;
    }*/



    public abstract String makeMove();

    public String toString(){
        return firstname+" "+lastname;
    }

    public boolean equals(Object object){
        if (object == null) return false;
        if (object.getClass() != Player.class) return false;
        Player player = (Player) object;
        if ((this.lastname == null) || (this.firstname == null)) return false;
        if (this.lastname == player.lastname
                && this.firstname == player.firstname
                && this.mark == player.mark) return true;
        return false;
    }


}
