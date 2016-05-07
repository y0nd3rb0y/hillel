package com.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class ArrayList implements IList {

    private static final int INITIAL_CAPACITY = 10;
    private String[] array;
    private int size;

    ArrayList() {
        this(INITIAL_CAPACITY);
        //array = new String[INITIAL_CAPACITY];
    }

    ArrayList(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) return true;
        }
        return false;
    }

    @Override
    public void add(String element) {
        resize();
        array[size] = element;
        size++;
    }

    private void resize() {
        if (size == array.length) {
            String[] arrayNew = new String[array.length * 2];
            for (int i = 0; i < size; i++) {
                arrayNew[i] = array[i];
            }
            array = arrayNew;
        }

        if (size < 0.25 * array.length) {
            String[] arrayNew = new String[array.length / 2];
            for (int i = 0; i < size; i++) {
                arrayNew[i] = array[i];
            }
            array = arrayNew;
        }

    }

    @Override
    public String set(int index, String element) {
        String oldElement = array[index];
        array[index] = element;
        return oldElement;
    }

    @Override
    public void remove(int index) {
        if (index < size) {
            for (int i = index; i < size; i++) {
                array[index] = array[index + 1];
            }
        }
        array[size] = null;
        size--;
        resize();
    }

    @Override
    public void remove(String element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) remove(i);
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
            size = 0;
        }
    }

    @Override
    public int indexOf(String element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        return array[index];
    }

    @Override
    public Iterator listIterator() {
        return new ListIterator();
    }

    @Override
    public Iterator randomListIterator() {
        return new RandomListIterator();
    }

    public Iterator backwardListIterator() {
        return new BackwardListIterator(array, size);
    }

    public String toString() {
        String elements = "[ ";
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                elements += array[i] + ", ";
            } else {
                elements += array[i];
            }

        }
        elements += " ]";
        return elements;
    }

    private class ListIterator implements Iterator {

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size;

        }

        @Override
        public Object next() {
            String element = array[current];
            current++;
            return element;
        }
    }

    private class RandomListIterator extends ListIterator implements Iterator {
        private Random random = new Random();
        private String[] shuffledArray = Arrays.copyOf(array, size);
        private int current = 0;

        RandomListIterator() {
            for (int i = 0; i < size - 2; i++) {
                int j = random.nextInt(size - i);
                String tmp = shuffledArray[i];
                shuffledArray[i] = shuffledArray[i + j];
                shuffledArray[i + j] = tmp;
            }
        }

        @Override
        public Object next() {
            String element = shuffledArray[current];
            current++;
            return element;
        }
    }
}
