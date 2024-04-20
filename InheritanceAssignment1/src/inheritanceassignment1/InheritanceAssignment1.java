/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceassignment1;

/**
 *
 * @author hp
 */
public class InheritanceAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Car myCar = new Car("Honda", "Civic", 2021, 4);
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Number of doors: " + myCar.getNumDoors());
        
        Truck myTruck = new Truck("Ford", "F-150", 2022, 2000);
        System.out.println("Make: " + myTruck.getMake());
        System.out.println("Model: " + myTruck.getModel());
        System.out.println("Year: " + myTruck.getYear());
        System.out.println("Payload capacity: " + myTruck.getPayloadCapacity() + " lbs");
    }


    }
    

