/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array4;

/**
 *
 * @author hp
 */
public class Array4 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        int[][] grades = new int[30][10]; // Declaring a 2D array with 30 rows and 10 columns

        // Populate the grades array with some values (example)
        // Replace this with your actual data
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 10; j++) {
                grades[i][j] = (i + 1) * (j + 1);
            }
        }

        int sum = 0;
        int totalElements = grades.length * grades[0].length;

        // Calculate the sum of all elements
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
        }

        // Calculate the average
        double average = (double) sum / totalElements;

        System.out.println("Average of all elements: " + average);
    }
}

        // TODO code application logic here
    }
    

