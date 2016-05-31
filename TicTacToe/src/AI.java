
import javax.swing.*;
import java.util.Random;

public class AI extends Player {

    @Override
    public void makeMove(JButton[][] buttons) {
        Random random = new Random();
        while(true) {
            JButton button = buttons[random.nextInt(3)][random.nextInt(3)];
            if(button.getText().equals("")){
                button.setText(mark);
                break;
            }
        }
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
