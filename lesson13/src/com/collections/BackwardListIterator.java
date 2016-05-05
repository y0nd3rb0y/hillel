package com.collections;

import java.util.Iterator;

public class BackwardListIterator implements Iterator {
    int current;
    String[] array;

    BackwardListIterator(String[] array, int size) {
        this.array = array;
        this.current = size-1;
    }
    @Override

    public boolean hasNext() {
        return current >= 0;

    }

    @Override
    public Object next() {
        String element = array[current];
        current--;
        return element;
    }
}
