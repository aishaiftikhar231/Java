/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

/**
 *
 * @autho
 */

import java.util.Random;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeRegExp;

public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int random;
        int user;
        Random r= new Random();
        Scanner obj=new Scanner(System.in);
        random= r.nextInt();
                
        
        System.out.println("enter num");
        user=obj.nextInt();
        
        while (random!=user){
            if (random>user){
                System.out.println("too high");}
                else
                System.out.println("too low");
                
                
            }
            System.out.println("Right guess");
        }
        
    }
    
}
