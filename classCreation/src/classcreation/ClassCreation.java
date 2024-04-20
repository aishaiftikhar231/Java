
package classcreation;

public class ClassCreation {

    
    public static void main(String[] args) {
        
         areaCal sq = new areaCal();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
    
}
