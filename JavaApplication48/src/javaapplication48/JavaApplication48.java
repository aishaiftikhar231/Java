
package javaapplication48;

/**
 *
 * @author hp
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          // TODO code application logic here
        Employee e1=new Employee("fatima",2,"cs","head");
        Employee e2=new Employee("aisha",3,"se","programer");
        Employee e3=new Employee("farah",7,"it","web developer");
        
        System.out.println("name\t\tidnumber\t\tdepartment\t\tjobtitle");
        
        e1.getemployeeinfo();
        e2.getemployeeinfo();
        e3.getemployeeinfo();
        
       
    }
    
}
