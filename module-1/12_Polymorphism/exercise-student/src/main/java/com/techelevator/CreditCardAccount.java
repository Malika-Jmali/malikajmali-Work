package com.techelevator;

public class CreditCardAccount implements Accountable {

    private String accountHolder;
    private String accountNumber;
    private int debt;
    public CreditCardAccount(String accountHolder, String accountNumber){

    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }
    public int pay(int amountToPay){
        return 0;
    };
    public int charge(int amountToCharge){
        return 0;
    }

}