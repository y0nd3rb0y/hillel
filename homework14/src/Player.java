public class Player {
    private String lastname;
    private String firstname;
    private int age;
    private char mark;

    public char getMark() {
        return mark;
    }

    public Player(String firstname, String lastname, int age, char mark){
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.mark = mark;
    }

    public String toString(){
        return firstname+" "+lastname;
    }
}
