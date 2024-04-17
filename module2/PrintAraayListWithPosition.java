package module2;
/*
 *  Question 71
 * Write a Java program to print all the elements of an Array List using the
 *  position of the elements. 
 * 
 */
import java.util.ArrayList;
public class PrintAraayListWithPosition {
	 public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<String> arrayList = new ArrayList<>();

	        // Add some elements to the ArrayList
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        arrayList.add("Grapes");

	        // Print all elements with their positions
	        System.out.println("Elements of ArrayList with their positions:");
	        for (int i = 0; i < arrayList.size(); i++) {
	            System.out.println("Position " + i + ": " + arrayList.get(i));
	        }
	    }
}
