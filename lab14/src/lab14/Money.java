/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/**
 *
 * @author hp
 */
public class Money {
    
    public Money(){
        if(amount<0){
            System.out.println("not allowed");
            System.exit(0);
        }
        else{
            long allCents = Math.round(amount*100);
            dollars = allCents/100;
            cents = allCents%100;
            
        }
    }
        public Money add(Money otherAmount){
            
        }
        
        
    
    
    
}
