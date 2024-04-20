
package javaapplication30;

import java.util.Scanner;
public class JavaApplication30 {

   
    public static void main(String[] args) {
        
        System.out.println("enter a number ");
     Scanner input = new Scanner(System.in);

        double distanceInMeters;

        do {
            System.out.print("Enter a distance in meters (or enter a negative number to quit): ");
            distanceInMeters = input.nextDouble();

            if (distanceInMeters >= 0) {
                menu();
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        showKilometers(distanceInMeters);
                        break;
                    case 2:
                        showInches(distanceInMeters);
                        break;
                    case 3:
                        showFeet(distanceInMeters);
                        break;
                    case 4:
                        System.out.println("Quitting the program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid option from the menu.");
                        break;
                }
            }
        } while (distanceInMeters >= 0);
    }

    public static void menu() {
        System.out.println("Please choose an option:");
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }

    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.println(meters + " meters is equal to " + kilometers + " kilometers.");
    }

    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.println(meters + " meters is equal to " + inches + " inches.");
    }

    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.println(meters + " meters is equal to " + feet + " feet.");
    }
}
    

