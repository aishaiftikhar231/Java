/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab204;

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class Lab204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        
        int[][] grades=new int[3][2];
        int rows=grades.length;
        int cols=grades[0].length;
        int total=0;
        int countelements=rows*cols;
        double avg;
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println("enter the grade ");
                grades[i][j]=inp.nextInt();
                total=grades[i][j]+total;
            }
        
    }
        System.out.println("total "+total);
        System.out.println("total elememts "+countelements);
        avg=total/countelements;
        avg=Math.round(avg);
       System.out.println("the average is "+avg);
    
}
}
