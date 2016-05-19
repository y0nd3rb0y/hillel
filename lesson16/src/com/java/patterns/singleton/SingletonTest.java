package com.java.patterns.singleton;

public class SingletonTest {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if(singleton == singleton1 && singleton1 == singleton2){
            System.out.println("singleton is correct");
        }
    }
}
