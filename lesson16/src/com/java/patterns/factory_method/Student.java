package com.java.patterns.factory_method;

public class Student {
    private String name;
    private int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student newInstance(String name, int age){
        return new Student(name, age);
    }
}
