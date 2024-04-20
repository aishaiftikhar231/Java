
package task4;
import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        
        
        Scanner inp=new Scanner(System.in);
         String firstname;
        String lastname;
        System.out.println("enter your first name:");
        firstname=inp.nextLine();
        System.out.println("enter your last name:");
        lastname=inp.nextLine();
        
        System.out.println("first alphabet: "+firstname.charAt(0));
      
        System.out.println(" conver upper case: " + lastname.toUpperCase());
        
    }
    
}
