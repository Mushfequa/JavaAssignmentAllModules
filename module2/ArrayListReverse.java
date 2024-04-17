package module2;
/*
 * Question 61
 * Write a Java program to reverse elements in an array list. 
 */
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
	public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");

        // Print the ArrayList before reversing
        System.out.println("ArrayList before reversing:");
        System.out.println(arrayList);

        // Reverse the elements in the ArrayList
        Collections.reverse(arrayList);

        // Print the ArrayList after reversing
        System.out.println("\nArrayList after reversing:");
        System.out.println(arrayList);
    }
}
