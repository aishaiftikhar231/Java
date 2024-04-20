
package arary6;

/**
 *
 * @author hp
 */
public class Arary6 {

   
    public static void main(String[] args) {
        // Create a two-dimensional array with test data
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Demonstrate the methods
        System.out.println("Total: " + getTotal(array));
        System.out.println("Average: " + getAverage(array));
        System.out.println("Row Total (row 1): " + getRowTotal(array, 1));
        System.out.println("Column Total (column 2): " + getColumnTotal(array, 2));
        System.out.println("Highest in Row (row 0): " + getHighestInRow(array, 0));
        System.out.println("Lowest in Row (row 2): " + getLowestInRow(array, 2));
    }

    // Get the total of all values in the array
    public static int getTotal(int[][] array) {
        int total = 0;
        for (int[] row : array) {
            for (int value : row) {
                total += value;
            }
        }
        return total;
    }

    // Get the average of all values in the array
    public static double getAverage(int[][] array) {
        int total = getTotal(array);
        int count = array.length * array[0].length;
        return (double) total / count;
    }

    // Get the total of values in a specific row of the array
    public static int getRowTotal(int[][] array, int row) {
        int total = 0;
        for (int value : array[row]) {
            total += value;
        }
        return total;
    }

    // Get the total of values in a specific column of the array
    public static int getColumnTotal(int[][] array, int column) {
        int total = 0;
        for (int[] row : array) {
            total += row[column];
        }
        return total;
    }

    // Get the highest value in a specific row of the array
    public static int getHighestInRow(int[][] array, int row) {
        int highest = Integer.MIN_VALUE;
        for (int value : array[row]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    // Get the lowest value in a specific row of the array
    public static int getLowestInRow(int[][] array, int row) {
        int lowest = Integer.MAX_VALUE;
        for (int value : array[row]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }
}

    }
    

