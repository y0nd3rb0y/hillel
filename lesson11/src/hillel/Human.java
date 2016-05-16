package hillel;

import java.util.Scanner;

public class Human extends Player {
    public Human(String firstname, String lastname, int age, char mark) {
        super(firstname, lastname, age, mark);
    }

    @Override
    public String makeMove() {
        Scanner scanner = new Scanner(System.in);
        String move = scanner.next();
        return move;

    }
}
