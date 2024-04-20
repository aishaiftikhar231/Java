
package perareacal;


public class PerAreaCal {

   
    public static void main(String[] args) {
        
         cylinder myCylinder = new cylinder(9, 12);
        
        System.out.println(myCylinder.getHeight());
        
        System.out.println(myCylinder.getRadius());
        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
    }
    
}
