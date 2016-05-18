package patterns.zoofactory;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kind = scanner.next();

        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.orderAnimal(kind);

        System.out.println(animal);

    }
}
