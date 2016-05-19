package com.java.patterns.factory_method;

public class FactoryTest {
    public static void main(String[] args) {
        Student student = Student.newInstance("Sam", 35);
        //Student student1 = new Student("Sam", 35); cant do as constructor is private

    }
}
