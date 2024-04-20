
package pkgswitch;
import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
        
         Scanner inp=new Scanner(System.in);
         char icecream;
         System.out.println("enter a numb to chose an ice cream flavor");
         icecream= inp.next().charAt(0);
         
         switch(icecream){
             
             case 'a':
                 System.out.println("you chose choclate. you have good taste");
                 break;
             case 'b':
                 System.out.println("vinella is disguting");
                 break;
             case 'c':
                 System.out.println("strawberry doesnt deserve to be a flavor");
                 break;
             default:
                 System.out.println("you chose a flavor other than choclate. no icecream .sorry u cant have it!");
         }
                 
        
        
    }
    
}
