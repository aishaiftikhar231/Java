/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author hp
 */
public class BankAccount {
    
 private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public BankAccount(double startBalance) {
        this.balance = startBalance;
    }

    public BankAccount(String str) {
        this.balance = Double.parseDouble(str);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(String str) {
        double amount = Double.parseDouble(str);
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void withdraw(String str) {
        double amount = Double.parseDouble(str);
        this.balance -= amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBalance(String str) {
        double balance = Double.parseDouble(str);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
