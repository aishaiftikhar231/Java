/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17b;

/**
 *
 * @author hp
 */
public class Lab17B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
        PreferredCustomer customer = new PreferredCustomer("John Smith", "123 Main St", "555-1234");
        customer.setPurchasesAmount(1500);

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone Number: " + customer.getPhoneNumber());
        System.out.println("Purchases Amount: $" + customer.getPurchasesAmount());
        System.out.println("Discount Level: " + customer.getDiscountLevel() + "%");
    }
    }
    

