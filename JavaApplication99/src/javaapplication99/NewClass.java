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
public class NewClass {
    
    int MY;
    String make;
    int speed;
    
    NewClass(int MY,String make){
        
        this.MY=MY;
        this.make=make;
        this.speed=0;
    
}
    public int getMy(){
    return MY;
}
    
    public String getMake(){
    return make;
}
    
public int getspeed(){
    return speed;
}

public void accelerate() {
        speed += 5;
    }

    // Method to brake the car
    public void brake() {
        if (speed >= 5) {
            speed -= 5;
        } else {
            speed = 0;
        }

}