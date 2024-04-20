
package task7;
import java.util.Scanner;


public class Task7 {

    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
     
       float miles;
        float gallons;
        double MPG;
        System.out.println("enter the miles driven");
        miles=inp.nextFloat();
        System.out.println("enter the gallons used :");
        gallons=inp.nextFloat();
       
        MPG=miles/gallons;
        System.out.println("the MPG is "+MPG);
    }
    
}
