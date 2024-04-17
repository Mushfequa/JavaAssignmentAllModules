package module2;
/*
 * Question 59
 * • Write a Java program to associate the specified value with the specified 
 * key in a Hash Map. 
 * 
 */
import java.util.HashMap;
public class HashMapExample {
	public static void main(String [] args){
		HashMap <String,Integer> hashMap= new HashMap<>();

		//Add key-value mapping to the map
		hashMap.put("One",1);
		hashMap.put("Two",2);
		hashMap.put("Three",3);
		hashMap.put("Four",4);

		// print the HashMap before associating a new value
		 System.out.println("HashMap before associating a new value:");
		  System.out.println(hashMap);
		  
		//Associate a new value with the specified key
		String key="Four";
		int value=4;
		hashMap.put(key,value);

		// print the HashMap after associating a new value
		 System.out.println("HashMap after associating a new value:");
		  System.out.println(hashMap);
		}
}
