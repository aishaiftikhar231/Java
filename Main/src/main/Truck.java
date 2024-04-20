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
public class Truck extends Vehicle {
    private int payload;
    
    public Truck(String make, String model, int year, int payload) {
        super(make, model, year);
        this.payload = payload;
    }
    
    public int getPayload() {
        return payload;
    }
}
