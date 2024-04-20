/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

/**
 *
 * @author hp
 */
public class JavaApplication49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Car c1=new Car(2012);
        
        c1.setcarinfo("toyota", 220);
        
        for(int i=1;i<=5;i++)
            c1.accelerate();
        System.out.println("car acceleration is "+c1.accelerate());
        
        for(int i=1;i<=5;i++)
            c1.brake();
        System.out.println("car brake is "+c1.brake());
    }
    
}
