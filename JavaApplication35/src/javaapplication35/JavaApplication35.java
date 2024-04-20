
package javaapplication35;
import java.util.Scanner;
public class JavaApplication35 {

  
    public static void main(String[] args) {
       
       
        
        Scanner input = new Scanner(System.in);
        int numBooks, points = 0;

        // Ask the user to enter the number of books purchased
        System.out.print("Enter the number of books purchased this month: ");
        numBooks = input.nextInt();

        // Calculate the points based on the number of books purchased
        if (numBooks == 1) {
            points = 5;
        } else if (numBooks == 2) {
            points = 15;
        } else if (numBooks == 3) {
            points = 30;
        } else if (numBooks >= 4) {
            points = 60;
        }

        // Display the points awarded
        System.out.println("The number of points awarded is: " + points);
    }
    }
    
}
