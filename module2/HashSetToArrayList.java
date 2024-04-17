package module2;
/*
 * Question 67
 * Write a Java program to convert a hash set to a List/Array List. 
 * 
 */
import java .util.HashSet;
import java .util.ArrayList;
import java .util.List;

public class HashSetToArrayList {
	public static void main(String[] args){

		//create hashSet
		HashSet<String>hashSet= new HashSet<>();

		//Add elements to the hashSet
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Cherry");
		hashSet.add("Orange");
		// Convert HashSet to List
        List<String> list = new ArrayList<>(hashSet);

        // Print the converted List
        System.out.println("Converted List:");
        System.out.println(list);
		}
		}

