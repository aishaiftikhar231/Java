
package paintjobestimator;
import java.util.Scanner;

public class PaintJobEstimator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rooms to be painted: ");
        int numRooms = scanner.nextInt();

        System.out.print("Enter the price of paint per gallon: ");
        double paintPrice = scanner.nextDouble();

        int totalSqFt = 0;

        for (int i = 1; i <= numRooms; i++) {
            System.out.print("Enter the square feet of wall space in room " + i + ": ");
            int roomSqFt = scanner.nextInt();
            totalSqFt += roomSqFt;
        }

        int gallons = calculateGallons(totalSqFt);
        double laborHours = calculateLaborHours(totalSqFt);
        double paintCost = calculatePaintCost(gallons, paintPrice);
        double laborCost = calculateLaborCost(laborHours);
        double totalCost = calculateTotalCost(paintCost, laborCost);

        System.out.println("Number of gallons of paint required: " + gallons);
        System.out.println("Hours of labor required: " + laborHours);
        System.out.println("Cost of the paint: $" + paintCost);
        System.out.println("Labor charges: $" + laborCost);
        System.out.println("Total cost of the paint job: $" + totalCost);
    }

    public static int calculateGallons(int sqFt) {
        int gallons = sqFt / 115;
        if (sqFt % 115 != 0) {
            gallons++;
        }
        return gallons;
    }

    public static double calculateLaborHours(int sqFt) {
        return ((double) sqFt / 115) * 8;
    }

    public static double calculatePaintCost(int gallons, double paintPrice) {
        return gallons * paintPrice;
    }

    public static double calculateLaborCost(double laborHours) {
        return laborHours * 18.0;
    }

    public static double calculateTotalCost(double paintCost, double laborCost) {
        return paintCost + laborCost;
    }
}