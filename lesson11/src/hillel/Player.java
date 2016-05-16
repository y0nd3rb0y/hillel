package hillel;

public abstract class Player {
    String lastname;
    String firstname;
    int age;


    public char getMark() {
        return mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }

    char mark;

    public Player(String firstname, String lastname, int age, char mark){
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.mark = mark;
    }

    public String toString(){
        return firstname+" "+lastname;
    }

    public abstract String makeMove();
}
