import java.io.Serializable;

public class Student implements Serializable{
    private String firstName;
    private String lastname;
    private String age;

    public Student(){

    }

    public Student(String firstName, String lastname, String age) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
