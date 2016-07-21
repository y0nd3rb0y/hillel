package com.java.courses.threads.immutability;

import java.util.Date;

public final class Student {
    private final  String name;
    private final int age;
    private final Date birthday;

    public Student(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }


}
