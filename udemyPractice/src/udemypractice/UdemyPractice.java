
package udemypractice;

public class UdemyPractice {

    
    public static void main(String[] args) {
        // TODO code application logic here
       
        
       
        
        Maths m= new Maths();
        m.multiply(5,5);
        
        m.multiply(4,8);
        m.multiply(2, 6, 6);
        
        Student s= new Student(56, 67, 33);
        
        s.display();
        System.out.println(""+s.add());
        
        
        
        
    }
    
}
