package com.java.classes.exceptions.atm;

import com.java.classes.exceptions.ExcceptionsTest;

public class ATM {
    private static int totalMoney = 50000;
    private void getMoney(int money) throws InsufficientFundsException, NetworkException {
        if(money<ATM.totalMoney){
            ATM.totalMoney-=money;
            System.out.println(""+money);
        } else {
            throw new InsufficientFundsException();
        }

        if(!updateDatabase(ATM.totalMoney)){
            throw new NetworkException("No connection");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.getMoney(60000);
        } catch (InsufficientFundsException | NetworkException e) {
            //insufficientFunds.printStackTrace();
            System.out.println(e.getMessage());

        }

    }

    private class InsufficientFundsException extends Exception {
        final static String MESSAGE = "There is insufficient funds in current ATM. Please try other ATM.";

        InsufficientFundsException(){
            super(MESSAGE);
        }
    }

    private class NetworkException extends Exception {
        public NetworkException(String message){
            super(message);
        }
    }

    public boolean updateDatabase(int sum){
        return true;
    }
}
