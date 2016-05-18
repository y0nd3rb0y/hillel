package patterns.zoofactory;

public class AnimalFactory {
    public Animal orderAnimal(String kind){
        Animal animal;
        switch(kind){
            case "giraffe":
                animal = new Giraffe();
                break;
            case "elephant":
                animal = new Elephant();
                break;
            case "lion":
                animal = new Lion();
                break;
            default:
                animal = null;
        }
        return animal;
    }
}
