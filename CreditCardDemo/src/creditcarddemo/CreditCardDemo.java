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
public class CreditCardDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final Money LIMIT = new Money(1000);
		final Money FIRST_AMOUNT = new Money(200);
		final Money SECOND_AMOUNT = new Money(10.02);
		final Money THIRD_AMOUNT = new Money(25);
		final Money FOURTH_AMOUNT = new Money(990);
		Person owner = new Person("Christie", "Diane",
			new Address("237J Harvey Hall", "Menomonie",
			"WI", "54751"));
		CreditCard visa = new CreditCard(owner, LIMIT);
		System.out.println(visa.getPersonals());
		System.out.println("Balance: " + visa.getBalance());
		System.out.println("Credit Limit: "
			+ visa.getCreditLimit());
		System.out.println();
		System.out.println("Attempt to charge " + FIRST_AMOUNT);
		visa.charge(FIRST_AMOUNT);
		System.out.println("Balance: " + visa.getBalance());
		System.out.println("Attempt to charge " + SECOND_AMOUNT);
		visa.charge(SECOND_AMOUNT);
		System.out.println("Balance: " + visa.getBalance());
		System.out.println("Attempt to pay " + THIRD_AMOUNT);
		visa.payment(THIRD_AMOUNT);
		System.out.println("Balance: " + visa.getBalance());
		System.out.println("Attempt to charge " + FOURTH_AMOUNT);
		visa.charge(FOURTH_AMOUNT);
		System.out.println("Balance: " + visa.getBalance());
	}
    }
    

