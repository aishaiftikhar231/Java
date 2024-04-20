
package creatingclass;


public class CreatingClass {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1=new Student();
        Student s2=new Student();
        
        s1.setvalues("ahmad",88);
        s2.setvalues("faisal",85);
        
        s1.calgpa();
        s2.calgpa();
        
        s1.showvalues();
        s2.showvalues();
    }
    
}
