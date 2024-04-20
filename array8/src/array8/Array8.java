/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array8;

/**
 *
 * @author hp
 */
public class Array8 {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Total: " + getTotal(array));
        System.out.println("Average: " + getAverage(array));
        System.out.println("Highest: " + getHighest(array));
        System.out.println("Lowest: " + getLowest(array));
    }

    public static int getTotal(int[] array) {
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }

    public static double getAverage(int[] array) {
        int total = getTotal(array);
        return (double) total / array.length;
    }

    public static int getHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static int getLowest(int[] array) {
        int lowest = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }
}

    }
    
}
