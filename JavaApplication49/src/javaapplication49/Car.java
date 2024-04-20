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
public class Car {
    int yearmodel;
    String make;
    int speed;
    
    public Car(int year)
    {
        yearmodel=year;
    }
    
    public void setcarinfo(String m,int s)
    {
        make=m;
        speed=s;
        
    }
    public int accelerate()
    {
        
        
            speed=speed+5;
            return speed;
    }
    public int brake()
    {
        
            speed=speed-5;
            return speed;
    }
    
}







