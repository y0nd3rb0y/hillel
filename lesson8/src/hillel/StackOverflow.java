package hillel;

/**
 * Created by User on 14.04.2016.
 */
public class StackOverflow {
    public static void main(String[] args) {
        func(0);

    }

    public static void func(int n){
        if (n>10) return;
        n++;
        func(n);
    }
}
