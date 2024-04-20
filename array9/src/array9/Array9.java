/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array9;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Array9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereimport java.util.Arrays;

        String[] girlsNames = {
            "Emma", "Olivia", "Ava", "Isabella", "Sophia",
            "Mia", "Charlotte", "Amelia", "Harper", "Evelyn",
            "Abigail", "Emily", "Elizabeth", "Mila", "Ella",
            "Avery", "Sofia", "Camila", "Aria", "Scarlett"
        };

        String[] boysNames = {
            "Liam", "Noah", "Oliver", "William", "Elijah",
            "James", "Benjamin", "Lucas", "Henry", "Alexander",
            "Mason", "Michael", "Ethan", "Daniel", "Jacob",
            "Logan", "Jackson", "Levi", "Sebastian", "Mateo"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a boy's name: ");
        String boyName = scanner.nextLine();
        System.out.print("Enter a girl's name: ");
        String girlName = scanner.nextLine();

        boolean foundBoySequential = sequentialSearch(boysNames, boyName);
        boolean foundGirlSequential = sequentialSearch(girlsNames, girlName);

        boolean foundBoyBinary = binarySearch(boysNames, boyName);
        boolean foundGirlBinary = binarySearch(girlsNames, girlName);

        System.out.println("---Sequential Search---");
        System.out.println("Boy's name " + (foundBoySequential ? "found" : "not found"));
        System.out.println("Girl's name " + (foundGirlSequential ? "found" : "not found"));

        System.out.println("---Binary Search---");
        System.out.println("Boy's name " + (foundBoyBinary ? "found" : "not found"));
        System.out.println("Girl's name " + (foundGirlBinary ? "found" : "not found"));
    }

    public static boolean sequentialSearch(String[] array, String key) {
        for (String element : array) {
            if (element.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(String[] array, String key) {
        Arrays.sort(array);
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = key.compareTo(array[mid]);
            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}

    }
    
}
