
package salestax;
import java.util.Scanner;

public class SalesTax {

    
    public static void main(String[] args) {
        
        
        
		final double TAX_RATE = 0.055;
		double price;
		double tax;
		double total;
		String item;

		
		Scanner keyboard = new Scanner(System.in);

		
		System.out.println("Item description:  ");
		item = keyboard.nextLine();
		System.out.println("Item price:  $");
		price = keyboard.nextDouble();
		
		
		tax = price * TAX_RATE;
		total = price + tax;
		
		//display results
		System.out.print(item );
		System.out.println("  " + price + " $");
		System.out.println("The tax rate is : "+ TAX_RATE   +   "  $");
		System.out.println("The tax will be: " + tax);
		System.out.print("Total: " + total +      " $");
		
    }
    
}
