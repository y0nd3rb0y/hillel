package com.java.classes.exceptions.checked;

public class SeveralMethodsException {
    public static void main(String[] args) {
        SeveralMethodsException severalMethodsException = new SeveralMethodsException();
        try {
            severalMethodsException.methodFirst();
        } catch (Exception e){
            System.out.println(e.getMessage());
            //add something to the log
        }
    }

    public void methodFirst() throws Exception{
        methodSecond();
    }

    public void methodSecond() throws Exception{
        methodThird();
    }

    public void methodThird() throws Exception {
        throw new Exception("Something wrong happened");
    }



}
