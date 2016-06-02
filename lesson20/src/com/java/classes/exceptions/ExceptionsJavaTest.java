package com.java.classes.exceptions;

import sun.nio.ch.Net;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionsJavaTest {
    public static void main(String[] args) {

        ExceptionsJavaTest exceptionsJavaTest = new ExceptionsJavaTest();
        try {
            exceptionsJavaTest.doSomething();
        } catch (NetworkException ne){
            System.out.println(ne.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void doSomething() throws NetworkException, FileNotFoundException{
        if(somethingWrongWithNetwork()){
            throw new NetworkException("Network is unreachable");
        }
        if(cantReadFile()){
            throw new FileNotFoundException("File not found");
        }
    }

    public boolean somethingWrongWithNetwork(){
        return true;
    }

    public boolean cantReadFile(){
        return true;
    }
}
