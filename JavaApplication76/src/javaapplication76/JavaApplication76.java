/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

/**
 *
 * @author hp
 */
public class PersonalData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create an instance for your information
        PersonalData myInfo = new PersonalData("Your Name", "Your Address", 25, "1234567890");

        // Create instances for friends or family members
        PersonalData friend1Info = new PersonalData("Friend 1", "Friend 1's Address", 30, "9876543210");
        PersonalData friend2Info = new PersonalData("Friend 2", "Friend 2's Address", 28, "5555555555");

        // Access and display the personal data using accessor methods
        System.out.println("My Information:");
        System.out.println("Name: " + myInfo.getName());
        System.out.println("Address: " + myInfo.getAddress());
        System.out.println("Age: " + myInfo.getAge());
        System.out.println("Phone Number: " + myInfo.getPhoneNumber());

        System.out.println();

        System.out.println("Friend 1's Information:");
        System.out.println("Name: " + friend1Info.getName());
        System.out.println("Address: " + friend1Info.getAddress());
        System.out.println("Age: " + friend1Info.getAge());
        System.out.println("Phone Number: " + friend1Info.getPhoneNumber());

        System.out.println();

        System.out.println("Friend 2's Information:");
        System.out.println("Name: " + friend2Info.getName());
        System.out.println("Address: " + friend2Info.getAddress());
        System.out.println("Age: " + friend2Info.getAge());
        System.out.println("Phone Number: " + friend2Info.getPhoneNumber());
    }
}

    
    

public class PersonalData {
    private String name;
    private String address;
    private int age;
    private String phoneNumber;

    // Constructor
    public PersonalData(String name, String address, int age, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
