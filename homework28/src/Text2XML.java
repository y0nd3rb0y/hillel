import java.io.*;
import java.util.ArrayList;

public class Text2XML {
    private String inputFilePath;
    private ArrayList<Student> students;

    public Text2XML(String inputFilePath) {
        this.inputFilePath = inputFilePath;
    }

    public void convert(String xmlFilePath) throws IOException {

        deserializeText(inputFilePath);
        printXML(xmlFilePath);
    }

    private void deserializeText(String inputFilePath) throws IOException {
        FileReader fileReader = new FileReader(inputFilePath);
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        Student student = new Student();
        while ((line = reader.readLine()) != null) {

            String[] arr = line.split(": ");

            for (String word : arr) {
                switch(arr[0]) {
                    case "Lastname":
                        student.setLastname(arr[1]);
                        break;
                    case "Firstname":
                        student.setFirstName(arr[1]);
                        break;
                    case "Age":
                        student.setAge(arr[1]);
                        break;
                    default:
                        students.add(student);
                        student = new Student();
                }
            }
        }
    }

    private void printXML(String xmlFilePath) throws IOException {
        FileWriter fileWriter = new FileWriter(xmlFilePath);
        BufferedWriter writer = new BufferedWriter(fileWriter);
    }

}
