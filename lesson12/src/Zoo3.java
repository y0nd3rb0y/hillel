/**
 * Created by User on 28.04.2016.
 */
public class Zoo3 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.voice();

        Animal animal1 = new Dog();
        animal1.voice();
        System.out.println(animal.getClass().getName());
        if(animal instanceof Animal) {
            System.out.println("Is animal");
        }


        //Dog dog = (Dog) new Animal();

    }
}
