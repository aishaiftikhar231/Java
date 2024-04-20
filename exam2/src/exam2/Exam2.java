/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

/**
 *
 * @author hp
 */
public class Exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Car myCar = new Car(2021, "Toyota");

        for (int i = 0; i < 5; i++) {
            myCar.accelerate();
            System.out.println("Current speed after acceleration: " + myCar.getSpeed());
        }

        for (int i = 0; i < 5; i++) {
            myCar.brake();
            System.out.println("Current speed after braking: " + myCar.getSpeed());
        }
    }
    }
    

