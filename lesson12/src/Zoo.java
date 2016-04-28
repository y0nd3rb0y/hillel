/**
 * Created by User on 28.04.2016.
 */
public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Parrot parrot = new Parrot();
        cat.voice();
        dog.voice();
        parrot.voice();
        //Animal animal = new Animal();
        //animal.voice();
        parrot.walk();
        cat.walk();
        dog.walk();
    }

    }
