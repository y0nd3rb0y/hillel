/**
 * Created by User on 31.03.2016.
 */
public class DigitsTask {
    public static void main(String[] args) {
        int number = 876;
        int sum=0;
        while(number%10!=0) {
            int remain = number % 10;
            number = number / 10;
            sum+=remain;
            System.out.println(remain);
        }
        System.out.println(sum);
    }
}
