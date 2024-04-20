/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array7;

/**
 *
 * @author hp
 */
public class Array7 {

   
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int n = 35;

        displayNumbersGreaterThanN(numbers, n);
    }

    public static void displayNumbersGreaterThanN(int[] array, int n) {
        System.out.println("Numbers greater than " + n + ":");
        for (int number : array) {
            if (number > n) {
                System.out.println(number);
            }
        }
    }
}

   
    
}
