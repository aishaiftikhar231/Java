
package charmethod;

public class CharMethod {

    public static void main(String[] args) {
       
        
          String str = "New York";
        int position = 2;
        showChar(str, position);
    }

    public static void showChar(String str, int position) {
        char ch = str.charAt(position);
        System.out.println("Character at position " + position + " is: " + ch);
    }
    }
    

