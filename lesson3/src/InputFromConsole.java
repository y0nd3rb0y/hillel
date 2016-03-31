import java.util.Scanner;

/**
 * Created by User on 28.03.2016.
 */
public class InputFromConsole {

    public static void main(String[] args) {

        int a = 0, b = 0;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        System.out.println("Sum of a + b = "+(a + b));

    }


}
