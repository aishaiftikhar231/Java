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
public class Truck  extends Vehicle {
    private double payloadCapacity;
    
    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }
    
    public double getPayloadCapacity() {
        return payloadCapacity;
    }
}
