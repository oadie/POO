package com.generation.Bank;

public class BankAccount {
    private String name;
    private String key;
    private float balance;

    //alt+enter seleccionar todo y hacer getter and setter
    public String getName() {
        return this.name;
    }

    public String getKey(){
        return this.key;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setBalance(float balance) {
        if(balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void showBalance() {
        System.out.println(this.balance);
    }
}
