/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array5;

/**
 *
 * @author hp
 */
 import java.util.Arrays;
    import java.util.Scanner;
public class Array5 {

  


    public static void main(String[] args) {
        String[] boysNames = {"Adam", "Benjamin", "Christopher", "Daniel", "Ethan", "Frank", "George", "Henry", "Isaac", "Jack", "Kevin", "Liam", "Michael", "Nathan", "Oliver", "Patrick", "Quentin", "Robert", "Samuel", "Thomas"};
        String[] girlsNames = {"Abigail", "Bella", "Charlotte", "Danielle", "Emily", "Fiona", "Grace", "Hannah", "Isabella", "Jessica", "Kayla", "Lily", "Mia", "Natalie", "Olivia", "Penelope", "Quinn", "Rachel", "Sophia", "Taylor"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boy's name: ");
        String boyName = scanner.nextLine();

        System.out.print("Enter a girl's name: ");
        String girlName = scanner.nextLine();

        System.out.println();

        // Sequential search for boy's name
        boolean foundBoy = false;
        long startTime = System.currentTimeMillis();
        for (String name : boysNames) {
            if (name.equalsIgnoreCase(boyName)) {
                foundBoy = true;
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        long sequentialSearchTimeBoy = endTime - startTime;

        // Sequential search for girl's name
        boolean foundGirl = false;
        startTime = System.currentTimeMillis();
        for (String name : girlsNames) {
            if (name.equalsIgnoreCase(girlName)) {
                foundGirl = true;
                break;
            }
        }
        endTime = System.currentTimeMillis();
        long sequentialSearchTimeGirl = endTime - startTime;

        // Binary search for boy's name
        Arrays.sort(boysNames);
        startTime = System.currentTimeMillis();
        int boyIndex = Arrays.binarySearch(boysNames, boyName);
        boolean foundBoyBinary = boyIndex >= 0;
        endTime = System.currentTimeMillis();
        long binarySearchTimeBoy = endTime - startTime;

        // Binary search for girl's name
        Arrays.sort(girlsNames);
        startTime = System.currentTimeMillis();
        int girlIndex = Arrays.binarySearch(girlsNames, girlName);
        boolean foundGirlBinary = girlIndex >= 0;
        endTime = System.currentTimeMillis();
        long binarySearchTimeGirl = endTime - startTime;

        // Print search results
        System.out.println("Sequential Search Results:");
        if (foundBoy) {
            System.out.println("Boy's name found in the array.");
        } else {
            System.out.println("Boy's name not found in the array.");
        }
        if (foundGirl) {
            System.out.println("Girl's name found in the array.");
        } else {
            System.out.println("Girl's name not found in the array.");
        }
        System.out.println();

        System.out.println("Binary Search Results:");
        if (foundBoyBinary) {
            System.out.println("Boy's name found in the array.");
        } else {
            System.out.println("Boy's name not found in the array.");
        }
        if (foundGirlBinary) {
            System.out.println("Girl's name found in the array.");
        } else {
            System.out.println("Girl's name not found in the array.");
        }
        System.out.println();

        System.out.println("Sequential Search Time (Boy's Name): " + sequentialSearchTimeBoy +

    }
    

