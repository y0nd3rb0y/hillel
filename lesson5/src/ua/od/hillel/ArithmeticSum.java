package ua.od.hillel;

/**
 * Created by User on 04.04.2016.
 */
public class ArithmeticSum {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        int sum = 0;
        int[] cache = new int[100];
        long tl = System.nanoTime();
        //System.out.println(tl);
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        long tle = System.nanoTime();
        //System.out.println(tle);
        System.out.println("Sum in loop is: " + sum + " Time is " + (tle - tl));


        long tf = System.nanoTime();
        int sumf = ((1 + 100) * 100 / 2);
        cache[50] = sumf;
        long tfe = System.nanoTime();
        System.out.println("Sum by formula is: " + sumf + " Time is " + (tfe - tf));
        long start = 0;
        long end = 0;
        int result = 0;
        if (cache[50] != 0) {
            start = System.nanoTime();
            result = cache[50];
            end = System.nanoTime();

        }
        long duration = end - start;
        System.out.println("The value is: " + result + " Duration is " + duration);

    }
}
