
import java.util.Scanner;

public class Human extends Player {

    @Override
    public String makeMove() {
        Scanner scanner = new Scanner(System.in);
        String move = scanner.next();
        return move;

    }

    public Human(String firstname, char mark){
        this(firstname, "", mark);
    }

    public Human(String firstname, String lastname, char mark){
        this(firstname, lastname, 20, mark);
    }

    public Human(String firstname, String lastname, int age, char mark) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.mark = mark;
    }
}
