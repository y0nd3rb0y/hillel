package ua.od.hillel.variables;

import sun.rmi.runtime.Log;

/**
 * Created by User on 24.03.2016.
 */
public class LogicOperation {
    public static void main(String[] args){
//        LogicOperation.method1();
//        LogicOperation.method2();

        if (method1() || method2()){
            System.out.println("Result is true");
        }
    }

    public static  boolean method1(){
        System.out.println("In method1");
        return true;
    }

    public static boolean method2(){
        System.out.println("In method2");
        return true;
    }
}
