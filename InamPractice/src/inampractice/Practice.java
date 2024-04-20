
package inampractice;




public class Practice {
    public int Marks;
public String name;
public double GPA;
    
public  void setv(int m, String n) {
    Marks=m;
    name=n;
         
}
    


public double calgpa(){
        if(Marks>=87)
            GPA=4.0;
        else if(Marks>80&&Marks<=86)
            GPA=3.5;
        else
            GPA=3.0;
        return GPA;
    }



public void ChangeGpa(){

    System.out.println("your name is: " + name);
    System.out.println("ima change gpa : ");
    
    GPA= GPA*(.5);
    System.out.println("New GPA: "+ GPA);
    
    

}
}