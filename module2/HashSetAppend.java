package module2;
/*
 * Question 56
 * Write a Java program to append the specified element to the end of a hash set.
 */
import java.util.HashSet;
public class HashSetAppend {
	public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add some elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Print the HashSet before appending
        System.out.println("HashSet before appending:");
        System.out.println(hashSet);

        // Append the specified element to the end of the HashSet
        String elementToAppend = "Grapes";
        hashSet.add(elementToAppend);

        // Print the HashSet after appending
        System.out.println("\nHashSet after appending:");
        System.out.println(hashSet);
    }
}
