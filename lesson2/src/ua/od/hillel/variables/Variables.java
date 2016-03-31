package ua.od.hillel.variables;


public class Variables {

public static void main(String[] args){
    System.out.println("Variables");

    int a = 10;
    int b = 30;

    if (a == 10 | b == 20) {
        System.out.println("a is 10 or b is 20");
    } else if(a!=10) {
        System.out.println("Something is wrong");
    }
    boolean result = a!=10;
    if(!result) {
        System.out.println("Result = " + result);
    }
}

}
