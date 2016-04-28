/**
 * Created by User on 28.04.2016.
 */
public class Cat extends Animal {


    @Override
    public void voice(){
        System.out.println("meow");
    }

    Cat(){
        name = "Tom";
        age = 5;
        weight = 5;
    }

    public boolean canFly(){
        return false;
    }
}
