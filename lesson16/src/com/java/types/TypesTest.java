package com.java.types;

import com.java.equality.Engineer;
import com.java.equality.Person;
import com.sun.xml.internal.ws.api.pipe.Engine;

public class TypesTest {
    public static void main(String[] args) {
        Person person = new Engineer("John", "Smith", 25);
        System.out.println(person.getClass().getSimpleName());
        if(person.getClass() == Person.class){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(person.getClass() == Engineer.class){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("--------------");
        System.out.println("Person and Person");
        if(person instanceof Person){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("Person and Engineer");
        if(person instanceof Engineer){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
