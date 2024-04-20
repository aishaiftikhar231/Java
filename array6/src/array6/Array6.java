/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array6;

    import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class Array6 {
 public static void main(String[] args) {
        ArrayList<PhonebookEntry> phonebook = new ArrayList<>();

        // Create PhonebookEntry objects and add them to the ArrayList
        phonebook.add(new PhonebookEntry("John Doe", "123-456-7890"));
        phonebook.add(new PhonebookEntry("Jane Smith", "987-654-3210"));
        phonebook.add(new PhonebookEntry("Mike Johnson", "555-123-4567"));
        phonebook.add(new PhonebookEntry("Emily Brown", "888-999-0000"));
        phonebook.add(new PhonebookEntry("David Lee", "777-222-3333"));

        // Display the contents of each PhonebookEntry object in the ArrayList
        for (PhonebookEntry entry : phonebook) {
            System.out.println("Name: " + entry.getName());
            System.out.println("Phone Number: " + entry.getPhoneNumber());
            System.out.println();
        }

public class PhonebookEntry {
    private String name;
    private String phoneNumber;

    public PhonebookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   
    }
}

    
    

