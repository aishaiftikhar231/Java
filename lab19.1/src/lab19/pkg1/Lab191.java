/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19.pkg1;

/**
 *
 * @author hp
 */
public class Lab191 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Pen pen = new BallpointPen();
        pen.write();  // Invoke the write() method of the BallpointPen class
        pen.refill();
        
        
          Pen pen1 = new BallpointPen();
        pen1.write();
        pen1.refill();

        Pen pen2 = new FountainPen();
        pen2.write();
        pen2.refill();
        ((FountainPen) pen2).changeNib();
    }
    
}
abstract class Pen {
    public abstract void write();
    public abstract void refill();
}
class BallpointPen extends Pen {
    @Override
    public void write() {
        System.out.println("Writing with a ballpoint pen.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling a ballpoint pen.");
    }
}

class FountainPen extends Pen {
    @Override
    public void write() {
        System.out.println("Writing with a fountain pen.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling a fountain pen.");
    }

    public void changeNib() {
        System.out.println("Changing the nib of a fountain pen.");
    }
}

