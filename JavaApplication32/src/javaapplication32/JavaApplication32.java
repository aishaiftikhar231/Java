
package javaapplication32;
import java.io.File;
import java.io.IOException;
import java.util.Scanner; 
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class JavaApplication32 {

   
    public static void main(String[] args) {
       String filename; // File name
        String friendName; // Friend's name
        int numFriends; 
        
        Scanner keyboard = new Scanner(System.in);
       
        // Get the number of friends.
        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();
        
        try{
           File mfile= new File("E:\\filename.txt");
            if (mfile.createNewFile() ){
                System.out.println("new file");
                
            }
            else 
                System.out.println("no new file");
        
                    PrintWriter outputFile = new PrintWriter("E:\\filename.txt");
           
            // Get data and write it to the file.
            for (int i = 1; i <= numFriends; i++) {
                // Get the name of a friend.
                System.out.print("Enter the name of friend " + "number " + i + ": ");
                friendName = keyboard.nextLine();
               
                // Write the name to the file.
                outputFile.println(friendName);
            }
           
            // Close the file.
            outputFile.close();
            System.out.println("Data written to the file.");
            
            // buffer reader
            
            BufferedReader bufferedReader = new BufferedReader("E:\\filename.txt");
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
        
        }
        }
        catch(IOException e){
            System.out.println("error occured");
        }
    }
    
}
