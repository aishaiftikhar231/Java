
package matric;
import java.util.Scanner;
public class Matric {

   
    public static void main(String[] args) {
        
        // Take input for a 3x3 matrix
    int[][] matrix3x3 = new int[3][3];

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the values for a 3x3 matrix:");

    // Loop through each row and column of the matrix
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("Enter the value for element (" + i + "," + j + "): ");
        matrix3x3[i][j] = input.nextInt();
      }
    }

    // Print the 3x3 matrix
    System.out.println("The 3x3 matrix is:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(matrix3x3[i][j] + " ");
      }
      System.out.println();
    }

    // Take input for a 4x4 matrix
    int[][] matrix4x4 = new int[4][4];

    System.out.println("Enter the values for a 4x4 matrix:");

    // Loop through each row and column of the matrix
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print("Enter the value for element (" + i + "," + j + "): ");
        matrix4x4[i][j] = input.nextInt();
      }
    }

    // Print the 4x4 matrix
    System.out.println("The 4x4 matrix is:");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(matrix4x4[i][j] + " ");
      }
      System.out.println();
    }
  }
  }
        
    
    

