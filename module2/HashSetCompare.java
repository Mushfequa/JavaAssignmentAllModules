package module2;
/*
* Question 72
*Write a Java program to compare two sets and retain elements which are same
*on both sets. 
* 
*/
import java.util.HashSet;
import java.util.Set;

public class HashSetCompare {
	public static void main(String[] args) {
        // Create two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to the sets
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Retain elements which are same on both sets
        set1.retainAll(set2);

        // Print the elements retained in set1 after comparison
        System.out.println("Elements retained in set1 after comparison: " + set1);
    }
}
