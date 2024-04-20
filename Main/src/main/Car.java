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
public class Car extends Vehicle {
    private int numDoors;
    
    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }
    
    public int getNumDoors() {
        return numDoors;
    }
}