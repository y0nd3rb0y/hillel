package com.java.patterns.strategy.array;

import java.util.Random;

public class OperationGetRandom implements OperationStrategy {

    @Override
    public int doOperation(int[] array) {
        if (array.length==0) return 0;
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }
}
