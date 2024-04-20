/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix3x3;

import java.util.Scanner;
public class Matrix3X3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[][][] matrix = new int[3][3][3];

    Scanner inp = new Scanner(System.in);

    // Loop through each dimension, row and column of the matrix
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          System.out.print("Enter the value for element (" + i + "," + j + "," + k + "): ");
          matrix[i][j][k] = inp.nextInt();
        }
      }
    }

    // Print the matrix
    for (int i = 0; i < 3; i++) {
      System.out.println("Dimension " + i + ":");
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          System.out.print(matrix[i][j][k] + " ");
        }
        System.out.println();
      }
    }
    }
    
}
