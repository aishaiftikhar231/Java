
package creatingclass;


public class Student {
    public String Name;
    public int Marks;
    public double GPA;
    
    public void setvalues(String name,int marks)
    {
        Name=name;
        Marks=marks;
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
    public void showvalues(){
        System.out.println("student's detail");
        System.out.println("name: "+Name);
        System.out.println("marks :"+Marks);
        System.out.println("GPA: "+GPA);
    }
    
}
