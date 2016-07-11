import java.io.Serializable;

public class Dog implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    transient int age;
    Owner owner;

    public Dog(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                ", owner age=" + owner.age +
                '}';
    }
}
