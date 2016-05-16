package hillel;

import java.util.Random;

public class AI extends Player {
    public AI(String firstname, String lastname, int age, char mark) {
        super(firstname, lastname, age, mark);
    }

    @Override
    public String makeMove() {
        Random random = new Random();
        String move = String.valueOf(random.nextInt(3)+1)+String.valueOf(random.nextInt(3)+1);
        return move;
    }
}
