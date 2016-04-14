/**
 * Created by Macintosh on 4/12/16.
 */
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 10;
        for (int row = 0; row < n; row++) {
            int number = 1;
            for (int z = n - row; z > 0; z--) {
                System.out.print(" ");
            }

            for (int col = 0; col < row; col++) {
                if (col != 0) number = number * (row - col) / col;
                System.out.printf("%3d",number);
            }
            System.out.println("");
        }
    }
}
