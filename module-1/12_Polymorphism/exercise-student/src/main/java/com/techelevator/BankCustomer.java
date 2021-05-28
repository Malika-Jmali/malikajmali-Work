package com.techelevator;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Accountable[] getAccounts() {

        return accounts.toArray(new Accountable[accounts.size()]);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public boolean isVip() {
        if (getBalance() >= 25000) {

            return true;
        }
        return false;
    }


    @Override
    public int getBalance() {
        int balance = 0;

        for (Accountable account : accounts) {
            balance += account.getBalance();
        }
        return balance;
    }


}
