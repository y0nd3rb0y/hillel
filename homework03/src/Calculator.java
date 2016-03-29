import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double result = 0;
        boolean error = false;
        String action = "+";
        double a = 0;
        double b = 0;

        if (args.length != 3) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
            }
            System.out.print("Enter action( * - + / ): ");
            if (scanner.hasNext()) {
                action = scanner.next();
            }
            System.out.print("Enter second number: ");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
            }
        } else {
            a = Integer.parseInt(args[0]);
            action = args[1];
            b = Integer.parseInt(args[2]);
        }

        switch (action) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    error = true;
                    break;
                }
                result = a / b;
                break;
            default:
                System.out.println("Action is missing or incorrect!");
                error = true;
                break;
        }
        if (b == 0 && action.equals("/")) {
            System.out.println("Division by zero!");
        } else if (!error) {
            if ((a % 1 == 0) && (b % 1 == 0) && (!action.equals("/"))) {
                System.out.printf("Result of %.0f %s %.0f is: %.0f\n", a, action, b, result);
            } else {
                System.out.printf("Result of %.1f %s %.1f is: %.2f\n", a, action, b, result);
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
