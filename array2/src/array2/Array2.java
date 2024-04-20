/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author hp
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] countryNames = {"Country1", "Country2", "Country3", "Country4", "Country5", "Country6", "Country7", "Country8", "Country9", "Country10", "Country11", "Country12"};
        int[] populations = {1000000, 2000000, 3000000, 4000000, 5000000, 6000000, 7000000, 8000000, 9000000, 10000000, 11000000, 12000000};

        for (int i = 0; i < countryNames.length; i++) {
            System.out.println("Country: " + countryNames[i]);
            System.out.println("Population: " + populations[i]);
            System.out.println();
        }
    }
}

    
    
}
