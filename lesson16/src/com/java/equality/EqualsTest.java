package com.java.equality;

public class EqualsTest {
    public static void main(String[] args) {
        Object p1 = new Person("John", "Doe", 25);
        Object p2 = new Person("John", "Doe", 25);
        //Object p1 = new Person();
        //Object p2 = new Person();
        System.out.println("==");
        if(p1 == p2){
            System.out.println("Persons are equal");
        } else{
            System.out.println("Persons are not equal");
        }
        System.out.println("equals test:");
        if(p1.equals(p2)){
            System.out.println("Persons are equal");
        } else{
            System.out.println("Persons are not equal");
        }


    }


}
