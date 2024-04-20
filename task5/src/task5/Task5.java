
package task5;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
            Scanner inp=new Scanner(System.in);
         float diameter;
        System.out.println("enter the diameter:");
        diameter=inp.nextFloat();
        float radius=diameter/2;
        System.out.println("the radius is "+(Math.PI*radius*radius));
        System.out.println("the volume is "+(4/3*Math.PI*radius*radius*radius));
    }
    
}
