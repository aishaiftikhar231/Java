
package lab13;


public class Lab13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Create a Student object with a name
Student student1 = new Student("John");

// Create another Student object with no name
Student student2 = new Student();

// Print the names of the students
System.out.println(student1.getName()); // Output: John
System.out.println(student2.getName()); // Output: Unknown

// Create a BankAccount object with a starting balance
BankAccount account1 = new BankAccount(1000.0);

// Create another BankAccount object with no starting balance
BankAccount account2 = new BankAccount();

// Deposit money into the accounts
account1.deposit(500.0);
account2.deposit("1000.0");

// Withdraw money from the accounts
account1.withdraw(200.0);
account2.withdraw("500.0");

// Print the balances of the accounts
System.out.println(account1.getBalance()); // Output: 1300.0
System.out.println(account2.getBalance()); // Output: 500.0
    }
    
}
