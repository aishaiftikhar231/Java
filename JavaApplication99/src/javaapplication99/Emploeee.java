/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication99;

/**
 *
 * @author hp
 */
public class Emploeee {
    
    String name;
    int IdNum;
    String dep;
    String pos;
    String jobTitle;
    
     Emploeee (String name, int IdNum, String dep, String pos, String jobTitle){
        
          this.name=name;
       this.IdNum=IdNum;
       this.dep=dep;
      this.pos=pos;
      this.jobTitle=jobTitle;
         
    }
    
     
      Emploeee (String name, int IdNum){
        
          this.name=name;
       this.IdNum=IdNum;
       this.dep="";
      this.pos="";
      this.jobTitle="";
         
    }
      
      public Emploeee() {
        this.name = "";
        this.IdNum = 0;
        this.dep = "";
        this.pos= "";
    }

       public String getName() {
        return name;
    }

    public int getIdNumber() {
        return IdNum;
    }

    public String getDepartment() {
        return dep;
    }

    public String getPosition() {
        return pos;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.IdNum = idNumber;
    }

    public void setDepartment(String department) {
        this.dep = department;
    }

    public void setPosition(String position) {
        this.pos = position;
    }
}
