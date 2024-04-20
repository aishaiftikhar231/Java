/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Car car = new Car("Toyota", "Corolla", 2022, 4);
        Truck truck = new Truck("Ford", "F-150", 2022, 1500);
        
        System.out.println("Car make: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car year: " + car.getYear());
        System.out.println("Car number of doors: " + car.getNumDoors());
        
        System.out.println("Truck make: " + truck.getMake());
        System.out.println("Truck model: " + truck.getModel());
        System.out.println("Truck year: " + truck.getYear());
        System.out.println("Truck payload: " + truck.getPayload() + " lbs");
    }
    }
    

