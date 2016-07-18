package com.java.courses.calculator;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double divide(int a, int b) throws DivisionByZero {
        if(b==0) {
            throw new DivisionByZero("div by 0");
        }
        return a/b;
    }

}
