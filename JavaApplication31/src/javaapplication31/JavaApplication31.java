
package javaapplication31;
import java.util.Scanner;
public class JavaApplication31 {

    public static void main(String[] args) {
        
        double mass;
        double velocity;
        
        Scanner obj= new Scanner(System.in);
        
        System.out.println("GIve values of mass and velocity and program will calculate KE");
        
        mass=obj.nextDouble();
        velocity=obj.nextDouble();
        
        
     double kineticEnergy = kineticEnergy(mass, velocity);

        System.out.println("The object's kinetic energy is " + kineticEnergy + " joules.");
    }

    public static double kineticEnergy(double mass, double velocity) {
        double kineticEnergy = 0.5 * mass * velocity * velocity;
        return kineticEnergy;
    }
}
    

