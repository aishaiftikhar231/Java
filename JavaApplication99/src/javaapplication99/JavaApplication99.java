/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication99;

/**
 *
 * @author hp
 */
public class JavaApplication99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NewClass obj= new NewClass(2023, "toyota");
        
        
         for (int i = 1; i <= 5; i++) {
            NewClass.accelerate();
            System.out.println(": " + NewClass.getspeed() + "Current speed after acceleration " + i);
        }

        System.out.println();

        // Brake the car five times and display current speed
        for (int i = 1; i <= 5; i++) {
            NewClass.brake();
            System.out.println("Current speed after braking " + i + ": " + NewClass.getSpeed());
        }
        
    }
    
}
