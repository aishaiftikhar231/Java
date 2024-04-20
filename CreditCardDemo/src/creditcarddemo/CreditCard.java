/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcarddemo;

/**
 *
 * @author hp
 */
public class CreditCard {
    String owner;
    Money creditlimit;
    Money balance;
    
    public Money getBalance(Money m) {
        balance=new Money(m);
        //return new Money(balance); // copy constructor
        return balance;
    }

    public Money getCreditLimit(Money m1) {
        creditlimit=new Money(m1).subtract(balance);
        //return new Money(creditlimit).subtract(balance); // copy constructor and subtraction
        return creditlimit;
    }

    public String getOwnerInfo() {
        return owner.toString();
    }

    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditlimit) <= 0) { // adding and comparison
            balance.add(amount);
        } else {
            System.out.println("Error: credit limit exceeded");
        }
    }

    public void makePayment(Money amount) {
        balance.subtract(amount); // subtraction
    }
}




