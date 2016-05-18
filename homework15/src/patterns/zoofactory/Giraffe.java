package patterns.zoofactory;

public class Giraffe extends Animal {
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " eat leaves...";
    }
}
