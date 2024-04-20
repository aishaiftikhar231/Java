/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author hp
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic class StringArrayDemo {
 
        String[] names = {"Einstein", "Newton", "Copernicus", "Kepler"};

        System.out.println("Contents of the array:");
        for (String name : names) {
            System.out.println(name);
        }

        int totalLength = 0;
        for (String name : names) {
            totalLength += name.length();
        }

        System.out.println("Total length of all strings: " + totalLength);
    }
}

    
    

