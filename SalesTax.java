//This program calculates the total price which includes sales tax
//solution

import java.util.Scanner;

public class SalesTax
{
	public static void main(String[] args)
	{
		//identifier declarations
		final double TAX_RATE = 0.055;
		double price;
		double tax;
		double total;
		String item;

		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);

		//display prompts and get input
		System.out.println("Item description:  ");
		item = keyboard.nextLine();
		System.out.println("Item price:  $");
		price = keyboard.nextDouble();
		
		//calculations
		tax = price * TAX_RATE;
		total = price + tax;
		
		//display results
		System.out.print(item + "        $");
		System.out.println(price);
		System.out.println(TAX_RATE   +     "$");
		System.out.println(tax);
		System.out.print("Total: " + total +      " $");
		System.out.println(total);
	}
}