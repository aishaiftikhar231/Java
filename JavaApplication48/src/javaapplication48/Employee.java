/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

/**
 *
 * @author hp
 */
public class Employee {
      String name;
    int idnumber;
    String department;
    String position;
    
////    public Employee()
////    {
////        name="";
////        idnumber=0;
////        position="";
////        department="";
////    }
   
    public Employee(String n, int id)
   {
        name=n ;
        idnumber=id;
       
   }
    
    public Employee(String n, int id, String d, String p)
    {
        name=n;
        idnumber=id;
        position=p;
        department=d;
        
    }
    
    
    public void getemployeeinfo()
    {
        
        System.out.println(name+"\t\t"+idnumber+"\t\t\t"+department+"\t\t\t"+position);
    }
    
    
}
