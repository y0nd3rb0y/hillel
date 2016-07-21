package com.java.courses.threads.races;

public class Counter {
    //Object monitor = new Object();

    private int value;
    //public synchronized void increment() {
    public void increment() {

            value++;

    }
    public void decrement() {
        //synchronized (this) {
            value--;
        //}
    }

    public int getValue(){
        return value;
    }
}
