public class PowerOfNumber {
    public static void main(String[] args) {
        int number = 5;
        int out = number;

        int power = 3;
        int current = 1;

        while (current < power) {
            //if(power%2==0) {
            out *= out;
            current=current<<2;
            /*} else {
                out *= number;
                current++;
            }*/
        }
        System.out.println("Powered number is: " + out);
    }
}