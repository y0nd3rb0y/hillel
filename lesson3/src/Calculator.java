/**
 * Created by User on 28.03.2016.
 */
public class Calculator {
    public static void main(String[] args) {
        double a, b;
        String operation = "/";
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        double result = 0;

        switch (operation) {
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    break;
                }
                result = a / b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        System.out.println("variable a: " + (int) a);
        System.out.println("variable b: " + (int) b);
        if (b == 0 && operation == "/") {
            System.out.println("Division by null");
        } else System.out.printf("Result of %.0f %s %.0f is: %.2f", a, operation, b, result);
    }
}
