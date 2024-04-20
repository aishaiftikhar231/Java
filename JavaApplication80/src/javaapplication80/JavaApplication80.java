/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication80;

/**
 *
 * @author hp
 */
public class JavaApplication80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic class EmployeePayDemo {
    
        int[] employeeIDs = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        double[] grossPay = {1000.0, 1500.0, 1200.0, 2000.0, 1800.0, 1600.0, 1400.0, 1700.0, 1300.0, 1900.0};

        for (int i = 0; i < employeeIDs.length; i++) {
            System.out.println("Employee ID: " + employeeIDs[i]);
            System.out.println("Gross Pay: $" + grossPay[i]);
            System.out.println();
        }
    }
}

    
    
}
