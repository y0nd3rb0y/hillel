package com.java.classes.stack;

import java.util.Arrays;

public class StackArray {

    private int[] array;

    StackArray(int[] array){
        this.array = array;
    }
    public int pop() throws StackArrayOutOfBounds, NoElementsLeftException {
        if(array.length>0) {
            int r = array[array.length - 1];
            array = Arrays.copyOf(array, array.length - 1);
            return r;
        } else throw new StackArrayOutOfBounds("StackArray is out of bounds");
    }

    public void push(int i){
            array = Arrays.copyOf(array, array.length+1);
            array[array.length-1]=i;
    }


    public class StackArrayOutOfBounds extends Exception {
        public StackArrayOutOfBounds(String s) throws NoElementsLeftException {
            super(s);
            throw new NoElementsLeftException("No more elements left to pop");
        }
    }

    public class NoElementsLeftException extends Exception {
        public NoElementsLeftException(String s){
            super(s);
        }


    }

}
