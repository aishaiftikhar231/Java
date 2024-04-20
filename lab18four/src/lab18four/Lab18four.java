/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18four;

/**
 *
 * @author hp
 */
public class Lab18four {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Manager manager = new Manager("John Doe", 5000, 2000);
        System.out.println("Manager's salary: " + manager.calculateSalary());  // Output: Manager's salary: 7000.0
        
        Programmer programmer = new Programmer("Jane Smith", 4000, 10, 25);
        System.out.println("Programmer's salary: " + programmer.calculateSalary());  // Output: Programmer's salary: 4250.0
    }
    
}
