/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcarddemo2;

/**
 *
 * @author hp
 */
public class CreditCard {
      private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard( Money creditLimit) {
        //this.owner = owner;
        this.creditLimit = new Money(creditLimit); // Create a new Money object using the copy constructor
        this.balance = new Money(0); // Initialize balance to zero
    }

    public Money getBalance() {
        return new Money(balance); // Return a new Money object using the copy constructor
    }
    public Money getcreditlimit()
    {
        return new Money(this.creditLimit);
    }

    public Money getAvailableCredit() {
        // Calculate and return the available credit by subtracting the balance from the creditLimit
        return new Money(this.creditLimit.subtract(balance)); // Return a new Money object using the copy constructor
    }

//    public String getOwnerInfo() {
//        return owner.toString(); // Get the owner information using the Person's toString method
//    }

    public void charge(Money amount) {
        // Check if charging the amount will exceed the credit limit
        if (balance.add(amount).compareTo(creditLimit)<= 0) {
            // If not, add the amount to the balance
            System.out.println("Error: Credit limit exceeded. Charge not added.");
            
        } else 
            
            balance = balance.add(amount);
        
    }

    public void makePayment(Money amount) {
        // Subtract the payment amount from the balance
        balance = balance.subtract(amount);
    }

    
}
