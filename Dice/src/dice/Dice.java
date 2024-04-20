
package dice;

import java.util.Random; 
public class Dice {

    public static void main(String[] args) {
    int a;
    int b;
    
    
    int roll1=0;
    int roll2=0;
    int roll3=0;
    int roll4=0;
    int roll5=0;
    int roll6=0;
    
    Random rand= new Random();
   for(int n=0; n<=10000;n++){
       
       a= rand.nextInt(6);
       
       b= rand.nextInt(6);
       
       
       if(a==b){
           if (a==1)
               roll1++;
           else if (a==2)
              roll2++;
           else if (a==3)
               roll3++;
           else if (a==4)
              roll4++;
           else if (a==5)
               roll5++;
           else if (a==6)
               roll6++;
           
       }
       
       
   }
   
       System.out.println("number of time dice gave a pair of 1: " + roll1);
       System.out.println("number of time dice gave a pair of 2: " + roll2);
       System.out.println("number of time dice gave a pair of 3: " + roll3);
       System.out.println("number of time dice gave a pair of 4: " + roll4);
       System.out.println("number of time dice gave a pair of 5: " + roll5);
       System.out.println("number of time dice gave a pair of 6: " + roll6);
}
}