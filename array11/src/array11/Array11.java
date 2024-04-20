/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array11;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Array11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<PhoneBookEntry> phonebook = new ArrayList<>();

        // Create PhonebookEntry objects
        PhoneBookEntry entry1 = new PhoneBookEntry("John Doe", "1234567890");
        PhoneBookEntry entry2 = new PhoneBookEntry("Jane Smith", "9876543210");
        PhoneBookEntry entry3 = new PhoneBookEntry("Bob Johnson", "5555555555");
        PhoneBookEntry entry4 = new PhoneBookEntry("Alice Brown", "9998887777");
        PhoneBookEntry entry5 = new PhoneBookEntry("Sam Wilson", "1112223333");

        // Add objects to the ArrayList
        phonebook.add(entry1);
        phonebook.add(entry2);
        phonebook.add(entry3);
        phonebook.add(entry4);
        phonebook.add(entry5);

        // Display the contents of each object in the ArrayList
        for (PhoneBookEntry entry : phonebook) {
            System.out.println("Name: " + entry.getName());
            System.out.println("Phone Number: " + entry.getPhoneNumber());
            System.out.println();
        }
    }
    }
    

