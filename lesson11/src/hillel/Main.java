package hillel;

/**
 * Created by User on 25.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        int a=3, b=2;
        String operation = "multiply";
        int result=0;
        switch(operation){
            case "multiply":
                result = a*b;
                break;
            case "divide":
                result = a/b;
                break;
            case "substract":
                result = a-b;
                break;
            case "add":
                result = a+b;
                break;
            default:
                break;
        }
        System.out.println("Result is: "+result);
    }

}
