package com.java.patterns.strategy.array;

public class OperationGetMax implements OperationStrategy {

    @Override
    public int doOperation(int[] array) {
        if (array.length==0) return 0;
        int max = array[0];
        for (int element: array ) {
            if(element > max) max = element;
        }
        return max;
    }
}
