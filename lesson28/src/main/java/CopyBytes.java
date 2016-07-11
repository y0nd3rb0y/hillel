import java.io.*;

public class CopyBytes {

    public static void main(String[] args) {
        File file = new File("e:\\inout\\in1.txt");
        File outputFile = new File("e:\\inout\\out1.txt");

        byte[] result = readFromFile(file);

        writeToFile(result, outputFile);

    }

    private static byte[] readFromFile(File file) {
        byte[] arr = null;

        try (FileInputStream inputStream = new FileInputStream(file)) {

            arr = new byte[(int)file.length()];
            int value;
            int index = 0;

            while ((value = inputStream.read()) != -1) {
                System.out.println(value);
                arr[index++] = (byte) value;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arr;
    }

    private static void writeToFile(byte[] array, File file) {
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            for (byte b : array) {
                outputStream.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
