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
public class Student  extends Person {
    private int studentId;
    
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    
    public int getStudentId() {
        return studentId;
    }
}
    

