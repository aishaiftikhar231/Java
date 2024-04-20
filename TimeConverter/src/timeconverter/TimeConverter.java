
package timeconverter;
import java.util.Scanner;

public class TimeConverter {

    
    public static void main(String[] args) {
        
        Scanner obj= new Scanner(System.in);
         int seconds, hours, minutes;
        System.out.println("enter the number of seconds: ");
        seconds= obj.nextInt();
        minutes = seconds / 60;
        hours = minutes / 60;
    
	
	
	int b = minutes%60;
       int c= (seconds%60);
    

                System.out.println(hours+ " "+ b+ " "+ c);
    }
    
}
