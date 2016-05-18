package tictactoe;
public abstract class Player {
    String lastname;
    String firstname;
    int age;
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


}
