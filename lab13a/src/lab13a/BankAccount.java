/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13a;

/**
 *
 * @author hp
 */
public class BankAccount {
    private double balance;

    // No-arg constructor
    public BankAccount() {
        balance = 0.0;
    }

    // Constructor with startBalance parameter
    public BankAccount(double startBalance) {
        balance = startBalance;
    }

    // Constructor with str parameter
    public BankAccount(String str) {
        balance = Double.parseDouble(str);
    }

    // Deposit methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(String str) {
        double amount = Double.parseDouble(str);
        balance += amount;
    }

    // Withdraw methods
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void withdraw(String str) {
        double amount = Double.parseDouble(str);
        balance -= amount;
    }

    // setBalance methods
    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setBalance(String str) {
        balance = Double.parseDouble(str);
    }

    // getBalance method
    public double getBalance() {
        return balance;
    }
}

    
}
