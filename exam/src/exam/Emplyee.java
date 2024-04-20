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
public class Emplyee {
    
    int idNumber;
    String name;
    String department;
    String position;
    String jobTitle;
    
    public Emplyee(int idNumber , String name , String department , String position ){
        this.idNumber=idNumber;
        this.name=name;
        this.department=department;
        this.position=position;
}
    
     public Emplyee(int idNumber , String name ){
        this.idNumber=idNumber;
        this.name=name;
        this.department="";
        this.position="";
}
     
      public Emplyee(){
        this.idNumber=0;
        this.name="";
        this.department="";
        this.position="";
}
    
    public String getName(){
    return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
       public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}