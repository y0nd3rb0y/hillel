package hillel;

/**
 * Created by User on 07.04.2016.
 */
public class PowerOfNumber {
    public static void main(String[] args) {
        int number = 5;
        int out = number;

        int power = 5;
        int current = 1;

        while (current < power) {
            //if(power%2==0) {
                out *= out;
                current*=2;
            /*} else {
                out *= number;
                current++;
            }*/
        }
        System.out.println("Powered number is: " + out);
    }
}
