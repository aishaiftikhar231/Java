/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19.pkg4;

/**
 *
 * @author hp
 */
public class Lab194 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telephone telephone = new SmartTelephone();

        telephone.lift(); 
        telephone.dial(); 
        telephone.disconnected();
      
        
    }
    
}
abstract class Telephone {
    public abstract void dial();
    public abstract void lift();
    public abstract void disconnected();
}
class SmartTelephone extends Telephone {
    @Override
    public void dial() {
        System.out.println("Dialing a number on a smart telephone.");
    }

    @Override
    public void lift() {
        System.out.println("Lifting the receiver on a smart telephone.");
    }

    @Override
    public void disconnected() {
        System.out.println("Smart telephone disconnected.");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet on a smart telephone.");
    }
}
