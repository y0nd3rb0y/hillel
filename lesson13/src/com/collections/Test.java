package com.collections;


import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        IList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println("Element: "+iterator.next());
        }

        Iterator backwardIterator = list.backwardListIterator();
        while(backwardIterator.hasNext()){
            System.out.println("Element: "+backwardIterator.next());
        }
        System.out.println(list.toString());
    }

}
