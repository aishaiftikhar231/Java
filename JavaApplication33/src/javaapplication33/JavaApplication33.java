
package javaapplication33;
import java.util.*;

public class JavaApplication33 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];

        // Ask the user to enter three names
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name #" + (i+1) + ": ");
            names[i] = input.nextLine();
        }

        // Sort the names in ascending order
        Arrays.sort(names);

        // Display the sorted names
        System.out.println("Sorted names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
    
    }
    
}
