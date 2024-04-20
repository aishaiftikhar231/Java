
package retailpricecal;

import java.util.Scanner;

public class RetailPriceCal {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Enter the item's wholesale cost: ");
        double wholesaleCost = input.nextDouble();

        System.out.print("Enter the item's markup percentage: ");
        double markupPercentage = input.nextDouble();

        double retailPrice = Retail(wholesaleCost, markupPercentage);

        System.out.printf("The item's retail price is: %.2f", retailPrice);
    }

    public static double Retail(double wholesaleCost, double markupPercentage) {
        double markupAmount = (markupPercentage / 100) * wholesaleCost;
        double retailPrice = wholesaleCost + markupAmount;
        return retailPrice;
    }
}






    
    

