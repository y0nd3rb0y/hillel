package patterns.zoofactory;

public class Lion extends Animal{
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "roars...";
    }

}
