package com.java.classes.stack;

public class StackArrayTest {
    public static void main(String[] args){
        int[] a = {1};
        StackArray stackArray = new StackArray(a);
        stackArray.push(4);
        stackArray.push(5);
        try {
            System.out.println(stackArray.pop());
            System.out.println(stackArray.pop());
            System.out.println(stackArray.pop());
            System.out.println(stackArray.pop());
            System.out.println(stackArray.pop());
        } catch (StackArray.StackArrayOutOfBounds | StackArray.NoElementsLeftException  e) {
            System.out.println(e.getMessage());
        }

    }
}
