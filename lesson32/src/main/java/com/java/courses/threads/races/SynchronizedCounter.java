package com.java.courses.threads.races;

public class SynchronizedCounter {
    Counter counter;

    public SynchronizedCounter(Counter counter){
        this.counter = counter;
    }
    public synchronized void increment() {

        counter.increment();

    }
    public synchronized void decrement() {

        counter.decrement();

    }

    public int getValue(){
        return counter.getValue();
    }
}
