package module2;
/*
 * Question 54
 *Write a Java program to copy one array list into another 
 */

import java .util.ArrayList;

public class ArrayListCopy {
	public static void main(String[] args){

		 // Create the source ArrayList
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Orange");

        // Create the destination ArrayList
        ArrayList<String> destinationList = new ArrayList<>();

        // Copy elements from sourceList to destinationList
        for (String element : sourceList) {
            destinationList.add(element);
        }

        // Print the sourceList
        System.out.println("Source ArrayList:");
        for (String element : sourceList) {
            System.out.println(element);
        }

        // Print the destinationList
        System.out.println("\nDestination ArrayList (after copying):");
        for (String element : destinationList) {
            System.out.println(element);
        }
    }
}
