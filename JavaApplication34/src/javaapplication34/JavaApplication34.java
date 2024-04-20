
package javaapplication34;
 import java.util.Scanner;

public class JavaApplication34 {

  
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int numChecks;
        double baseFee = 10.0, checkFee = 0.0, totalFee;

        // Ask the user to enter the number of checks written
        System.out.print("Enter the number of checks written this month: ");
        numChecks = input.nextInt();

        // Calculate the check fee based on the number of checks written
        if (numChecks < 20) {
            checkFee = numChecks * 0.10;
        } else if (numChecks >= 20 && numChecks <= 39) {
            checkFee = numChecks * 0.08;
        } else if (numChecks >= 40 && numChecks <= 59) {
            checkFee = numChecks * 0.06;
        } else {
            checkFee = numChecks * 0.04;
        }

        // Calculate the total fee and display it
        totalFee = baseFee + checkFee;
        System.out.printf("The bank's service fee for the month is: $%.2f%n", totalFee);
    }
    }
    
}
