/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class JavaApplication36 {

    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
       /* try(FileWriter writer = new FileWriter("Hello.txt")){
            String line;
            line = kb.nextLine();
            writer.write(line);
            
        }
        catch(IOException e){
        }
    }*/
    try(BufferedReader reader = new BufferedReader(new FileReader("Hello.txt"))){
        String Line;
        
    }
}
