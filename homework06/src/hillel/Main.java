package hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if(args.length==2){
            int arg1 = Integer.parseInt(args[0]);
            int arg2 = Integer.parseInt(args[1]);

            System.out.println("Sum of arguments is: "+(arg1+arg2));
            return;
        }
        System.out.println("Usage: java -jar sum.jar int_number1 int_number2");

    }
}
