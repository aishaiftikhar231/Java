
package possum;
import java.util.Scanner;
public class PosSum {

   
    public static void main(String[] args) {
        
        
        Scanner obj=new Scanner(System.in);
        
        int numb=1;
        
        int sum=0;
        while( numb>0){
            
            System.out.println("Enter a numb: ");
            numb= obj.nextInt();
            if(numb<0){
                break;
            }
            sum=sum+numb;
            
        }
        System.out.println("the sum is: "+ sum);
    }
    
}
