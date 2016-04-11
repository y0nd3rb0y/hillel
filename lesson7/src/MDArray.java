/**
 * Created by User on 11.04.2016.
 */
public class MDArray {
    public static void main(String[] args) {
        int[][] array = new int[5][];
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[4];
        array[3] = new int[1];
        array[4] = new int[10];
        array[0][2] = 123;
        System.out.println(array.length);
        System.out.println(array[0].length);
    }
}
