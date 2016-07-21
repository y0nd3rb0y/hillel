package com.java.courses.threads.races;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

public class SyncCounterTest {
    public static void main(String[] args) {
        SynchronizedCounter synchronizedCounter = new SynchronizedCounter(new Counter());

    }


}
