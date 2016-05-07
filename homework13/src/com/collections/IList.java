package com.collections;

import java.util.Iterator;
import java.util.ListIterator;

public interface IList {
    int size();
    boolean isEmpty();
    boolean contains(String element);
    void add(String element);
    String set(int index, String element);
    void remove(int index);
    void remove(String element);
    void clear();
    int indexOf(String element);
    String get(int index);
    Iterator listIterator();
    Iterator backwardListIterator();
    Iterator randomListIterator();


}
