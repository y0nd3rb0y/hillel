import java.io.*;

public class CopyLines {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("e:\\inout\\in3.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("e:\\inout\\out3.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String line;
        while ((line = reader.readLine()) != null) {
            String[] arr = line.split(" ");

            for (String word : arr) {
                writer.write(word);
                writer.newLine();
            }
        }

        reader.close();
        writer.close();
    }
}
