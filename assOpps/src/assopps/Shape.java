/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assopps;

/**
 *
 * @author hp
 */
public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Color: " + color);
    }
}
