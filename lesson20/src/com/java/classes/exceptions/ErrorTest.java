package com.java.classes.exceptions;

public class ErrorTest {
    public static void main(String[] args) {
     int i =5;
        ErrorTest errorTest = new ErrorTest();
        errorTest.someMethod(5);
    }
    public void someMethod(int i){
        if(i == 5) someMethod(i);
    }
}
