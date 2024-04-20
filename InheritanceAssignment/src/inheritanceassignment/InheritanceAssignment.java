/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceassignment;

/**
 *
 * @author hp
 */
public class InheritanceAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
          // Create a student object and a teacher object
        Student student = new Student("Aisha", 19, 123636);
        Teacher teacher = new Teacher("Maam Dur e Shehwar", 30, "Programming");
        
        // Print out the information for the student and teacher
        System.out.println("Student: " + student.getName() + ", age " + student.getAge() + ", ID " + student.getStudentId());
        System.out.println("Teacher: " + teacher.getName() + ", age " + teacher.getAge() + ", subject " + teacher.getSubject());
    }
    
}
