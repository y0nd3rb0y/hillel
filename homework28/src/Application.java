import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        String file = "students.txt";
        Text2XML t2x = new Text2XML(file);
        t2x.convert("students.xml");
    }
}
