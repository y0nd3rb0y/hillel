/**
 * Created by User on 28.04.2016.
 */
public class Parrot extends Animal {

    Parrot(){
        name = "Blue";
        age = 6;
        weight = 1;
    }

    @Override
    public void voice(){
        System.out.println("tweet");
    }

    public boolean canFly(){
        return true;
    }
}
