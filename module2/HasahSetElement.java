package module2;
/*
 *  Question 58
 * Write a Java program to get the number of elements in a hash set. 
 */
import java.util.HashSet;

public class HasahSetElement {
	public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add some elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Get the number of elements in the HashSet
        int size = hashSet.size();

        // Print the number of elements in the HashSet
        System.out.println("Number of elements in the HashSet: " + size);
    }
}
