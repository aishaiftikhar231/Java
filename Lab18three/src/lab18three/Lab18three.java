/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18three;

/**
 *
 * @author hp
 */
public class Lab18three {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());  // Output: Circle area: 78.53981633974483
        
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + rectangle.calculateArea());  // Output: Rectangle area: 24.0
        
        Triangle triangle = new Triangle(3, 8);
        System.out.println("Triangle area: " + triangle.calculateArea());  // Output: Triangle area: 12.0
    }
    
}
