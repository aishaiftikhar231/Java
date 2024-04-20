
package udemypractice;

public class Student {
    
    int id;
    int marks;
    int marks2;
    
    
    Student(int m, int m2, int i){
         this.id=id;
         this.marks=marks;
        this.marks2=marks2;
        
    
    }
    public int add(){
        return marks+ marks2;
    
}
    
    public void display(){
        System.out.println("displaying id "+ id);
    }
}