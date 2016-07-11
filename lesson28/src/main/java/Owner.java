import java.io.Serializable;

public class Owner implements Serializable{

    private static final long serialVersionUID = 1L;

    String name;
    String lastname;
    int age;

    public Owner(String name, int age, String lastname) {
        this.name = name;
        this.age = age;
        this.lastname = lastname;
    }

    public String toString(){
        return this.name+", "+this.age;
    };

}
