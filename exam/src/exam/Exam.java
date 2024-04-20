/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author hp
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Emplyee emp1=new Emplyee(1234, "John Doe", "HR", "manager");
        Emplyee emp2=new Emplyee(234, "Aisha");
        Emplyee emp3=new Emplyee();
        
        emp2.setDepartment("marketing");
        emp2.setPosition("jsj");
        
         emp3.setName("Mike Johnson");
        emp3.setIdNumber(54321);
        emp3.setDepartment("Finance");
        emp3.setPosition("Accountant");
        
        System.out.println("Employe1 ");
        
        System.out.println("name"+ emp1.getName());
        System.out.println("name"+ emp1.getPosition());
        System.out.println("name"+ emp1.getIdNumber());
        System.out.println("name"+ emp1.getDepartment());
        
        
        
        
        
        
        
    }
    
}
