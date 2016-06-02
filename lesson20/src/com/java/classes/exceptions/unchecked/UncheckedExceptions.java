package com.java.classes.exceptions.unchecked;

public class UncheckedExceptions {
    public static void main(String[] args) {
        UncheckedExceptions uncheckedExceptions = new UncheckedExceptions();
        //uncheckedExceptions.divisionByZero();
        int[] array = {1, 2, 3};
        int result = uncheckedExceptions.getElement(array, 5);

    }

    public void divisionByZero() {
        int k = 5;
        k = k / 0;
    }

    public int getElement(int[] array, int index) {
        return array[index];
    }
}
