package com.java.courses.threads.races;

public class CounterThreadIncrement implements Runnable {
    private Counter counter;
    CounterThreadIncrement(Counter counter){
        this.counter = counter;

    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            //Thread.sleep(500);
            counter.increment();
        }

    }
}
