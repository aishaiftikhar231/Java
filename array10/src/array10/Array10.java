/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array10;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class Array10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<PhonebookEntry> phonebook = new ArrayList<>();

        // Create PhonebookEntry objects and add them to the ArrayList
        phonebook.add(new PhonebookEntry("John Smith", "1234567890"));
        phonebook.add(new PhonebookEntry("Jane Doe", "9876543210"));
        phonebook.add(new PhonebookEntry("Michael Johnson", "4567890123"));
        phonebook.add(new PhonebookEntry("Emily Wilson", "7890123456"));
        phonebook.add(new PhonebookEntry("David Brown", "2345678901"));

        // Display the contents of each PhonebookEntry object in the ArrayList
        for (PhonebookEntry entry : phonebook) {
            System.out.println("Name: " + entry.getName());
            System.out.println("Phone Number: " + entry.getPhoneNumber());
            System.out.println();
        }
    }
    }
    class PhonebookEntry {
    private String name;
    private String phoneNumber;

    public PhonebookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

