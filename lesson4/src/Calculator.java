import java.util.Scanner;

/**
 * Created by User on 31.03.2016.
 */
public class Calculator {
    public static void main(String[] args) {
        String operation;

        Scanner sc = new Scanner(System.in);
        int result = 0;

        operation = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (checkOperation(operation)){
            switch(operation){
                case "add":
                    result = a + b;
                    break;
                case "subtract":
                    result = a - b;
                    break;
                case "multiply":
                    result = a*b;
                    break;
            }
        }
        System.out.println("Result is: "+result);
    }
    public static boolean checkOperation(String operation){
        boolean res = checkAdd(operation) || checkSubtract(operation) || checkMultiply(operation);
        return res;
    }

    private static boolean checkAdd(String op){
        System.out.println("In checkAdd");
        return op.equals("add");
    }

    private static boolean checkSubtract(String op){
        System.out.println("In checkSubtract");
        return op.equals("subtract");
    }

    private static boolean checkMultiply(String op){
        System.out.println("In checkMultiply");
        return op.equals("multiply");
    }

}
