
package decinloop;

import java.util.Scanner;

public class DecInLoop {
 
    public static void main(String[] args) {
        
        Scanner obj= new Scanner(System.in);
        System.out.println("enter a numb and i will dec till 0");
        int numb;
        numb= obj.nextInt();
        
        while(numb>0){
            
            System.out.println("Numb: "+ numb);
            numb--;
        }
    }
    
}
