/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18two;

/**
 *
 * @author hp
 */
public class Lab18two {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle vehicle = new Vehicle();
        System.out.println("Vehicle speed: " + vehicle.speed);  // Output: Vehicle speed: 0
        
        vehicle.speedUp();
        System.out.println("Vehicle speed after speedUp(): " + vehicle.speed);  // Output: Vehicle speed after speedUp(): 1
        
        Car car = new Car();
        car.speedUp();
        System.out.println("Car speed after speedUp(): " + car.speed);  // Output: Car speed after speedUp(): 10
        
        Bicycle bicycle = new Bicycle();
        bicycle.speedUp();
        System.out.println("Bicycle speed after speedUp(): " + bicycle.speed);  // Output: Bicycle speed after speedUp(): 2
    }
    }
    
}
