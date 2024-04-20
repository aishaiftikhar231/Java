
package task1;

import java.util.Scanner;
public class Task1 {

 
    public static void main(String[] args) {
       
        
        Scanner inp =new Scanner(System.in);
        //task1
        final int number=2;
        final int score1=100;
        final int score2=95;
        final int boilingInF =98;
        int fToc;   
        double average;
        String output;
       
        average=(score1+score2)/number;
        output=score1+ " and "+score2+" have an average of "+average;
          System.out.println(output);
        
          
         fToc=((boilingInF -32)*5/9);
        output=boilingInF+"in fahrenheit is "+fToc+" in celsius";
        System.out.println(output);
       
        System.out.println();
        
    }
}
