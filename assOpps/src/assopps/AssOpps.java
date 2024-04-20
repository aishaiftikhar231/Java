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
public class AssOpps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle circle = new Circle("Red", 5.0);
        circle.display();
        System.out.println("Circle area: " + circle.getArea());

        Rectangle rectangle = new Rectangle("Blue", 3.0, 4.0);
        rectangle.display();
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
    
}
