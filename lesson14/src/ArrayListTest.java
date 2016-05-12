import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListTest {
    public static void main(String[] args) {
/*        Animal animal = new Parrot("prt");
        animal.voice();
        Animal[] animals = new Parrot[5];
        animals[0] = new Parrot("parrrot");*/
        //animals[1] = new Cat();



        /*List<Parrot> parrotList = new ArrayList<>();
        parrotList.add(new Parrot("First"));
        parrotList.add(new Parrot("Second"));
        for (Parrot parrot : parrotList) {
            System.out.println(parrot);
        }
*/


        /*List animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        //animals.add(new Random());
        Animal animal = (Animal) animals.get(0);
        animal.voice();
        //Animal animal1 = (Animal) animals.get(2);
        animal.voice();
        */

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Parrot("prt"));
        for(Animal animal : animals){
            System.out.println(animal); //calling std toString on objects w/o toString override
        }



    }
}
