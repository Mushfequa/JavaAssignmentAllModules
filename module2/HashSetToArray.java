package module2;
/*
 * Question 66
 * Write a Java program to convert a hash set to an array. 
 * 
 */
import java .util.HashSet;
import java .util.Arrays;
public class HashSetToArray {
	public static void main(String[] args){

		//create hashSet
		HashSet<String>hashSet= new HashSet<>();

		//Add elements to the hashSet
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Cherry");
		hashSet.add("Orange");
		 // Convert HashSet to array
        String[] array = hashSet.toArray(new String[hashSet.size()]);

        // Print the converted array
        System.out.println("Converted Array:");
        for (String element : array) {
            System.out.println(element);
		 
		}
		}
}
