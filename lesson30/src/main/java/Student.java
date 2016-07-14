public class Student {
    int age;
    private String lastname;
    private String firstname;

    public Student(String lastname, String firstname, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (!lastname.equals(student.lastname)) return false;
        return firstname.equals(student.firstname);

    }

    @Override
    public int hashCode() {
        return 1;
    }
}
