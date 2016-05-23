package com.java.patterns.strategy.array;

public class OperationGetMin implements OperationStrategy {

    @Override
    public int doOperation(int[] array) {
        if (array.length==0) return 0;
        int min = array[0];
        for (int element: array ) {
            if(element < min) min = element;
        }
        return min;
    }
}
