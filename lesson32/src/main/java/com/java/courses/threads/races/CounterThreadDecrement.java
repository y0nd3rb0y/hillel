package com.java.courses.threads.races;

public class CounterThreadDecrement implements Runnable {
    private Counter counter;
    CounterThreadDecrement(Counter counter){
        this.counter = counter;

    }

    public void run() {

        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }
    }
}
