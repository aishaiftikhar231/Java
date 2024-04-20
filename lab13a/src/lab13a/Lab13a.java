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
public class Lab13a {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(); // Using the no-arg constructor
        System.out.println("Initial balance: " + account1.getBalance()); // Output: 0.0

        account1.deposit(100.0);
        System.out.println("Balance after deposit: " + account1.getBalance()); // Output: 100.0

        account1.withdraw(50.0);
        System.out.println("Balance after withdrawal: " + account1.getBalance()); // Output: 50.0

        BankAccount account2 = new BankAccount(500.0); // Using the constructor with startBalance parameter
        System.out.println("Initial balance of account2: " + account2.getBalance()); // Output: 500.0

        account2.setBalance("750.0");
        System.out.println("Updated balance of account2: " + account2.getBalance()); // Output: 750.0
    }
}

    
    

