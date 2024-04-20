
package labtech;
import java.util.Scanner;

public class LabTech {

   
    public static void main(String[] args) {
       
        Scanner obj= new Scanner (System.in);
        float temp;
        System.out.println("Enter the temp: ");
        temp=obj.nextFloat();
        
        while(temp<102.5){
            
            System.out.println("Turn down thermostat. wait 5 mins. check again )");
             System.out.println("Enter the temp: ");
             temp=obj.nextFloat();
            
        }
        System.out.println("Temp is acceptable. check again after 15 mins");
    }
    
}
