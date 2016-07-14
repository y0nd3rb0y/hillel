import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {


    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", 14);
        Student student2 = new Student("Jane", "Doe", 16);
        Student student3 = new Student("Jack", "Sparrow", 35);

        Grade grade5 = new Grade(5, "A", "excellent");
        Grade grade4 = new Grade(4, "B", "good");
        Grade grade3 = new Grade(3, "C", "acceptable");
        Map<Student, Grade> map = new HashMap<Student, Grade>();

        map.put(student1, grade5);
        map.put(student2, grade3);
        map.put(student3, grade4);

    }
}
