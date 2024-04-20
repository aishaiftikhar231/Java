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
public class CreditCardDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);
//        Person owner = new Person("Christie", "Diane",
//                new Address("237J Harvey Hall", "Menomonie",
//                        "WI", "54751"));
        CreditCard visa = new CreditCard( LIMIT);
       // System.out.println(visa.getOwnerInfo()); // Use getOwnerInfo() instead of getPersonals()
       Person p1=new Person("Aisha","The Great");
       Address a1=new Address("GSHS","Peshawar","2500","23xx5");
        System.out.println("owner details "+p1.toString()+a1.toString());
        

        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getcreditlimit()); 
// Use getAvailableCredit() instead of getCreditLimit()
        //System.out.println("availaible credit limit "+visa.getAvailableCredit());
        System.out.println();
        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.makePayment(THIRD_AMOUNT); // Use makePayment() instead of payment()
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
    }

        // TODO code application logic here
    }
    

