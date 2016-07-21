package com.java.courses.threads.immutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Student student = new Student("Sam", 25, date);
        Date birthday = student.getBirthday();
        birthday.setYear(1983);
        List list = Collections.synchronizedList(new ArrayList<Object>());

    }
}
