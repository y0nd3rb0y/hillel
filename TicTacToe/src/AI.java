
import java.util.Random;

public class AI extends Player {

    @Override
    public String makeMove() {
        Random random = new Random();
        String move = String.valueOf(random.nextInt(3)+1)+String.valueOf(random.nextInt(3)+1);
        return move;
    }

    public static class Builder{
        private String lastname;
        private String firstname;
        private int age;
        private String mark;

        public Builder(String firstname, String mark){
            this.firstname = firstname;
            this.mark = mark;
        }

        public Builder lastname(String lastname){
            this.lastname = lastname;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public AI build(){
            return new AI(this);
        }

    }
    private AI(Builder builder){
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.mark = builder.mark;
    }
}
