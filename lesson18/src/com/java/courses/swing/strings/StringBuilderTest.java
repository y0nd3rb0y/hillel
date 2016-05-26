package com.java.courses.swing.strings;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str = "";
        for (int i =1; i<10; i++){
            str += i;
        }
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            stringBuilder.append(i);

        }
        System.out.println(stringBuilder.toString());
    }
}
