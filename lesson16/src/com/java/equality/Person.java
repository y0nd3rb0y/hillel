package com.java.equality;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person(){

    }
    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean equals(Object obj) {
        if(obj == null) return false;
        //if(obj instanceof Person){ soft case. is not correct
        if(obj.getClass()!=Person.class) return false;

        Person person = (Person) obj;
        if(person.lastname==null || person.firstname==null || person.age==0) return false;
        if (this.getFirstname().equals(person.getFirstname())
                && this.lastname.equals(person.lastname)
                && this.age==person.age){
            return true;
        }
        return false;
    }
}
